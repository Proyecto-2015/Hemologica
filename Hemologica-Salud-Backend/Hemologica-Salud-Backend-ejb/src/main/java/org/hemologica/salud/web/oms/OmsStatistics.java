package org.hemologica.salud.web.oms;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import org.hemologica.constants.Constants;
import org.hemologica.dao.model.DonationFailCausesCode;
import org.hemologica.dao.model.DonationFailTypeCode;
import org.hemologica.dao.model.DonationFilterCode;
import org.hemologica.dao.model.DonationLaboratoyCode;
import org.hemologica.dao.model.EventSeverityCode;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.dao.model.ResultsCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionFilterCode;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataAnswer;
import org.hemologica.datatypes.DataQuestion;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;

public class OmsStatistics {
	
	private static Logger logger = Logger.getLogger(OmsStatistics.class.getName());
	private static int countDonations;
	private static List<Double> countAnalysis;
	private static List<Double> countDonationsDonorType;
	
	public static List<DataQuestion> getDonationsQuestions(List<List<String>> orClausesList, List<String> andClausesNumerator, 
			List<String> orClausesNoDataDenominator,List<String> filtersAnalysisDenominator,List<String> filtersAnalysisDenominatorNoData,EntityManager em){
		
		List<DataQuestion> questions = new ArrayList<>();
		
		/**
		 * Pregunta 1
		 */
		List<String> listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d1 = get1Question(orClausesList, listAux,filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d1);
		
		/**
		 * Pregunta 2
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d2 = get2Question(orClausesList, listAux,filtersAnalysisDenominator, orClausesNoDataDenominator,filtersAnalysisDenominatorNoData,em);
		questions.add(d2);
		
		/**
		 * Pregunta 3
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d3 = get3Question(orClausesList, listAux,filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d3);
		
		/**
		 * Pregunta 4
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d4 = get4Question(orClausesList, listAux,filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d4);
		
		/**
		 * Pregunta 5
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d5 = get5Question(orClausesList, listAux, filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d5);
		
		/**
		 * Pregunta 6
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d6 = get6Question(orClausesList, listAux,filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d6);
		
		/**
		 * Pregunta 7
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d7 = get7Question(orClausesList, listAux, filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d7);
		
		/**
		 * Pregunta 8
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d8 = get8Question(orClausesList, listAux, filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d8);
		
		/**
		 * Pregunta 9
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d9 = get9Question(orClausesList, listAux, filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d9);
		
		/**
		 * Pregunta 10
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d10 = get10Question(orClausesList, listAux, filtersAnalysisDenominator,orClausesNoDataDenominator,filtersAnalysisDenominatorNoData, em);
		questions.add(d10);
	
		return questions;
	}
	
	public static List<DataQuestion> getTransfusionsQuestions(List<List<String>> orClausesList, List<String> andClausesNumerator, 
			List<String> orClausesNoDataDenominator,List<String> filtersAnalysisDenominator,List<String> filtersAnalysisDenominatorNoData,EntityManager em){
	
		List<DataQuestion> questions = new ArrayList<>();
		/**
		 * ************************** Transfusiones ***************************
		 */
		List<String> listAux = new ArrayList<>();
		
		/**
		 * Pregunta 11
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d11 = get11Question(orClausesList, listAux,orClausesNoDataDenominator, em);
		questions.add(d11);
		
		/**
		 * Pregunta 12
		 */
		
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d12 = get12Question(orClausesList, listAux,orClausesNoDataDenominator, em);
		questions.add(d12);
		
		/**
		 * Pregunta 13
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d13 = get13Question(orClausesList, listAux,orClausesNoDataDenominator, em);
		questions.add(d13);
		
		/**
		 * Pregunta 14
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d14 = get14Question(orClausesList, listAux,orClausesNoDataDenominator, em);
		questions.add(d14);
		
		return questions;
		
	}
	
	public static DataQuestion get1Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator,
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
		
		List<String> listAux = new ArrayList<>();
		
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		try {
			
			q.setQuestion("Número de donantes activos que donaron sangre para un periodo de tiempo");
			
			DonationFilterCode donationFilterState = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilterState.getDonationFilterCodesPath() +"='" +Constants.COMPLETED + "'";
			andClausesNumerator.add(queryAfer);
			listAux.add(queryAfer);

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_TYPE);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilterState.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterState.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			String dateNodataType = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodataType);
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			orClausesNoDataDenominator.remove(dateNodataType);
			
			/****************************************************/
				
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Número de donantes voluntarios no remunerados.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_VOLUNTARY+"'";
			andClausesNumerator.add(query);
			
			int countVol = 0, countRepo = 0 , cantPersons =0; 
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Número total de donantes familiares/donantes de reposición.");
			
			String query2 = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_REPLACEMENTS+"'";
			listAux.add(query2);

			
			for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
				
				cantPersons++;
				
				List<String> orClausesCDAsIds = new ArrayList<>();
				for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
		
					String queryPersons = "$doc/ClinicalDocument/id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
					"$doc/ClinicalDocument/id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
					orClausesCDAsIds.add(queryPersons);
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,orClausesCDAsIds,filtersAnalysisDenominator) > 0){
					
					countVol++;
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(listAux,orClausesList,orClausesCDAsIds,filtersAnalysisDenominator) > 0){
					
					countRepo++;
					
				}	
			}
			
			d1.setAnswerResult(String.valueOf(countVol));
			d2.setAnswerResult(String.valueOf(countRepo));
			
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("Número total de donantes remunerados.");
			d3.setAnswerResult("0");
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Número total de donantes de sangre total.");
			d4.setAnswerResult(String.valueOf(countRepo + countVol));
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 1 del formulario OMS", e);
		}
		
		return q;
	}
	
	public static DataQuestion get2Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator, 
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
		
		countDonationsDonorType = new ArrayList<>();
		try {
			
			DonationFilterCode donationFilterState = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilterState.getDonationFilterCodesPath() +"='" +Constants.COMPLETED + "'";
			andClausesNumerator.add(queryAfer);
			
			countDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			
			q.setQuestion("Número de donaciones de sangre entera colectadas para un periodo de tiempo, por tipo de donación:");

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_TYPE);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilterState.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterState.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			String dateNodataType = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodataType);
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			orClausesNoDataDenominator.remove(dateNodataType);
			
			/****************************************************/
			
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Donaciones voluntarias no remuneradas.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_VOLUNTARY+"'";
			andClausesNumerator.add(query);
			double countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countDonationsDonorType.add(countNumerator);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
