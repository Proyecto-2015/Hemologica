package org.hemologica.constants;


public class Constants {
	
	public static final String COMPLETED = "completed";
	public static final Object COMPLETED_CODE = "1";
	
	public static final String CANCELED = "cancelled";
	public static final String CANCELED_CODE = "2";
	
	public static final int MONTHS_FEMALE = 4;
	public static final int MONTHS_MALE = 3;
	
	public static final String AGE_FROM = "2";
	public static final String AGE_TO = "3";
	public static final String ADVERSE_EVENT = "5";
	public static final String SEVERITY_EVENT = "6";
	
	public static final String ANALYSIS = "9";
	public static final String RESULTS = "10";
	
	public static final String EVENT_FILTER = "entryRelationship[descendant-or-self::node()/@code =";
	public static final String VAR_EVENT_FILTER = "$1";
	
	public static final String ANALYSIS_FILTER = "observation[descendant-or-self::node()/@code =";
	
	
	
	
	//DOCUMENTOS
	
	public static final Long DOCUMENT_CODE_DONATION = new Long("4321000179101");
	public static final Long DOCUMENT_CODE_TRANSFUSION = new Long("4321000179102");
	public static final Long DOCUMENT_CODE_LABORATORY = new Long("4321000179103");
	
	// OID HEMOLOGICA
	public static final String HEMOLOGICA_NAME = "HEMOLOGICA";
	public static final String OID_HEMOLOGICA = "2.16.858.0.0.1.10.2.3.1.1";
	public static final String OID_HEMOLOGICA_CDA = "2.16.858.0.0.1.10.2.3.1.1.1";
	public static final String OID_HCE_HEMOLOGICA_CDA = "2.16.858.0.0.1.10.2.3.1.1.2";
	
	public static final String CDA_TYPE_ID_ROOT = "2.16.840.1.113883.1.3";
	public static final String CDA_TYPE_ID_EXTENSION = "POCD_HD000040";
	
	public static final String SNOMED_CODE ="2.16.840.1.113883.6.96";
	public static final String SNOMED_NAME = "SNOMED-CT";
	
	public static final String CDA_PATH = "/home/bruno/Escritorio/proyecto/Mirth/Integracion/import";
	
	public static final String ID_OID_PATH = "2.16.858.1";
	
	public static final String GENDER_SYSTEM_CODE = "2.16.858.2.10000675.69600";
	
	public static final String CONFIDENTIALITY_CODE_SYSTEM = "2.16.840.1.113883.5.25";
	public static final String CONFIDENTIALITY_CODE_SYSTEM_NAME = "Confidentiality";
	public static final String CONFIDENTIALITY_CODE_N = "N";
	public static final String CONFIDENTIALITY_CODE_N_DISPLAY_NAME = "normal";
	
	public static final String LANGUAGE_UY_CODE ="es-UY";
	public static final String USE_HP = "HP";
	public static final String TEL = "tel:";
	public static final String MAIL = "mailto:";
	
	
	public static final String SPC = "SPC";
	public static final String SPEC = "SPEC";
	public static final String COMP = "COMP";
	public static final String OBS = "OBS";
	public static final String EVN = "EVN";
	public static final String CAUS = "CAUS";
	public static final String DAYS = "days";
	public static final String BATTERY = "BATTERY";
	public static final Long TRANSFUSION_CODE = new Long("54790000");
	public static final String TRANSFUSION_DISPLAY = "transfusión de un componente sanguíneo (procedimiento)";
	public static final Long SPECIMEN_DONATION_CODE = new Long("122563008");
	public static final String SPECIMEN_DONATION_DISPLAY = "espécimen obtenido de una bolsa de sangre de un paciente (espécimen)";
	
	public static final Long SPECIMEN_PRODUCT_CODE = new Long("122564002");
	public static final String SPECIMEN_PRODUCT_DISPLAY = "espécimen de hemoderivado obtenido de una bolsa de sangre (espécimen)";
	public static final String SPRT = "SPRT";
	public static final Long VOLUME_CODE = new Long("118565006");
	public static final String VOLUME_DISPLAY = "volumen (propiedad) (calificador)";
	public static final String ML = "ml";
	public static final String PROC = "PROC";
	public static final String RCT = "RCT";
	public static final String OP = "OP";
	public static final String PSN = "PSN";
	public static final String PAT = "PAT";
	public static final String INSTANCE = "INSTANCE";
	public static final String AUT = "AUT";
	public static final String ASSIGNED = "ASSIGNED";
	
	
	public static final String DONOR_TYPE = "11";
	public static final String DONOR_TYPE_VOLUNTARY = "1";
	public static final String DONOR_TYPE_REPLACEMENTS = "2";
	public static final String DONOR_TYPE_OTHER = "3";
	public static final String DONATION_TYPE = "8";
	public static final String DONATION_APHERESIS = "4";
	public static final String DONATION_STATE = "4";
	public static final String DONATION_STATE_MADE = "1";
	public static final String DONATION_STATE_REJECTED = "2";
	
	public static final String DONATION_FAIL_TYPE = "5";
	public static final String DONATION_FAIL_TYPE_TEMPORAL = "2";
	public static final String DONATION_FAIL_TYPE_PERMANENT = "1";
	
	public static final String DONATION_FAIL_CAUSE = "6";
	public static final String DONATION_FAIL_CAUSE_LOW_WEIGHT = "4";
	public static final String DONATION_FAIL_CAUSE_LOW_HEMOGLOBIN = "5";
	public static final String DONATION_FAIL_CAUSE_TRAVEL = "6";
	public static final String DONATION_FAIL_CAUSE_BEHAVIOR = "7";
	public static final String DONOR_GENDER = "1";
	public static final String DONOR_MALE = "1";
	public static final String DONOR_FEMALE = "2";
	public static final String DONOR_AGE_TO = "3";
	public static final String DONOR_AGE_FROM = "2";
	
	public static final String PRODUCT_TYPE = "1";
	public static final String PRODUCT_TYPE_PLAQUETAS= "1";
	public static final String PRODUCT_TYPE_PLASMA = "3";
	public static final String PRODUCT_TYPE_CRIOPRECIPITADO = "2";
	public static final String PRODUCT_TYPE_HEMATIES = "5";
	public static final String ADVERS_EVENT_SEVERITY = "6";
	public static final String ADVERS_EVENT_SEVERITY_SEVERE = "3";
	public static final String ADVERS_EVENT_ABO = "3";
	public static final String ADVERS_EVENT_RH = "4";
	public static final String DONATION_ANALYSIS = "9";
	public static final String DONATION_ANALYSIS_VHI = "3";
	public static final String DONATION_ANALYSIS_SYPHILIS = "1";
	public static final String DONATION_ANALYSIS_HEPATITIS_C = "2";
	public static final String DONATION_ANALYSIS_HEPATITIS_B = "4";
	public static final String ANALYSIS_RESULT = "10";
	public static final String ANALYSIS_RESULT_POSITIVE = "1";
	
	public static final String TEMPLATE_ID_ROOT = "2.16.840.1.113883.19.57.7.1.3.1";
	public static final String TEMPLATE_ID_EXTENTION = "CCD_RM201201CO01";
}
