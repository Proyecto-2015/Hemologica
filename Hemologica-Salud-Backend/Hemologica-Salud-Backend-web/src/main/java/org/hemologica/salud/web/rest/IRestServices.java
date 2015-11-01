package org.hemologica.salud.web.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.hemologica.constants.ConstansJson;
import org.hemologica.constants.ConstantsRest;
import org.hemologica.datatypes.BloodTypeData;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.LoginData;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;
import org.hemologica.datatypes.TransfusionFilterData;


@Path("/services")
public interface IRestServices {
	
	@POST
	@Path("/login")
	@Consumes("application/json")
	public Response login(LoginData datos);
	
	
	@GET
	@Path("/login")
	@Produces("application/json")
	public void getProductInJSON();
	
	@GET
	@Path("/donations")
	@Produces("application/json")
	public List<DataDonation> getDonations(@QueryParam("user") String user);
	
	@GET
	@Path("/transfusions")
	@Produces("application/json")
	public List<DataTransfusion> getTransfusions(@QueryParam("user") String user);
	
	@GET
	@Path("/users")
	@Produces("application/json")
	public DataUser getUser(@QueryParam("user") String user);
	
	@GET
	@Path("/" + ConstantsRest.PATH_USERS + "/" + ConstantsRest.PATH_BANKS)
	@Produces("application/json")
	public List<DataBank> getBanksUser(@QueryParam("user") String user);
	
	@GET
	@Path("/" + ConstantsRest.PATH_USERS + "/" + ConstantsRest.PATH_INSTITUTIONS)
	public List<DataInstitution> getInstitutionsUser(@QueryParam("user") String user);
	
	@GET
	@Path("/banks")
	@Produces("application/json")
	public List<DataBank> getBanks();
	
	@GET
	@Path("/states")
	@Produces("application/json")
	public List<DataState> getStates();
	
	@GET
	@Path("/cities")
	@Produces("application/json")
	public List<DataCity> getCities();
	
	@GET
	@Path("/cities")
	@Produces("application/json")
	public List<DataCity> getCities(@QueryParam("user") String stateCode);
	
	@GET
	@Path("/"+ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_CAMPAIGNS_MESSAGES_OPTIONS)
	@Produces("application/json")
	public List<MessageOptionData> getMessageOptions();
	
	@GET
	@Path("/"+ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_BLOOD_TYPES)
	@Produces("application/json")
	public List<BloodTypeData> getBloodTypes();
	
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
}