//			/ClinicalDocument/effectiveTime/@value		
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Donaciones de familiares/ de reposición");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_REPLACEMENTS+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countDonationsDonorType.add(countNumerator);
			d2.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("Donaciones remuneradas");
			d3.setAnswerResult("0");
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Otros tipos de donaciones");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_OTHER+"'";
			andClausesNumerator.add(query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Total de donaciones");
			d5.setAnswerResult(String.valueOf(countDonations));
				
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 2 del formulario OMS", e);
		}
		
		return q;
		
	}
	
	public static DataQuestion get3Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator, 
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData,EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Cantidad de donaciones que  efectuaron mediante aféresis (excluyendo las donaciones autólogas) para un periodo de tiempo:");

			DonationFilterCode donationFilterType = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_TYPE);
			String queryAfer = donationFilterType.getDonationFilterCodesPath() +"='" +Constants.DONATION_APHERESIS + "'";
			andClausesNumerator.add(queryAfer);
			
			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_TYPE);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilterType.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterType.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			String dateNodataType = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodataType);
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			orClausesNoDataDenominator.remove(dateNodataType);
			
			/****************************************************/
			
			int countDonationsAfer = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Donaciones voluntarias no remuneradas.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_VOLUNTARY+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Donaciones de familiares/ de reposición.");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_REPLACEMENTS+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d2.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("Donaciones remuneradas.");
			d3.setAnswerResult("0");
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Otros tipos de donaciones.");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_OTHER+"'";
			andClausesNumerator.add(query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Total de donaciones.");
			d5.setAnswerResult(String.valueOf(countDonationsAfer));
				
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 3 del formulario OMS", e);
		}
		
		return q;
		
	}
	
	public static DataQuestion get4Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator,
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData,EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
		
		List<String> listAux = new ArrayList<>();
		
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		try {
			
			q.setQuestion("Número de donantes potenciales que fueron diferidos (por tipo de diferimiento):");

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilter.getDonationFilterCodesPath() +"='" +Constants.CANCELED + "'";
			andClausesNumerator.add(queryAfer);
			listAux.add(queryAfer);
			
			DonationFilterCode donationFilterTypes = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_FAIL_TYPE);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/"+queryAfer + " and (" + "$doc/" +donationFilterTypes.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterTypes.getDonationFilterCodesPath() +"))" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			String dateNodataType =  "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodataType);
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			orClausesNoDataDenominator.remove(dateNodataType);
			
			/****************************************************/
			
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Diferimiento permanente.");
			
			DonationFailTypeCode failCause = FactoryDAO.getCodesDAO(em).getRejectionTypesById(Constants.DONATION_FAIL_TYPE_PERMANENT);
			String query = donationFilterTypes.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			
			andClausesNumerator.add(query);
			
			int countTemp = 0, countPerm = 0; 
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Diferimiento temporal.");
			
