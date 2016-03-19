package org.hemologica.yodono.web.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.yodono.utils.FactoryBeans;
import org.xml.sax.SAXException;

public class RestServicesImpl implements IRestServices {

	private static final Logger logger = Logger.getLogger(RestServicesImpl.class.getName());

	@Override
	public Response login(LoginData datos) {

		return null;
	}

	@Override
	public void getProductInJSON() {
		System.out.println("GET");

	}

	@Override
	public List<DataDonation> getDonations(Long userId) {

		try {

			return FactoryBeans.getDonationBean().getDonationsUserId(userId);

		} catch (XMLDataBaseException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas XMLDataBaseException", e);

		} catch (SAXException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas SAXException", e);

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas IOException", e);

		} catch (ParserConfigurationException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas ParserConfigurationException", e);

		} catch (XPathExpressionException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas XPathExpressionException", e);

		}

		return new ArrayList<DataDonation>();

	}

	@Override
	public List<DataTransfusion> getTransfusions(Long userId) {

		try {

			return FactoryBeans.getTransfusionBean().getTransfusionsUserId(userId);

		} catch (XMLDataBaseException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas XMLDataBaseException", e);

		} catch (SAXException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas SAXException", e);

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas IOException", e);

		} catch (ParserConfigurationException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas ParserConfigurationException", e);

		} catch (XPathExpressionException e) {

			logger.log(Level.SEVERE, "Error al obtener los cdas XPathExpressionException", e);

		}

		return new ArrayList<DataTransfusion>();

		// List<DataTransfusion> transfusions = new
		// ArrayList<DataTransfusion>();
		//
		// DataTransfusion t1 = new DataTransfusion();
		// DataBank db = new DataBank();
		// db.setName("Banco X");
		//
		//
		// t1.setBank(db);
		//
		// DataInstitution d2 = new DataInstitution();
		// d2.setName("Hospital de clinicas");
		//
		// t1.setInstitution(d2);
		//
		// t1.setName("Pedro");
		// t1.setDate("10/02/2015");
		//
		// DataProductType dp1 = new DataProductType();
		// dp1.setCode("0");
		// dp1.setDisplay("Plaquetas");
		// t1.setDataProduct(dp1);
		// transfusions.add(t1);
		//
		// DataTransfusion t2 = new DataTransfusion();
		// DataBank db2 = new DataBank();
		// db2.setName("Banco X");
		//
		//
		// t1.setBank(db2);
		//
		// DataInstitution di = new DataInstitution();
		// di.setName("Hospital de clinicas");
		//
		// t2.setInstitution(di);
		// t2.setName("Pedro");
		// t2.setDate("10/02/2015");
		// DataProductType dp2 = new DataProductType();
		// dp2.setCode("0");
		// dp2.setDisplay("Plasma");
		// t1.setDataProduct(dp2);
		// transfusions.add(t2);
		//
		// return transfusions;
	}

	@Override
	public DataPerson getUser(String userId) {
		return FactoryBeans.getPersonBean().getPerson(FactoryBeans.getUserBean().getPersonIdFromUsername(userId));
	}

	@Override
	public List<DataBank> getBanks() {
		return FactoryBeans.getCenterBean().getBanks();
	}

	@Override
	public List<DataCode> getStates() {

		return FactoryBeans.getCodeBeans().getStates();

	}

	@Override
	public List<DataCode> getCities() {

		return FactoryBeans.getCodeBeans().getCities();
	}

	@Override
	public List<DataCode> getCities(String stateCode) {

		if (stateCode == null) {
			return this.getCities();
		}

		return FactoryBeans.getCodeBeans().getCitiesByState(stateCode);
	}

	@Override
	public DataResponse updateUser(DataPerson dataUser) {

		return FactoryBeans.getPersonBean().updatePerson(dataUser);
	}

	@Override
	public List<DataCampaign> getCampaigns(String cant) {

		return FactoryBeans.getAdvertismentBean().getCampaigns(cant);

	}

	@Override
	public DataCampaign getCampaign(String campaignId) {

		return FactoryBeans.getAdvertismentBean().getCampaign(campaignId);

	}

	@Override
	public DataUser getUserFirstAccess(String token) {
		return FactoryBeans.getUserBean().getDataUserFirstAccess(token);
	}

	@Override
	public DataResponse updateUserFirstAccess(DataUser data) {
		
		DataResponse resp;
		
		try {
			
			FactoryBeans.getUserBean().updateUserFirstAccess(data);
			resp = new DataResponse();
			resp.setCode(0);
			return resp;
			
		} catch (Exception ex) {
			resp = new DataResponse();
			resp.setCode(-1);
			resp.setErrorMessage(ex.getMessage());
			return resp;
			
		}
	}
}
