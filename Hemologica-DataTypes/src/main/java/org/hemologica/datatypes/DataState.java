package org.hemologica.datatypes;

public class DataState {
	
	private Integer id;
	private String code;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof DataState){
			
			return((DataState)obj).getCode().equals(this.getCode());
			
		}
		return super.equals(obj);
	}
}