//			String query2 = donationFilterTypes.getDonationFilterCodesPath() + "='"+Constants.DONATION_FAIL_TYPE_TEMPORAL+"'";
			
			failCause = FactoryDAO.getCodesDAO(em).getRejectionTypesById(Constants.DONATION_FAIL_TYPE_TEMPORAL);
			String query2 = donationFilterTypes.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			listAux.add(query2);

			
			for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
				
				List<String> orClausesCDAsIds = new ArrayList<>();
				for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
		
					String queryPersons = "$doc/ClinicalDocument/id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
					"$doc/ClinicalDocument/id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
					orClausesCDAsIds.add(queryPersons);
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,orClausesCDAsIds,filtersAnalysisDenominator) > 0){
					
					countPerm++;
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(listAux,orClausesList,orClausesCDAsIds,filtersAnalysisDenominator) > 0){
					
					countTemp++;
					
				}	
			}
			
			d1.setAnswerResult(String.valueOf(countPerm));
			d2.setAnswerResult(String.valueOf(countTemp));
			
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 4 del formulario OMS", e);
		}
		
		return q;
	}
	
	public static DataQuestion get5Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator, 
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de diferimientos (donantes potenciales que fueron diferidos), por causa de diferimiento.");

			DonationFilterCode donationFilterState = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilterState.getDonationFilterCodesPath() +"='" +Constants.CANCELED+ "'";
			andClausesNumerator.add(queryAfer);
			
			int countDonationsDif = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			int countDif = 0;
			
			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_FAIL_CAUSE);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilterState.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterState.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			String dateNodataType = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodataType);
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			orClausesNoDataDenominator.remove(dateNodataType);
			
			/****************************************************/
			
			
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Peso bajo.");
			
			DonationFailCausesCode failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(Constants.DONATION_FAIL_CAUSE_LOW_WEIGHT);
			String query = donationFilter.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countDif+=countNumerator;
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Hemoglobina baja.");
			
			andClausesNumerator.remove(query);
			
			failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(Constants.DONATION_FAIL_CAUSE_LOW_HEMOGLOBIN);
			query = donationFilter.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countDif+=countNumerator;
			d2.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("Otras afecciones de tipo médico.");
			
