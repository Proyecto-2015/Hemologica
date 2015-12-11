package org.hemologica.salud.web.rest;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.hemologica.constants.ConstansJson;
import org.hemologica.constants.ConstantsRest;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.datatypes.DataUnitInfo;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.TransfusionFilterData;

@Path("/services")
@RequestScoped
public interface IRestServices {
	
	@GET
	@Path("/donations")
	@Produces("application/json")
	public List<DataDonation> getDonations(@QueryParam(ConstansJson.JSON_USER) Long user);
	
	@GET
	@Path("/transfusions")
	@Produces("application/json")
	public List<DataTransfusion> getTransfusions(@QueryParam(ConstansJson.JSON_USER) Long user);
	
	@GET
	@Path("/users")
	@Produces("application/json")
	public DataPerson getPerson(@QueryParam(ConstansJson.JSON_USER) Long user);
	
	@GET
	@Path("/" + ConstantsRest.PATH_USERS + "/" + ConstantsRest.PATH_BANKS)
	@Produces("application/json")
	public List<DataBank> getBanksUser(@QueryParam(ConstansJson.JSON_USER) Long user);
	
	@GET
	@Path("/" + ConstantsRest.PATH_USERS + "/" + ConstantsRest.PATH_INSTITUTIONS)
	@Produces("application/json")
	public List<DataInstitution> getInstitutionsUser(@QueryParam(ConstansJson.JSON_USER) Long user);
	
	@GET
	@Path("/" + ConstantsRest.PATH_BANKS)
	@Produces("application/json")
	public List<DataBank> getBanks();
	
	@GET
	@Path("/" + ConstantsRest.PATH_BANKS_QUERY)
	@Produces("application/json")
	public DataStock getBanks(
			@QueryParam(ConstansJson.JSON_BANK) String bank,
			@QueryParam(ConstansJson.JSON_INSTITUTION) String institution,
			@QueryParam(ConstansJson.JSON_PRODUCT_TYPE) String productTypeCode, 
			@QueryParam(ConstansJson.JSON_BLOOD_TYPE_ABO) String bloodTypeCodeABO, 
			@QueryParam(ConstansJson.JSON_BLOOD_TYPE_RH) String bloodTypeCodeRH,
			@QueryParam(ConstansJson.JSON_COUNT) Integer count);
	
	@GET
	@Path("/" + ConstantsRest.PATH_BANKS_STOCK)
	@Produces("application/json")
	public DataStock getBankStock(@QueryParam("bank") String code);
	
	@GET
	@Path("/cities")
	@Produces("application/json")
	public List<DataCode> getCities();
	
	@GET
	@Path("/cities")
	@Produces("application/json")
	public List<DataCode> getCities(@QueryParam(ConstansJson.JSON_USER) String stateCode);
	
	@GET
	@Path("/"+ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_CAMPAIGNS_MESSAGES_OPTIONS)
	@Produces("application/json")
	public List<DataMessageOption> getMessageOptions();
	
	@GET
	@Path("/"+ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_BLOOD_TYPES)
	@Produces("application/json")
	public List<DataCode> getBloodTypes();
	
	@GET
	@Path("/"+ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_PRODUCTS)
	@Produces("application/json")
	public List<DataProductType> getProducts();
	
	@GET
	@Path("/"+ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_DONATIONS_FILTERS)
	@Produces("application/json")
	public List<DonationFilterData> getDonationsFilters();
	
	@GET
	@Path("/"+ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_TRANSFUSIONS_FILTERS)
	@Produces("application/json")
	public List<TransfusionFilterData> getTransfusionsFilters();
	
	@POST
	@Path("/"+ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_SEND_MESSAGE)
	@Produces("application/json")
	public DataResponse sendMessage(MailData mailData);
	
	@POST
	@Path("/"+ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_SEND_CAMPAIGN)
	@Produces("application/json")
	public DataResponse sendCampaign(DataCampaign dataCampaign);
	
	@GET
	@Path("/"+ConstantsRest.PATH_CAMPAIGNS)
	@Produces("application/json")
	public List<DataCampaign> getCampaigns(@QueryParam(ConstansJson.JSON_CANT) String cant);
	
	@GET
	@Path("/"+ConstantsRest.PATH_CAMPAIGN)
	@Produces("application/json")
	public DataCampaign getCampaign(@QueryParam(ConstansJson.JSON_CAMPAIGN_ID) String campaignId);
	
