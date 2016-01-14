package org.hemologica.dao.constants;

public class ConstantsCDA {

	public final static String BLOOD_TYPE_PATH = "/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = 'COMP']//observation//code/@code";
	public final static String DONATION_STATE_PATH = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/statusCode/@code";
	public final static String DONATION_FAIL_TYPE = "/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship//observation//value//@code";
	public final static String DONATION_FAIL_DAYS = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/value/@value";
	public final static String DONATION_DATE= "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value";
	public final static String GENDER= "/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code";
	
}