//			andClausesNumerator.remove(query);
//			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONATION_FAIL_CAUSE_LOW_HEMOGLOBIN+"'";
//			andClausesNumerator.add(query);
//			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d3.setAnswerResult("sin datos.");

			
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Comportamiento de alto riesgo.");
			andClausesNumerator.remove(query);
			
			failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(Constants.DONATION_FAIL_CAUSE_BEHAVIOR);
			query = donationFilter.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countDif+=countNumerator;
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Historia de viajes.");
			andClausesNumerator.remove(query);
			
			failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(Constants.DONATION_FAIL_CAUSE_TRAVEL);
			query = donationFilter.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countDif+=countNumerator;
			d5.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d6 = new DataAnswer();
			q.getAnswers().add(d6);
			d6.setAnswer("Otros motivos.");
			d6.setAnswerResult(String.valueOf(countDonationsDif - countDif));
			
			DataAnswer d7 = new DataAnswer();
			q.getAnswers().add(d7);
			d7.setAnswer("Número total de diferimientos.");
			d7.setAnswerResult(String.valueOf(countDonationsDif));
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_OTHER+"'";
			andClausesNumerator.add(query);
	
				
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 5 del formulario OMS", e);
		}
		
		return q;
	}
	
	public static DataQuestion get6Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator,
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData,EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de donaciones de sangre extraídas a");

			DonationFilterCode donationFilterState = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilterState.getDonationFilterCodesPath() +"='" +Constants.COMPLETED+ "'";
			andClausesNumerator.add(queryAfer);
			
			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_GENDER);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilterState.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterState.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			String dateNodataType = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodataType);
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			orClausesNoDataDenominator.remove(dateNodataType);
			
			/****************************************************/
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Hombres.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_MALE+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Mujeres.");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_FEMALE+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d2.setAnswerResult(String.valueOf(countNumerator));
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 6 del formulario OMS", e);
		}
		
		return q;
	}

	public static DataQuestion get7Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator,
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData,EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de donaciones de sangre extraídas según la edad del donante");

			DonationFilterCode donationFilterState = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilterState.getDonationFilterCodesPath() +"='" +Constants.COMPLETED+ "'";
			andClausesNumerator.add(queryAfer);
			
			DonationFilterCode donationFilterFrom = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_AGE_FROM);
			DonationFilterCode donationFilterTo = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_AGE_TO);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilterState.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterState.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			String dateNodataType = "$doc/" +donationFilterFrom.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterFrom.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodataType);
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			orClausesNoDataDenominator.remove(dateNodataType);
			
			/****************************************************/
			
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Menores de 18 años.");
			
			String query = getQueryToAge(donationFilterTo.getDonationFilterCodesPath(), 17);
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("18 a 24 años.");
			
			andClausesNumerator.remove(query);
			query = getQueryFromAge(donationFilterFrom.getDonationFilterCodesPath(), 18);
			String queryTo = getQueryToAge(donationFilterTo.getDonationFilterCodesPath(), 24);
			andClausesNumerator.add(query);
			andClausesNumerator.add(queryTo);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			
			d2.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("25 a 44 años.");
			
			andClausesNumerator.remove(query);
			andClausesNumerator.remove(queryTo);
			query = getQueryFromAge(donationFilterFrom.getDonationFilterCodesPath(), 25);
			queryTo = getQueryToAge(donationFilterTo.getDonationFilterCodesPath(), 44);
			andClausesNumerator.add(query);
			andClausesNumerator.add(queryTo);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			
			d3.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("45 a 64 años.");
			
			andClausesNumerator.remove(query);
			andClausesNumerator.remove(queryTo);
			query = getQueryFromAge(donationFilterFrom.getDonationFilterCodesPath(), 45);
			queryTo = getQueryToAge(donationFilterTo.getDonationFilterCodesPath(), 64);
			andClausesNumerator.add(query);
			andClausesNumerator.add(queryTo);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Mayores de 65 años.");
			
			andClausesNumerator.remove(query);
			andClausesNumerator.remove(queryTo);
			query = getQueryFromAge(donationFilterFrom.getDonationFilterCodesPath(), 65);
			
			andClausesNumerator.add(query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d5.setAnswerResult(String.valueOf(countNumerator));
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 7 del formulario OMS", e);
		}
		
		return q;
	}
	
	public static DataQuestion get8Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator,
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData,EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
		
		countAnalysis = new ArrayList<>();
		try {
			
			q.setQuestion("Número y porcentaje de donaciones (sangre entera y aféresis) sometidas a pruebas de detección de las siguientes infecciones transmisibles por transfusión (Número de pruebas de detección (Numerador)/ Número de donaciones total (Denominador)):");

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_ANALYSIS);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			filtersAnalysisDenominatorNoData.add(dateNodata);
			
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			filtersAnalysisDenominatorNoData.remove(dateNodata);
			
			/****************************************************/

			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("VIH 1+2.");
			
			DonationLaboratoyCode lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_VHI);
			String query = donationFilter.getDonationFilterCodesPath() + "='"+lab.getConcept().getConceptCode()+"'";
			filtersAnalysisDenominator.add(0, query);
			
			double countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countAnalysis.add(countNumerator);
			double percentage = (countDonations != 0) ? countNumerator/countDonations*100 : 0;
			d1.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentage)) + "%");
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("HBV.");
			
			filtersAnalysisDenominator.remove(0);
			lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_HEPATITIS_B);
			query = donationFilter.getDonationFilterCodesPath() + "='"+lab.getConcept().getConceptCode()+"'";
			filtersAnalysisDenominator.add(0, query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countAnalysis.add(countNumerator);
			percentage = (countDonations != 0) ? countNumerator/countDonations*100 : 0;
			d2.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentage)) + "%");
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("HCV.");
			
			filtersAnalysisDenominator.remove(0);
			lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_HEPATITIS_C);
			query = donationFilter.getDonationFilterCodesPath() + "='"+lab.getConcept().getConceptCode()+"'";
			filtersAnalysisDenominator.add(0, query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countAnalysis.add(countNumerator);
			percentage = (countDonations != 0) ? countNumerator/countDonations*100 : 0;
			d3.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentage)) + "%");
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Sífilis.");
			
			filtersAnalysisDenominator.remove(0);
			lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_SYPHILIS);
			query = donationFilter.getDonationFilterCodesPath() + "='"+lab.getConcept().getConceptCode()+"'";
			filtersAnalysisDenominator.add(0, query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			countAnalysis.add(countNumerator);
			percentage = (countDonations != 0) ? countNumerator/countDonations*100 : 0;
			d4.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentage))+ "%");
			filtersAnalysisDenominator.remove(0);
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Enfermedad de Chagas.");
			d5.setAnswerResult("0 - 0%");
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 8 del formulario OMS", e);
			
		}
		
		return q;
	}
	
	public static DataQuestion get9Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator,
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData,EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Prevalencia (Número y porcentaje) de infecciones en donaciones que resultaron positivas para las siguientes pruebas de ITT (Número de positivos/reactivos (Numerador)/Número de pruebas de detección (Denominador)):");

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.ANALYSIS_RESULT);
			
			ResultsCode event = FactoryDAO.getCodesDAO(em).getResultById(Constants.ANALYSIS_RESULT_POSITIVE);
			
			String pathQuery = donationFilter.getDonationFilterCodesPath() +"='"+event.getConcept().getConceptCode()+ "'";
			
			
			/**
			 * Sin datos
			 */
			String path = donationFilter.getDonationFilterCodesPath().replace("/" +Constants.VAR_EVENT_FILTER +"/", "");
			String dateNodata = "$doc/" +path+"='' or "
					+ "not("+"$doc/" + path +")" ;
			
			filtersAnalysisDenominatorNoData.add(dateNodata);
			
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			filtersAnalysisDenominatorNoData.remove(dateNodata);
			
			/****************************************************/
			
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("VIH 1+2.");
			
			DonationLaboratoyCode lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_VHI);
			
			String filterEvent = Constants.ANALYSIS_FILTER + "'" + lab.getConcept().getConceptCode() + "']";
			String query = pathQuery.replace(Constants.VAR_EVENT_FILTER, filterEvent) ;
			filtersAnalysisDenominator.add(0, query);
			double countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			double percentaje = (countAnalysis != null && countAnalysis.get(0) != 0) ?  countNumerator/countAnalysis.get(0)*100 : 0;
			d1.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentaje))+ "%");		
			

			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("HBV.");
			
			filtersAnalysisDenominator.remove(0);
			
			lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_HEPATITIS_B);
			filterEvent = Constants.ANALYSIS_FILTER + "'" + lab.getConcept().getConceptCode() + "']";
			query = pathQuery.replace(Constants.VAR_EVENT_FILTER, filterEvent) ;
			filtersAnalysisDenominator.add(0, query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);

			percentaje = (countAnalysis != null && countAnalysis.get(1) != 0) ?  countNumerator/countAnalysis.get(1)*100 : 0;
			d2.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentaje))+ "%");
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("HCV.");
			
			filtersAnalysisDenominator.remove(0);
			
			lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_HEPATITIS_C);
			filterEvent = Constants.ANALYSIS_FILTER + "'" + lab.getConcept().getConceptCode() + "']";
			query = pathQuery.replace(Constants.VAR_EVENT_FILTER, filterEvent) ;
			filtersAnalysisDenominator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);

			percentaje = (countAnalysis != null && countAnalysis.get(2) != 0) ?  countNumerator/countAnalysis.get(2)*100 : 0;
			d3.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentaje))+ "%");


			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Sífilis.");
			filtersAnalysisDenominator.remove(query);
			
			lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_SYPHILIS);
			filterEvent = Constants.ANALYSIS_FILTER + "'" + lab.getConcept().getConceptCode() + "']";
			query = pathQuery.replace(Constants.VAR_EVENT_FILTER, filterEvent) ;
			filtersAnalysisDenominator.add(0, query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);

			percentaje = (countAnalysis != null && countAnalysis.get(3) != 0) ?  countNumerator/countAnalysis.get(3)*100 : 0;
			d4.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentaje))+ "%");
