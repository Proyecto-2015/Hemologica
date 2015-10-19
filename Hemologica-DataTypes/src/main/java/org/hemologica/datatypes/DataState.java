package org.hemologica.datatypes;

public class DataState {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof DataState){
			
			return((DataState)obj).getId()== this.id;
			
		}
		return super.equals(obj);
	}
}
