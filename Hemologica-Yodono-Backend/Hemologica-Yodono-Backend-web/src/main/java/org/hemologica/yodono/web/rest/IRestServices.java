package org.hemologica.yodono.web.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;


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
	
	@PUT
	@Path("/users")
	@Produces("application/json")
	public DataResponse updateUser(DataUser dataUser);
	
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
	@Path("/citiesState")
	@Produces("application/json")
	public List<DataCity> getCities(@QueryParam("state") String stateCode);
}
