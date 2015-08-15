/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.stock.service.response;

import java.util.List;
import org.hemologica.stock.service.datatype.MovementResult;

/**
 *
 * @author bruno
 */
public class TransactionResponse {
	
	private List<MovementResult> results;

	/**
	 * @return the results
	 */
	public List<MovementResult> getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(List<MovementResult> results) {
		this.results = results;
	}
	
	
}
