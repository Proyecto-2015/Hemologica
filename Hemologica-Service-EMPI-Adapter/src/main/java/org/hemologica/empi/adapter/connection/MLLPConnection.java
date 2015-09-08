package org.hemologica.empi.adapter.connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import ca.uhn.hl7v2.llp.HL7Reader;
import ca.uhn.hl7v2.llp.HL7Writer;
//import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;

public class MLLPConnection implements IConnection {

	private MinLowerLayerProtocol protocol;
	private Socket client = null;
	private ServerSocket listener = null;
	private String host = null;
	private int port = -1;

	public MLLPConnection(String host, int port) {
		this.protocol = new MinLowerLayerProtocol();
		this.host = host;
		this.port = port;
	}

	public void connect() throws UnknownHostException, IOException {
		if (!isConnected()) {
			if ((host != null) && (port != -1)) {
				client = new Socket(host, port);
			}
		}
	}

	public void disconnect() throws IOException {
		try {
			if (client != null) {
				client.close();
			}
		} finally {
			client = null;
		}
	}

	public boolean isConnected() {
		return (client == null ? false : client.isConnected());
	}

	public void listen() throws IOException {
		this.listener = new ServerSocket(this.port);
		disconnect();
		this.client = this.listener.accept();
	}

	public String receiveMessage() throws Exception {
		listen();
		InputStream networkStream = client.getInputStream();
		HL7Reader reader = protocol.getReader(networkStream);
		return reader.getMessage();

	}

	public String receiveResponse() throws Exception {
		InputStream networkStream = client.getInputStream();
		HL7Reader reader = protocol.getReader(networkStream);
		return reader.getMessage();
	}

	public String sendMessage(String message, boolean waitResponse) throws Exception {

		OutputStream networkStream = client.getOutputStream();
		HL7Writer writer = protocol.getWriter(networkStream);
		
		try {
			
			writer.writeMessage(message);
			if(waitResponse){
				return receiveResponse();
			}
			return null;
			
		} finally {
			networkStream.close();
			writer.close();
		}

	}

}
