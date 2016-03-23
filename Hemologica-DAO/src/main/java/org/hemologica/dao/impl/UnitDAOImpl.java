package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hemologica.dao.IUnitDAO;
import org.hemologica.dao.model.Unit;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataBank;

public class UnitDAOImpl extends GenericDAOImpl<Unit> implements IUnitDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnitDAOImpl(EntityManager em) {
		super(em);
	}

	public Unit findByInstitutionCode(String code) {
		
		Query query = em.createNamedQuery("Unit.findByInstitutionCode");
		query.setParameter("code", code);
		@SuppressWarnings("unchecked")
		List<Unit> ret = query.getResultList();
		return ret != null && ret.size() > 0 ? ret.get(0) : null;
	}

	public UnitsType findUnitTypeByCode(String code) {

		Query query = em.createNamedQuery("UnitsType.findBySnomedCode");
		query.setParameter("code", code);
		@SuppressWarnings("unchecked")
		List<UnitsType> ret = query.getResultList();
		return ret != null && ret.size() > 0 ? ret.get(0) : null;
	}

	public int getCountUnit(String productTypeCode, String bloodTypeCodeABO, String bloodTypeCodeRH, String code) {
		
		String query = "SELECT count(*) from Unit u where u.center.centerCode ='" + code + "' and " + "u.active = TRUE ";
		if(bloodTypeCodeABO != null && !bloodTypeCodeABO.equals("")){
			
			query+= "and u.bloodTypeABO.bloodAboTypeCodeValue='"+ bloodTypeCodeABO + "'";
			
		}
		
		if(bloodTypeCodeRH != null && !bloodTypeCodeRH.equals("")){
			
			query+= "and u.bloodTypeRH.bloodDTypeCodeValue='"+ bloodTypeCodeRH + "'";
			
		}
		
		if(productTypeCode != null && !productTypeCode.equals("")){
			
			query+= "and u.unitsType.unitTypeCodeValue='"+ productTypeCode + "'";
			
		}
		
		Query querySql = em.createQuery(query);
		
		return querySql.getFirstResult();
		
	}

	public int getCountUnitBanks(String productTypeCode, String bloodTypeCodeABO, String bloodTypeCodeRH,
			List<DataBank> banks) {
		
		String query = "SELECT count(*) from Unit u where u.active = TRUE ";
		
		if(banks != null && banks.size() !=0){
			
			query+= "and u.center.centerCode in (";
			boolean fisrt = true;
			for(DataBank bank : banks){
				if(fisrt){
					fisrt = false;
					query+= "'"+ bank.getCode() + "'";
					
				}else{
					query+= ",'" + bank.getCode() + "'";
				}
			}
			query+=") ";
		}
		
		if(bloodTypeCodeABO != null && !bloodTypeCodeABO.equals("")){
			
			query+= "and u.bloodTypeABO.bloodAboTypeCodeValue='"+ bloodTypeCodeABO + "' ";
			
		}
		
		if(bloodTypeCodeRH != null && !bloodTypeCodeRH.equals("")){
			
			query+= "and u.bloodTypeRH.bloodDTypeCodeValue='"+ bloodTypeCodeRH + "' ";
			
		}
		
		if(productTypeCode != null && !productTypeCode.equals("")){
			
			query+= "and u.unitsType.unitTypeCodeValue='"+ productTypeCode + "' ";
			
		}
		
		Query querySql = em.createQuery(query);
		Long ret = (Long) querySql.getSingleResult();
		return ret.intValue();
	}

	@Override
	public Unit findUnitByCodes(String code, String institution) {
		
		Query query = em.createNamedQuery("Unit.findByCodes");
		query.setParameter("code", code);
		query.setParameter("institution", institution);
		@SuppressWarnings("unchecked")
		List<Unit> ret = query.getResultList();
		return ret != null && ret.size() > 0 ? ret.get(0) : null;
	}

}
