package org.hemologica.yodono.web.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Response;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationDonorType;
import org.hemologica.dao.enums.DataDonationStateEnum;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.LoginData;
import org.hemologica.yodono.ejb.beans.impl.DonationBean;
import org.hemologica.yodono.ejb.beans.AdvertismentBeanLocal;
import org.hemologica.yodono.ejb.beans.CentersBeanLocal;
import org.hemologica.yodono.ejb.beans.CodesBeanLocal;
import org.hemologica.yodono.ejb.beans.PersonBeanLocal;


public class RestServicesImpl implements IRestServices {
	
	private static final Logger logger = Logger.getLogger(RestServicesImpl.class.getName()); 
	
//	@Inject
//	private DonationBean DonationBean;
	
	@Inject
	private CentersBeanLocal centerBeans;
	
	@Inject
	private PersonBeanLocal personBeans;
	
	@Inject
	private AdvertismentBeanLocal advertismentBean;
	
	@Inject
	private CodesBeanLocal codeBeans;
	
	
	@Override
	public Response login(LoginData datos) {
		
		System.out.println("holaaaa" + datos);
		System.out.println(datos.getUser());
		System.out.println(datos.getPassword());
		return null;
	}

	@Override
	public void getProductInJSON() {
		System.out.println("GET");
		
	}

	@Override
	public List<DataDonation> getDonations(String user) {
		
		List<DataDonation> donaciones = new ArrayList<DataDonation>();

		DataDonation d = new DataDonation();

		
		DataCode dc222 = new DataCode();
		dc222.setCode(DataDonationStateEnum.MADE.label);
		dc222.setDisplayName(DataDonationStateEnum.MADE.label);
		
		d.setState(dc222);

		DataBank b1 = new DataBank();
		b1.setName("Banco de Sangre X");

		d.setBank(b1);

		DataInstitution di = new DataInstitution();
		di.setName("Hospital de clinicas");

		d.setInstitution(di);
		d.setName("Pedro");

		DataDonationDonorType a = new DataDonationDonorType();
		a.setDisplayName("Voluntario");
		d.setDataDonorType(a);
		d.setDate("10/02/2015");
		donaciones.add(d);

		DataDonation d3 = new DataDonation();
		
		DataCode dc = new DataCode();
		dc.setCode(DataDonationStateEnum.REJECTED.label);
		dc.setDisplayName(DataDonationStateEnum.REJECTED.label);
		d3.setState(dc);
		// d3.setApproved(true);

		DataBank b13 = new DataBank();
		b13.setName("Banco de Sangre X");

		d3.setBank(b13);

		DataInstitution di3 = new DataInstitution();
		di3.setName("Hospital de clinicas");

		d3.setInstitution(di);

		d3.setName("Pedro");
		DataDonationDonorType a3 = new DataDonationDonorType();
		a3.setDisplayName("Reposicion");

		d3.setDataDonorType(a3);
		d3.setDate("10/02/2015");
		donaciones.add(d3);

		DataDonation d2 = new DataDonation();
		
		DataCode dc2 = new DataCode();
		dc2.setCode(DataDonationStateEnum.MADE.label);
		dc2.setDisplayName(DataDonationStateEnum.MADE.label);
		
		d2.setState(dc2);
		// d2.setApproved(false);
		DataBank b133 = new DataBank();
		b133.setName("Banco de Sangre X");

		d2.setBank(b13);

		DataInstitution di33 = new DataInstitution();
		di33.setName("Hospital de clinicas");

		d2.setInstitution(di33);
		d2.setName("Pedro2");

		DataDonationDonorType a1 = new DataDonationDonorType();
		a1.setDisplayName("Reposicion");

		d2.setDataDonorType(a1);
		d2.setDate("10/02/2014");
		donaciones.add(d2);

		DataDonation d4 = new DataDonation();
		// d4.setApproved(false);
		
		
		DataCode dc22 = new DataCode();
		dc22.setCode(DataDonationStateEnum.REJECTED.label);
		dc22.setDisplayName(DataDonationStateEnum.REJECTED.label);
		
		d4.setState(dc22);
		// d2.setApproved(false);
		DataBank b1333 = new DataBank();
		b1333.setName("Banco de Sangre X");

		d4.setBank(b133);

		DataInstitution di333 = new DataInstitution();
		di333.setName("Hospital de clinicas");

		d4.setInstitution(di333);
		d4.setName("Pedro2");

		DataDonationDonorType a4 = new DataDonationDonorType();

		a4.setDisplayName("Voluntario");

		d4.setDataDonorType(a4);
		d4.setDate("10/02/2014");
		donaciones.add(d4);

		return donaciones;
	}
	
