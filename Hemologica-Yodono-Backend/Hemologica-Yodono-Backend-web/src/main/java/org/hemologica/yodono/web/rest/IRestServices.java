package org.hemologica.yodono.web.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.datatypes.DataTransfusion;
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
}
