package org.hemologica.salud.ejb.business;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.model.BloodTypes;
import org.hemologica.dao.model.Movement;
import org.hemologica.dao.model.Unit;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataMovement;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataStockProductTypeBloodType;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.StockBeanLocal;
import org.hemologica.salud.ejb.utils.FactoryBeans;

@Stateless
@LocalBean
public class StockBean implements StockBeanLocal,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1878663879964146393L;
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
	@Override
	public List<DataMovement> getMovementsUnitId(String unitId) {
		
		List<DataMovement> dataMovements = new ArrayList<>();
		
		List<Movement> movements = FactoryDAO.getMovementDAO(em).getMovementsUnitId(unitId);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		if(movements != null){
			for(Movement m : movements){
				
				DataMovement dataMovement = new DataMovement();
				dataMovement.setDate(sdf.format(m.getDate()));
				if(m.getCenter() != null)
					dataMovement.setCenterName(m.getCenter().getCenterDisplayName());
				if(m.getMovementsType() != null){
					dataMovement.setMovementsType(m.getMovementsType().getTypeLabel());
				}
				dataMovements.add(dataMovement);
				
			}
		}
		return dataMovements;
	}

	@Override
	public DataStock getStockAndBanks(String bankCode, String institution, String productTypeCode,
			String bloodTypeCodeABO, String bloodTypeCodeRH) {
		
		DataStock dataStock = new DataStock();
		
		LinkedList<DataBank> banks = new LinkedList<>();
		
		if(bankCode != null){
			
			banks.add(FactoryBeans.getCenterBean().getBankById(bankCode));
			
		}else if(bankCode == null && institution != null){
			
			DataInstitution banksIntitution = FactoryBeans.getInstitutionBean().getInstitutionById(institution);
			if(banksIntitution!= null)
				banks.addAll(banksIntitution.getBanks());
			
		}else if(bankCode == null && institution == null && (productTypeCode == null || productTypeCode.equals("")) && 
				(bloodTypeCodeABO == null || bloodTypeCodeABO.equals("")) && (bloodTypeCodeRH == null || bloodTypeCodeRH.equals(""))){
			
			banks.addAll(FactoryBeans.getCenterBean().getBanks());
			
		}else{
			
			List<DataBank> allBanks = FactoryBeans.getCenterBean().getBanks();
			for(DataBank bank : allBanks){
				
				if(hasStockBank(productTypeCode, bloodTypeCodeABO, bloodTypeCodeRH , bank)){
					
					banks.add(bank);
				}
				
			}
		}
			
		List<DataStockProductType> products = new LinkedList<>() ;
		
		List<DataProductType> listProducts = FactoryBeans.getCodeBeans().getProducts();
		List<BloodTypes> listBloodTypes = FactoryDAO.getCodesDAO(em).getBloodTypes();
		/**
		 * inicializar la matriz
		 */
		for(DataProductType product : listProducts){
			
			DataStockProductType d = new DataStockProductType();
			d.setCode(product.getCode());
			d.setDisplay(product.getDisplay());
			
			List<DataStockProductTypeBloodType> productsHash = new LinkedList<>();
			for(BloodTypes dataBloodType : listBloodTypes){
				
				DataStockProductTypeBloodType dataStockProductTypeBloodType = new DataStockProductTypeBloodType();
				dataStockProductTypeBloodType.setCode(dataBloodType.getBloodTypeCodeValue());
				dataStockProductTypeBloodType.setDisplayName(dataBloodType.getBloodTypeCodeLabel());
				
				int countBlood = FactoryDAO.getUnitDAO(em).getCountUnitBanks(product.getCode(), dataBloodType.getBloodAboTypesCode().getBloodAboTypeCodeValue(),
						dataBloodType.getBloodDTypesCode().getBloodDTypeCodeValue(), banks);
				dataStockProductTypeBloodType.setCount(countBlood);
				
				productsHash.add(dataStockProductTypeBloodType);
				
			}
			d.setBloodTypes(productsHash);
			products.add(d);
			
		}
		
		dataStock.setProducts(products);
		dataStock.setBanks(banks);
		
		
		return dataStock;
	}

	private boolean hasStockBank(String productTypeCode, String bloodTypeCodeABO, String bloodTypeCodeRH,
			DataBank bank) {
		
		int count = FactoryDAO.getUnitDAO(em).getCountUnit(productTypeCode,bloodTypeCodeABO,bloodTypeCodeRH,bank.getCode());
		
		return count > 0;
	}

	@Override
	public List<DataMovement> getMovementsByUnitCodes(String unitInstitutionCode, String institutionCode) {

		Unit u = FactoryDAO.getUnitDAO(em).findUnitByCodes(unitInstitutionCode, institutionCode);
		if(u != null && u.getId() != null){
			return this.getMovementsUnitId(u.getId().toString());
		}
		return new ArrayList<>();
	}


}
