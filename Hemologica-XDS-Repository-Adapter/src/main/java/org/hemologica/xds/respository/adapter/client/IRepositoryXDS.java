package org.hemologica.xds.respository.adapter.client;


public interface IRepositoryXDS {
	
	public void saveCDA(String authorPerson , String authorInstitution,
			String authorRole, String codingSchemeLOINCId, String codingSchemeLOINCname,
			String codingSchemeSNOMEDCTId,String codingSchemeSNOMEDCTName,
			String languageCode, String cdaID,String cdaDocumentType, String cda); 
	
	
//	public void saveCDA(String cda); 
	
	// authorRole - Medico
	// authorInstitution - ASESP^^^^^^^^^2.16.858.0.2.16.86.1.0.0.212567060019
	// authorPerson - 1234567^PEREZ^JUAN^^^^^^^^^&amp;2.16.858.0.2.16.86.1.0.0.212567060019.0001&amp;ISO
	// codingSchemeLOINCId - 34108-1
	// codingSchemeLOINCName - Hoja de consulta ambulatoria
	
	// codingSchemeSNOMEDCTId - 11429006
	// codingSchemeSNOMEDCTName - Consulta (procedimiento)
	
	// languageCode - es-uy
}
