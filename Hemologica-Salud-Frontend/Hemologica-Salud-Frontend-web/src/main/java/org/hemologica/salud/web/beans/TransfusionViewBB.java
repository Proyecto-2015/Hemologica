package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DataTransfusion;

public class TransfusionViewBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(TransfusionViewBB.class.getName());
	
	private DataTransfusion transfusion;
	
	@PostConstruct
	private void init(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		transfusion = (DataTransfusion) context.getExternalContext().getSessionMap().get("transfusionView");
		
		
	}

	public DataTransfusion getTransfusion() {
		return transfusion;
	}

	public void setTransfusion(DataTransfusion transfusion) {
		this.transfusion = transfusion;
	}

}