	@Override
	public List<DataTransfusion> getTransfusions(String user) {
		List<DataTransfusion> transfusions = new ArrayList<DataTransfusion>();
		
		DataTransfusion t1 = new DataTransfusion();
		DataBank db = new DataBank();
		db.setName("Banco X");
		
		
		t1.setBank(db);
		
		DataInstitution d2 = new DataInstitution();
		d2.setName("Hospital de clinicas");
		
		t1.setInstitution(d2);
		
		t1.setName("Pedro");
		t1.setDate("10/02/2015");
		
		DataProductType dp1 = new DataProductType();
		dp1.setCode("0");
		dp1.setDisplay("Plaquetas");
		t1.setDataProduct(dp1);
		transfusions.add(t1);
		
		DataTransfusion t2 = new DataTransfusion();
		DataBank db2 = new DataBank();
		db2.setName("Banco X");
		
		
		t1.setBank(db2);
		
		DataInstitution di = new DataInstitution();
		di.setName("Hospital de clinicas");
		
		t2.setInstitution(di);
		t2.setName("Pedro");
		t2.setDate("10/02/2015");
		DataProductType dp2 = new DataProductType();
		dp2.setCode("0");
		dp2.setDisplay("Plasma");
		t1.setDataProduct(dp2);
		transfusions.add(t2);
		
		return transfusions;
	}

	@Override
	public DataPerson getUser(String userId) {
		
		return getPersonBean().getPerson(userId);

	}

	@Override
	public List<DataBank> getBanks() {
		
		return getCenterBean().getBanks();
		
	}


	@Override
	public List<DataCode> getStates() {
		
		return getCodeBeans().getStates();
		
	}

	@Override
	public List<DataCode> getCities() {

		return getCodeBeans().getCities();
	}

	@Override
	public List<DataCode> getCities(String stateCode) {

		if (stateCode == null) {
			return this.getCities();
		}

		return  getCodeBeans().getCitiesByState(stateCode);
	}
	@Override
	public DataResponse updateUser(DataPerson dataUser) {
		
		return getPersonBean().updatePerson(dataUser);
	}

	@Override
	public List<DataCampaign> getCampaigns(String cant) {
		
		return getAdvertismentBean().getCampaigns(cant);
		
	}

	@Override
	public DataCampaign getCampaign(String campaignId) {
		
		return getAdvertismentBean().getCampaign(campaignId);
		
	}
	
	public AdvertismentBeanLocal getAdvertismentBean() {
		
		if(advertismentBean == null){
			
			try {
				
				advertismentBean = InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/AdvertismentBean!org.hemologica.yodono.ejb.beans.AdvertismentBeanLocal");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return advertismentBean;
	}
	
	public PersonBeanLocal getPersonBean() {
		
		if(personBeans == null){
			
			try {
				
				personBeans = InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/PersonBean!org.hemologica.yodono.ejb.beans.PersonBeanLocal");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return personBeans;
	}
	
	public CodesBeanLocal getCodeBeans() {
		
		if(codeBeans == null){
			
			try {
				
				codeBeans = InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/CodesBean!org.hemologica.yodono.ejb.beans.CodesBeanLocal");
				
			} catch (NamingException e) {

				logger.log(Level.SEVERE, e.getMessage(), e);

			}
		}
		return codeBeans;
	}
	
	public CentersBeanLocal getCenterBean() {
		
		if(centerBeans == null){
			
			try {
				
				centerBeans = InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/CentersBean!org.hemologica.yodono.ejb.beans.CentersBeanLocal");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return centerBeans;
	}

}
