package org.hemologica.salud.ejb.beans.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.CodesBeanLocal;

/**
 * Session Bean implementation class CodesBean
 */
@Stateless
@LocalBean
public class CodesBean implements CodesBeanLocal {

	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public CodesBean() {
        // TODO Auto-generated constructor stub
    }
    
    public List<DataMessageOption> getMessageOptions() {
		
    	List<DataMessageOption> listReturn = new ArrayList<>();
		List<MessageSendOption> list = FactoryDAO.getCodesDAO(em).getMessageOptions();
		
		for(MessageSendOption m : list){
			
			DataMessageOption data = new DataMessageOption();
			data.setCode(m.getId());
			data.setDisplayName(m.getLabel());
			listReturn.add(data);
		}
		
		return listReturn;
		
	}
    
    @Override
	public List<DataProductType> getProducts() {
		
		List<DataProductType> listReturn = new ArrayList<>();
		List<UnitsType> list = FactoryDAO.getCodesDAO(em).getProducts();
		
		for(UnitsType unit :list){
			
			DataProductType data = new DataProductType();
			data.setCode(unit.getUnitTypeCodeValue());
			data.setDisplay(unit.getUnitTypeCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

}
