/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.stock.service;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import org.hemologica.stock.service.request.TransactionRequest;
import org.hemologica.stock.service.response.TransactionResponse;

/**
 *
 * @author bruno
 */
@WebService(serviceName = "Service")
@Stateless()
public class Service {

	/**
	 * This is a sample web service operation
	 * @param request
	 * @return 
	 */
	@WebMethod(operationName = "transaction")
	public @XmlElement(name = "response")TransactionResponse transaction(
			@WebParam(name = "request") TransactionRequest request) {
		return new TransactionResponse();
	}
}