	@GET
	@Path("/"+ConstantsRest.PATH_PERSONS)
	@Produces("application/json")
	public List<DataPerson> getPersons();
	
	@GET
	@Path("/"+ConstantsRest.PATH_PERSONS + "/"+ ConstantsRest.PATH_RESPONSIBLE_TRENSFUSION)
	@Produces("application/json")
	public List<DataResponsiblePerson> getResponsibleTransfusionPersons(@QueryParam(ConstansJson.JSON_BANK) String bankCode);
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_TRANSFUSIONS_ANALYSIS)
	@Produces("application/json")
	public List<DataCode> getTransfusionsAnalysis();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_TRANSFUSIONS_EVENTS)
	@Produces("application/json")
	public List<DataCode> getTransfusionsEvents();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_SEVERITIES)
	@Produces("application/json")
	public List<DataCode> getSeverities();
	
	@GET
	@Path("/" +ConstantsRest.PATH_UNITS)
	@Produces("application/json")
	public DataUnit getUnit();
	
	@GET
	@Path("/" +ConstantsRest.PATH_UNIT_INFO)
	@Produces("application/json")
	public DataUnitInfo getUnitInfo(@QueryParam(ConstansJson.JSON_UNIT_CODE) String code);
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_BLOOD_TYPES_ABO)
	@Produces("application/json")
	public List<DataCode> getDonationABOTypes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_BLOOD_TYPES_RH)
	@Produces("application/json")
	public List<DataCode> getDonationDTTypes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_REJECTION_REASONS)
	@Produces("application/json")
	public List<DataCode> getRejectionReasons();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_REJECTION_TYPES)
	@Produces("application/json")
	public List<DataCode> getRejectionTypes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_DOCUMENTS_TYPE)
	@Produces("application/json")
	public List<DataCode> getDocumentsTypes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_COUNTRIES)
	@Produces("application/json")
	public List<DataCode> getCountries();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_STATES)
	@Produces("application/json")
	public List<DataCode> getStatesCodes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_CITIES)
	@Produces("application/json")
	public List<DataCode> getCitiesCodes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_DONATIONS_ANALYSIS)
	@Produces("application/json")
	public List<DataCode> getDonationsAnalysis();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_DONATIONS_EVENTS)
	@Produces("application/json")
	public List<DataCode> getDonationsEvents();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_INSTITUTIONS)
	@Produces("application/json")
	public List<DataInstitution> getInstitutions();
	
	@GET
	@Path("/" + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_DONATION_STATES)
	@Produces("application/json")
	public List<DataCode> getDonationState();
	
	@POST
	@Path("/"+ConstantsRest.PATH_DONATIONS_STATISTICS)
	@Produces("application/json")
	public DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics donationsStatisticsData);
	
	@POST
	@Path("/"+ConstantsRest.PATH_TRANSFUSION_STATISTICS)
	@Produces("application/json")
	public DataTransfusionsStatisticsResults getTransfusionsStatistics(DataTransfusionsStatistics donationsStatisticsData);
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES  + "/"+  ConstantsRest.PATH_DONATION_TYPES)
	@Produces("application/json")
	public List<DataCode> getDonationTypes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_DONOR_TYPES)
	@Produces("application/json")
	public List<DataCode> getDonorTypes();
	
	@POST
	@Path("/" +ConstantsRest.PATH_ADD_DONATION)
	@Produces("application/json")
	public DataResponse addDonation(DataDonation dataDonacion);
	
	@POST
	@Path("/" +ConstantsRest.PATH_ADD_TRANSFUSION)
	@Produces("application/json")
	public DataResponse addTransfusion(DataTransfusion dataTransfusion);
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_GENDER)
	@Produces("application/json")
	public List<DataCode> getGenderCodes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_RESULTS)
	@Produces("application/json")
	public List<DataCode> getResultsCodes();
	
	@GET
	@Path("/" +ConstantsRest.PATH_BANKS +"/"+ ConstantsRest.ARRANGEMENTS)
	@Produces("application/json")
	public List<DataBank> getArrangementBanks(@QueryParam(ConstansJson.JSON_USER) String code);
	
	@GET
	@Path("/" +ConstantsRest.PATH_INSTITUTIONS +"/"+ ConstantsRest.ARRANGEMENTS)
	@Produces("application/json")
	public List<DataInstitution> getArrangementInstitutions(@QueryParam(ConstansJson.JSON_USER) String code);
}
