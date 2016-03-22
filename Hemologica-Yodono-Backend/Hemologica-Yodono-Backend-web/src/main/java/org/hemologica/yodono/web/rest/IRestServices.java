package org.hemologica.yodono.web.rest;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.LoginData;
import org.hemologica.constants.ConstansJson;
import org.hemologica.constants.ConstantsRest;

@Path("/services")
@RequestScoped
public interface IRestServices {
	
	@POST
	@Path("/"+ConstantsRest.PATH_LOGIN)
	@Consumes("application/json;charset=utf-8")
	public Response login(LoginData datos);
	
	
	@GET
	@Path("/"+ConstantsRest.PATH_LOGIN)
	@Produces("application/json;charset=utf-8")
	public void getProductInJSON();
	
	@GET
	@Path("/"+ConstantsRest.PATH_DONATIONS)
	@Produces("application/json;charset=utf-8")
	public List<DataDonation> getDonations(@QueryParam(ConstansJson.JSON_USER) Long user);
	
	@GET
	@Path("/"+ConstantsRest.PATH_TRANSFUTIONS)
	@Produces("application/json;charset=utf-8")
	public List<DataTransfusion> getTransfusions(@QueryParam(ConstansJson.JSON_USER) Long user);
	
	@GET
	@Path("/"+ConstantsRest.PATH_USERS)
	@Produces("application/json;charset=utf-8")
	public DataPerson getUser(@QueryParam(ConstansJson.JSON_USER) String user);
	
	@PUT
	@Path("/"+ ConstantsRest.PATH_USERS)
	@Produces("application/json;charset=utf-8")
	public DataResponse updateUser(DataPerson dataUser);
	
	@GET
	@Path("/"+ConstantsRest.PATH_BANKS)
	@Produces("application/json;charset=utf-8")
	public List<DataBank> getBanks();
	
	@GET
	@Path("/"+ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_STATES)
	@Produces("application/json;charset=utf-8")
	public List<DataCode> getStates();
	
	@GET
	@Path("/"+ ConstantsRest.PATH_CODES +"/"+ConstantsRest.PATH_CITIES)
	@Produces("application/json;charset=utf-8")
	public List<DataCode> getCities();
	
	@GET
	@Path("/"+ConstantsRest.PATH_CITIES_STATE)
	@Produces("application/json;charset=utf-8")
	public List<DataCode> getCities(@QueryParam(ConstansJson.JSON_STATE) String stateCode);
	
	@GET
	@Path("/"+ConstantsRest.PATH_CAMPAIGNS)
	@Produces("application/json;charset=utf-8")
	public List<DataCampaign> getCampaigns(@QueryParam(ConstansJson.JSON_CANT) String cant);
	
	@GET
	@Path("/"+ConstantsRest.PATH_CAMPAIGN)
	@Produces("application/json;charset=utf-8")
	public DataCampaign getCampaign(@QueryParam(ConstansJson.JSON_CAMPAIGN_ID) String campaignId);
	
	@GET
	@Path("/"+ConstantsRest.PATH_ACCOUNT_ENABLE)
	@Produces("application/json;charset=utf-8")
	public DataUser getUserFirstAccess(@QueryParam(ConstansJson.JSON_ACCOUNT_TOKEN) String token);
	
	@POST
	@Path("/"+ConstantsRest.PATH_ACCOUNT_ENABLE)
	@Produces("application/json;charset=utf-8")
	@Consumes("application/json;charset=utf-8")
	public DataResponse updateUserFirstAccess(DataUser data);
	
}