//			
			filtersAnalysisDenominator.remove(0);
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Enfermedad de Chagas.");
			d5.setAnswerResult("0 - 0%");
			
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 9 del formulario OMS", e);
		}
		
		return q;
	}
	
	public static DataQuestion get10Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> filtersAnalysisDenominator,
			List<String> orClausesNoDataDenominator, List<String> filtersAnalysisDenominatorNoData, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número y % de infecciones por VIH categorizadas como sigue:");

			DonationFilterCode donationFilterAnalysis = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.ANALYSIS_RESULT);
			ResultsCode event = FactoryDAO.getCodesDAO(em).getResultById(Constants.ANALYSIS_RESULT_POSITIVE);
			String pathQuery = donationFilterAnalysis.getDonationFilterCodesPath() +"='"+event.getConcept().getConceptCode()+ "'";
			String pathQueryNoDta = donationFilterAnalysis.getDonationFilterCodesPath() +"=''";
			
			DonationLaboratoyCode lab = FactoryDAO.getCodesDAO(em).getDonationsAnalysisById(Constants.DONATION_ANALYSIS_VHI);		
			String filterEvent = Constants.ANALYSIS_FILTER + "'" + lab.getConcept().getConceptCode() + "']";
			String filterEventNoData = Constants.ANALYSIS_FILTER + "'']";
			
			String queryAnalysis = pathQuery.replace(Constants.VAR_EVENT_FILTER, filterEvent) ;
			pathQueryNoDta = pathQueryNoDta.replace(Constants.VAR_EVENT_FILTER, filterEventNoData);
			
			filtersAnalysisDenominator.add(queryAnalysis);
			
			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_TYPE);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
			
			filtersAnalysisDenominatorNoData.add(pathQueryNoDta);
			
			int nodata = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator,filtersAnalysisDenominatorNoData);
			
			q.setNodata(nodata);
			
			filtersAnalysisDenominatorNoData.remove(pathQueryNoDta);
			
			orClausesNoDataDenominator.remove(dateNodata);
			
			/****************************************************/
			
			
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Donaciones voluntarias no remuneradas.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_VOLUNTARY+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			
			double percentaje = (countDonationsDonorType != null && countDonationsDonorType.get(0) != 0) ?  countNumerator/countDonationsDonorType.get(0)*100 : 0;
			d1.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentaje))+ "%");

			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Donaciones de familiares/ de reposición");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_REPLACEMENTS+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			
			percentaje = (countDonationsDonorType != null && countDonationsDonorType.get(1) != 0) ?  countNumerator/countDonationsDonorType.get(1)*100 : 0;
			d2.setAnswerResult(String.valueOf(countNumerator) + " - " + String.valueOf(new DecimalFormat("#.##").format(percentaje))+ "%");
			
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("Donaciones remuneradas");
			d3.setAnswerResult("0");
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Otros tipos de donaciones");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_OTHER+"'";
			andClausesNumerator.add(query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
			d4.setAnswerResult(String.valueOf(countNumerator));		
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 10 del formulario OMS", e);
			
		}
		return q;
	}
	
	public static DataQuestion get11Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> orClausesNoDataDenominator,  EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de unidades  de sangre y de los siguientes componentes sanguíneos distribuidos / transfundidos en el país (exceptuando las unidades de sangre autóloga)");

			TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.PRODUCT_TYPE);
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilter.getTransfusionFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilter.getTransfusionFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
		
			int nodata = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataDenominator,null);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			
			/****************************************************/
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Plaquetas.");
			
			UnitsType unit = FactoryDAO.getCodesDAO(em).getProductById(Constants.PRODUCT_TYPE_PLAQUETAS);
			String query = donationFilter.getTransfusionFilterCodesPath() + "='"+ unit.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			
			d1.setAnswerResult(String.valueOf(countNumerator));
			

			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Plasma.");
			
			andClausesNumerator.remove(query);
			
			unit = FactoryDAO.getCodesDAO(em).getProductById(Constants.PRODUCT_TYPE_PLASMA);
			query = donationFilter.getTransfusionFilterCodesPath() + "='"+unit.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);

			d2.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("Sangre entera.");
			d3.setAnswerResult("0");

			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("Hematíes.");
			andClausesNumerator.remove(query);
			
			unit = FactoryDAO.getCodesDAO(em).getProductById(Constants.PRODUCT_TYPE_HEMATIES);
			query = donationFilter.getTransfusionFilterCodesPath() + "='"+unit.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Crioprecipitado");
			andClausesNumerator.remove(query);
			
			unit = FactoryDAO.getCodesDAO(em).getProductById(Constants.PRODUCT_TYPE_CRIOPRECIPITADO);
			query = donationFilter.getTransfusionFilterCodesPath() + "='"+unit.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			d5.setAnswerResult(String.valueOf(countNumerator));
			
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 11 del formulario OMS", e);
			
		}
		
		return q;
	}

	public static DataQuestion get12Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> orClausesNoDataDenominator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de pacientes transfundidos en el país.");
			
			/**
			 * Sin datos
			 */
			
		
			int nodata = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataDenominator,null);
			
			q.setNodata(nodata);
			
			/****************************************************/
			
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("");
			
			int cantTransfusions = 0;
			for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
				
				List<String> orClausesCDAsIds = new ArrayList<>();
				for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
		
					String query = "$doc/ClinicalDocument/id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
					"$doc/ClinicalDocument/id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
					orClausesCDAsIds.add(query);
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,orClausesCDAsIds,null) > 0){
					
					cantTransfusions++;
					
				}	
					
			}
			d1.setAnswerResult(String.valueOf(cantTransfusions));
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 12 del formulario OMS", e);
			
		}
		
		return q;
	}
	
	public static DataQuestion get13Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> orClausesNoDataDenominator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de pacientes transfundidos (en función de su edad).");
			
			TransfusionFilterCode donationFilterFrom = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.DONOR_AGE_FROM);
			TransfusionFilterCode donationFilterTo = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.DONOR_AGE_TO);
			
			
			/**
			 * Sin datos
			 */
			String dateNodata = "$doc/" +donationFilterFrom.getTransfusionFilterCodesPath()+"='' or "
					+ "not("+"$doc/" + donationFilterFrom.getTransfusionFilterCodesPath() +")" ;
			
			orClausesNoDataDenominator.add(dateNodata);
			
		
			int nodata = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataDenominator,null);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			
			/****************************************************/
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Menores de 5 años.");
			
			String query = getQueryToAge(donationFilterTo.getTransfusionFilterCodesPath(), 4);
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("De 5 a 14 años.");
			
			andClausesNumerator.remove(query);
			query = getQueryFromAge(donationFilterFrom.getTransfusionFilterCodesPath(), 5);
			String queryTo = getQueryToAge(donationFilterTo.getTransfusionFilterCodesPath(), 14);
			andClausesNumerator.add(query);
			andClausesNumerator.add(queryTo);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			
			d2.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d3 = new DataAnswer();
			q.getAnswers().add(d3);
			d3.setAnswer("De 15 a 44 años.");
			
			andClausesNumerator.remove(query);
			andClausesNumerator.remove(queryTo);
			query = getQueryFromAge(donationFilterFrom.getTransfusionFilterCodesPath(), 15);
			queryTo = getQueryToAge(donationFilterTo.getTransfusionFilterCodesPath(), 44);
			andClausesNumerator.add(query);
			andClausesNumerator.add(queryTo);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			
			d3.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d4 = new DataAnswer();
			q.getAnswers().add(d4);
			d4.setAnswer("De 45 a 59 años");
			
			andClausesNumerator.remove(query);
			andClausesNumerator.remove(queryTo);
			query = getQueryFromAge(donationFilterFrom.getTransfusionFilterCodesPath(), 45);
			queryTo = getQueryToAge(donationFilterTo.getTransfusionFilterCodesPath(), 59);
			andClausesNumerator.add(query);
			andClausesNumerator.add(queryTo);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Mayores de 60 años.");
			
			andClausesNumerator.remove(query);
			andClausesNumerator.remove(queryTo);
			query = getQueryFromAge(donationFilterFrom.getTransfusionFilterCodesPath(), 60);
			
			andClausesNumerator.add(query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			d5.setAnswerResult(String.valueOf(countNumerator));
			
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 13 del formulario OMS", e);
		}
		
		return q;
	}
	
	public static DataQuestion get14Question(List<List<String>> orClausesList, List<String> andClausesNumerator, List<String> orClausesNoDataDenominator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de reacciones adversas graves relacionadas con las transfusiones que se han notificado en el país");

			TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.ADVERS_EVENT_SEVERITY);
			
			EventSeverityCode event = FactoryDAO.getCodesDAO(em).getSeverityById(Constants.ADVERS_EVENT_SEVERITY_SEVERE);
			
			String pathQuery = donationFilter.getTransfusionFilterCodesPath() +"='"+event.getConcept().getConceptCode()+ "'";
			
			/**
			 * Sin datos
			 */
			String path = donationFilter.getTransfusionFilterCodesPath().replace("/"+Constants.VAR_EVENT_FILTER+"/", "");
			String dateNodata = "$doc/" +path+"=''";
			
			orClausesNoDataDenominator.add(dateNodata);
			
		
			int nodata = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataDenominator,null);
			
			q.setNodata(nodata);
			
			orClausesNoDataDenominator.remove(dateNodata);
			
			/****************************************************/
			
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Hemólisis debida a incompatibilidad ABO.");
			
			TransfusionEventsCode unit = FactoryDAO.getCodesDAO(em).getTransfusionEventById(Constants.ADVERS_EVENT_ABO);
			
			String filterEvent = Constants.EVENT_FILTER + "'" + unit.getConcept().getConceptCode() + "']";
			String query = pathQuery.replace(Constants.VAR_EVENT_FILTER, filterEvent) ;
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			
			d1.setAnswerResult(String.valueOf(countNumerator));
			

			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Hemólisis debida a incompatibilidad RH.");
			
			andClausesNumerator.remove(query);
			
			unit = FactoryDAO.getCodesDAO(em).getTransfusionEventById(Constants.ADVERS_EVENT_RH);
			filterEvent = Constants.EVENT_FILTER + "'" + unit.getConcept().getConceptCode() + "']";
			query = pathQuery.replace(Constants.VAR_EVENT_FILTER, filterEvent) ;
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);

			d2.setAnswerResult(String.valueOf(countNumerator));
			
		
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la pregunta 14 del formulario OMS", e);
		}
		
		return q;
	}

	private static String getQueryFromAge(String queryPath, int ageFrom){
		
		Calendar dateFrom = Calendar.getInstance();
		dateFrom.add(Calendar.YEAR, (ageFrom)*(-1));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String dateFromString = sdf.format(dateFrom.getTime());
		
		String query = queryPath + "<='" + dateFromString +"'";
		
		return query;
	}
	
	private static String getQueryToAge(String queryPath, int ageFrom){
	
		Calendar dateFrom = Calendar.getInstance();
		dateFrom.add(Calendar.YEAR, (ageFrom+1)*(-1));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		String dateFromString = sdf.format(dateFrom.getTime());
		
		String query = queryPath + ">='" + dateFromString +"'";
						
		return query;
		
	}
}
