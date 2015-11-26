package org.hemologica.xds.respository.adapter.client;


//  http://wiki.ihe.net/index.php?title=PCC_TF-1/XDS-MS

public interface IRepositoryXDS {
	
	/**
	 * @param authorPerson 
	 * @param authorInstitution
	 * @param authorRole 
	 * @param codingSchemeLOINCId 
	 * @param codingSchemeLOINCname 
	 * @param codingSchemeSNOMEDCTId 
	 * @param codingSchemeSNOMEDCTName 
	 * @param languageCode 
	 * @param PID5 
	 * @param PID7 
	 * @param PID8 
	 * @param cdaID 
	 * @param cdaDocumentType 
	 * @param cda 
	 * @param submissionTime 
	 */
	public void saveCDA(String authorPerson , String authorInstitution,
			String authorRole, String codingSchemeLOINCId, String codingSchemeLOINCname,
			String codingSchemeSNOMEDCTId,String codingSchemeSNOMEDCTName, String languageCode, 
			String PID5, String PID7, String PID8, 
			String cdaID,String cdaDocumentType, String cda, String submissionTime); 
	
	
//	public void saveCDA(String cda); 
	
	// authorRole - Medico
	// authorInstitution - ASESP^^^^^^^^^2.16.858.0.2.16.86.1.0.0.212567060019
	// authorPerson - 1234567^PEREZ^JUAN^^^^^^^^^&amp;2.16.858.0.2.16.86.1.0.0.212567060019.0001&amp;ISO
	// codingSchemeLOINCId - 34108-1
	// codingSchemeLOINCName - Hoja de consulta ambulatoria
	
	// codingSchemeSNOMEDCTId - 11429006
	// codingSchemeSNOMEDCTName - Consulta (procedimiento)
	
	// languageCode - es-uy
	// submissionTime = "20150717093107";
	// PID5 = "RODRIGUEZ^MARIA             ^^^^";
	// PID7 = "19321115";
	// PID8 = "1";
}
