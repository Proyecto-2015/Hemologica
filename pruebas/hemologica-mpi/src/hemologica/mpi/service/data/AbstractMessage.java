package hemologica.mpi.service.data;

import java.io.Serializable;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class AbstractMessage implements Serializable{

	private HashMap<String, String> attributes;

	public AbstractMessage(){
		attributes = new HashMap<String, String>();
	}
	
	public HashMap<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(HashMap<String, String> attributes) {
		this.attributes = attributes;
	}
}
