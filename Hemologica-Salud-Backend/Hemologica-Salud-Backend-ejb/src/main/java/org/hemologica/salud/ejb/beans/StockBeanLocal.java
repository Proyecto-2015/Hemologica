package org.hemologica.salud.ejb.beans;

import java.util.List;
import javax.ejb.Local;
import org.hemologica.datatypes.DataMovement;
import org.hemologica.datatypes.DataStock;

@Local
public interface StockBeanLocal {
	
	List<DataMovement> getMovementsUnitId(String unitId);
	
	List<DataMovement> getMovementsByUnitCodes(String unitInstitutionCode, String institutionCode);

	DataStock getStockAndBanks(String bankCode, String institution, String productTypeCode,
			String bloodTypeCodeABO, String bloodTypeCodeRH);

}
