package org.hemologica.salud.web.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.hemologica.constants.ConstantsRest;
import org.hemologica.datatypes.BloodTypeData;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;


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
	public List<DataDonacion> getDonations(@QueryParam("user") String user);
	
	@GET
	@Path("/transfusions")
	@Produces("application/json")
	public List<DataTransfusion> getTransfusions(@QueryParam("user") String user);
	
	@GET
	@Path("/users")
	@Produces("application/json")
	public DataUser getUser(@QueryParam("user") String user);
	
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
	
	@POST
	@Path("/"+ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_SEND_MESSAGE)
	@Produces("application/json")
	public DataResponse sendMessage(MailData mailData);
}
