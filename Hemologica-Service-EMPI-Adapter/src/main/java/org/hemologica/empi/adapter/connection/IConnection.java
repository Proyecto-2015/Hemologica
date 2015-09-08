package org.hemologica.empi.adapter.connection;

import java.io.IOException;
import java.net.UnknownHostException;


public interface IConnection {

	public void connect() throws UnknownHostException, IOException;

	public void disconnect() throws IOException;

	public boolean isConnected();

	public void listen() throws IOException;

	public String receiveMessage() throws Exception;

	public String receiveResponse() throws Exception;

	public String sendMessage(String message, boolean waitResponse) throws Exception;
	
}


