package org.hemologica.datatypes;

public class DataCity {
	
	private String code;
	private String name;
	private Integer id;
	
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
		
		if(obj != null && obj instanceof DataCity){
			if(((DataCity)obj).getCode() == null){
				return false;
			}
			return ((DataCity)obj).getCode().equals(this.getCode());
		}
		return super.equals(obj);
	}
}
