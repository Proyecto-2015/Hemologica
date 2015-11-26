package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hemologica.empi.datatypes.Identifier;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.datatype.CX;
import ca.uhn.hl7v2.model.v25.message.RSP_K21;

public class PDQQueryPatientResponse extends AbstractResponse implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2032817650126149358L;
	/**
	 * The key is the domain of the identifier
	 */
	private Map<String, List<Identifier>> identifiers;
	
	public PDQQueryPatientResponse(Map<String, String> values) {
		super(values);
		identifiers = new HashMap<String, List<Identifier>>();
		this.addIdentifier(values.get("identifier"), values.get("identifier"));
	}
	
	@Override
	public void load(Message msg){
		super.load(msg);
		/**
		 * load identifiers map
		 */
		System.out.print("RSP_K21: "+ msg.getClass().getName());
		RSP_K21 resp = (RSP_K21) msg;
		CX[] cx = resp.getQUERY_RESPONSE().getPID().getPatientIdentifierList();
		List<Identifier> ids_domain;
		String identifier;
		String domain;
		for(CX id : cx){
			domain = id.getCx4_AssigningAuthority().getHd1_NamespaceID().toString();
			identifier = id.getCx1_IDNumber().toString();
			ids_domain = this.identifiers.get(domain);
			if(ids_domain == null){
				ids_domain = new ArrayList<Identifier>();
			}
			ids_domain.add(new Identifier(identifier, domain));
			this.identifiers.put(domain, ids_domain);
		}
		
	}
	
	public List<Identifier> getIdetifiers(){
		
		List<Identifier> ret = new ArrayList<Identifier>();
		if(this.getSuccess()){
			for(List<Identifier> ids : identifiers.values()){
				ret.addAll(ids);
			}
			return ret;
		}
		return null;
	}
	
	public List<Identifier> getIdetifiers(String domain){
		List<Identifier> ret = this.identifiers.get(domain);
		if(domain != null && ret == null){
			ret = new ArrayList<Identifier>();
			this.identifiers.put(domain, ret);
		}
		return ret;
	}
	
	public void addIdentifier(Identifier id){
		this.getIdetifiers(id.getDomain()).add(id);
	}
	
	public void addIdentifier(String id, String domain){
		if(id != null && domain != null){
			this.addIdentifier(new Identifier(id,domain));
		}
	}

}
