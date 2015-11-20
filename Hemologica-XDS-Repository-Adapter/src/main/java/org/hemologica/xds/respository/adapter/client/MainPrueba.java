package org.hemologica.xds.respository.adapter.client;

public class MainPrueba {

	public static void main(String[] args) {
		
		RepositoryXDSImpl repositoryXDSImpl = new RepositoryXDSImpl();
		
		
		String authorPerson = "1234567^PEREZ^JUAN^^^^^^^^^&amp;2.16.858.0.2.16.86.1.0.0.212567060019.0001&amp;ISO";
		String authorInstitution = "ASESP^^^^^^^^^2.16.858.0.2.16.86.1.0.0.212567060019";
		String authorRole = "Medico";
		String codingSchemeLOINCId = "34108-1";
		String codingSchemeLOINCname = "Hoja de consulta ambulatoria";
		String codingSchemeSNOMEDCTId = "11429006";
		String codingSchemeSNOMEDCTName = "Consulta (procedimiento)";
		String languageCode = "es-uy";
		String cdaID = "b2c8c900-2c7f-11e5-b870-005056010837";
		String cdaDocumentType = "99999";
		String cda = "soy un CDA";
		String submissionTime = "20150717093107";
		String PID5 = "RODRIGUEZ^MARIA             ^^^^";
		String PID7 = "19321115";
		String PID8 = "1";
		
		repositoryXDSImpl.saveCDA(authorPerson , authorInstitution,
				authorRole, codingSchemeLOINCId, codingSchemeLOINCname,
				codingSchemeSNOMEDCTId,codingSchemeSNOMEDCTName,
				PID5, PID7, PID8,
				languageCode, cdaID,cdaDocumentType, cda, submissionTime);

	}

}
