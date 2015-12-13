package org.hemologica.salud.web.oms;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import org.hemologica.constants.Constants;
import org.hemologica.dao.model.DonationFailCausesCode;
import org.hemologica.dao.model.DonationFilterCode;
import org.hemologica.dao.model.EventSeverityCode;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionFilterCode;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataAnswer;
import org.hemologica.datatypes.DataQuestion;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.utils.FactoryBeans;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;

public class OmsStatistics {
	
	private Logger logger = Logger.getLogger(OmsStatistics.class.getName());
	
	public static List<DataQuestion> getQuestions(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		List<DataQuestion> questions = new ArrayList<>();
		
		/**
		 * Pregunta 1
		 */
		List<String> listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d1 = get1Question(orClausesList, listAux, em);
		questions.add(d1);
		
		/**
		 * Pregunta 2
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d2 = get2Question(orClausesList, listAux, em);
		questions.add(d2);
		
		/**
		 * Pregunta 3
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d3 = get3Question(orClausesList, listAux, em);
		questions.add(d3);
		
		/**
		 * Pregunta 4
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d4 = get4Question(orClausesList, listAux, em);
		questions.add(d4);
		
		/**
		 * Pregunta 5
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d5 = get5Question(orClausesList, listAux, em);
		questions.add(d5);
		
		/**
		 * Pregunta 6
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d6 = get6Question(orClausesList, listAux, em);
		questions.add(d6);
		
		/**
		 * Pregunta 7
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d7 = get7Question(orClausesList, listAux, em);
		questions.add(d7);
		
		/**
		 * Pregunta 8
		 */
		/**
		 * Pregunta 9
		 */
		/**
		 * Pregunta 10
		 */
		
		/**
		 * Pregunta 11
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d11 = get11Question(orClausesList, listAux, em);
		questions.add(d11);
		
		/**
		 * Pregunta 12
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d12 = get12Question(orClausesList, listAux, em);
		questions.add(d12);
		
		/**
		 * Pregunta 13
		 */
		listAux = new ArrayList<>();
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		DataQuestion d13 = get13Question(orClausesList, listAux, em);
		questions.add(d13);
		
		return questions;
		
	}
	
	public static DataQuestion get1Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
		
		List<String> listAux = new ArrayList<>();
		
		for(String s : andClausesNumerator){
			
			listAux.add(new String(s));
		}
		
		try {
			
			q.setQuestion("Número de donantes activos que donaron sangre para un periodo de tiempo");

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_TYPE);
			
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
		
					String queryPersons = "$doc//ClinicalDocument//id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
					"$doc//ClinicalDocument//id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
					orClausesCDAsIds.add(queryPersons);
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,orClausesCDAsIds,null) > 0){
					
					countVol++;
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(listAux,orClausesList,orClausesCDAsIds,null) > 0){
					
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
			d4.setAnswerResult(String.valueOf(cantPersons));
			
		} catch (XMLDataBaseException e) {
			
			
		}
		
		return q;
	}
	
	public static DataQuestion get2Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			int countDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			
			q.setQuestion("Número de donaciones de sangre entera colectadas para un periodo de tiempo, por tipo de donación:");

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_TYPE);
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Donaciones voluntarias no remuneradas.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_VOLUNTARY+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Donaciones de familiares/ de reposición");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_REPLACEMENTS+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
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
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Total de donaciones");
			d5.setAnswerResult(String.valueOf(countDonations));
				
		} catch (XMLDataBaseException e) {
			
			
		}
		
		return q;
		
	}
	
	public static DataQuestion get3Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Cantidad de donaciones que  efectuaron mediante aféresis (excluyendo las donaciones autólogas) para un periodo de tiempo:");

			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_TYPE);
			String queryAfer = donationFilter.getDonationFilterCodesPath() +"='" +Constants.DONATION_APHERESIS + "'";
			andClausesNumerator.add(queryAfer);
			
			int countDonationsAfer = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Donaciones voluntarias no remuneradas.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_VOLUNTARY+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Donaciones de familiares/ de reposición.");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_TYPE_REPLACEMENTS+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
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
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Total de donaciones.");
			d5.setAnswerResult(String.valueOf(countDonationsAfer));
				
		} catch (XMLDataBaseException e) {
			
			
		}
		
		return q;
		
	}
	
	public static DataQuestion get4Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
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
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Diferimiento permanente.");
			
			String query = donationFilterTypes.getDonationFilterCodesPath() + "='"+Constants.DONATION_FAIL_TYPE_PERMANENT+"'";
			andClausesNumerator.add(query);
			
			int countVol = 0, countRepo = 0 , cantPersons =0; 
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Diferimiento temporal.");
			
			String query2 = donationFilterTypes.getDonationFilterCodesPath() + "='"+Constants.DONATION_FAIL_TYPE_TEMPORAL+"'";
			listAux.add(query2);

			
			for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
				
				cantPersons++;
				
				List<String> orClausesCDAsIds = new ArrayList<>();
				for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
		
					String queryPersons = "$doc//ClinicalDocument//id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
					"$doc//ClinicalDocument//id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
					orClausesCDAsIds.add(queryPersons);
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,orClausesCDAsIds,null) > 0){
					
					countVol++;
					
				}
				
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(listAux,orClausesList,orClausesCDAsIds,null) > 0){
					
					countRepo++;
					
				}	
			}
			
			d1.setAnswerResult(String.valueOf(countVol));
			d2.setAnswerResult(String.valueOf(countRepo));
			
			
		} catch (XMLDataBaseException e) {
			
			
		}
		
		return q;
	}
	
	public static DataQuestion get5Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de diferimientos (donantes potenciales que fueron diferidos), por causa de diferimiento.");

			DonationFilterCode donationFilterState = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilterState.getDonationFilterCodesPath() +"='" +Constants.CANCELED+ "'";
			andClausesNumerator.add(queryAfer);
			
			int countDonationsDif = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			int countDif = 0;
			
			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_FAIL_CAUSE);
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Peso bajo.");
			
			DonationFailCausesCode failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(Constants.DONATION_FAIL_CAUSE_LOW_WEIGHT);
			String query = donationFilter.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			countDif+=countNumerator;
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Hemoglobina baja.");
			
			andClausesNumerator.remove(query);
			
			failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(Constants.DONATION_FAIL_CAUSE_LOW_HEMOGLOBIN);
			query = donationFilter.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
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
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			countDif+=countNumerator;
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Historia de viajes.");
			andClausesNumerator.remove(query);
			
			failCause = FactoryDAO.getCodesDAO(em).getRejectionCauseById(Constants.DONATION_FAIL_CAUSE_TRAVEL);
			query = donationFilter.getDonationFilterCodesPath() + "='"+failCause.getConcept().getConceptCode()+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
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
			
			
		}
		
		return q;
	}
	
	
	public static DataQuestion get6Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de donaciones de sangre extraídas a");

			DonationFilterCode donationFilterState = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONATION_STATE);
			String queryAfer = donationFilterState.getDonationFilterCodesPath() +"='" +Constants.COMPLETED+ "'";
			andClausesNumerator.add(queryAfer);
			
			DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(Constants.DONOR_GENDER);
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Hombres.");
			
			String query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_MALE+"'";
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("Mujeres.");
			
			andClausesNumerator.remove(query);
			query = donationFilter.getDonationFilterCodesPath() + "='"+Constants.DONOR_FEMALE+"'";
			andClausesNumerator.add(query);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d2.setAnswerResult(String.valueOf(countNumerator));
		
		} catch (XMLDataBaseException e) {
			
			
		}
		
		return q;
	}

	
	public static DataQuestion get7Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
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
			
			// Respuestas
			DataAnswer d1 = new DataAnswer();
			q.getAnswers().add(d1);
			d1.setAnswer("Menores de 18 años.");
			
			String query = getQueryToAge(donationFilterTo.getDonationFilterCodesPath(), 17);
			andClausesNumerator.add(query);
			int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d1.setAnswerResult(String.valueOf(countNumerator));
			
			
			DataAnswer d2 = new DataAnswer();
			q.getAnswers().add(d2);
			d2.setAnswer("18 a 24 años.");
			
			andClausesNumerator.remove(query);
			query = getQueryFromAge(donationFilterFrom.getDonationFilterCodesPath(), 18);
			String queryTo = getQueryToAge(donationFilterTo.getDonationFilterCodesPath(), 24);
			andClausesNumerator.add(query);
			andClausesNumerator.add(queryTo);
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			
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
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			
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
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d4.setAnswerResult(String.valueOf(countNumerator));
			
			DataAnswer d5 = new DataAnswer();
			q.getAnswers().add(d5);
			d5.setAnswer("Mayores de 65 años.");
			
			andClausesNumerator.remove(query);
			andClausesNumerator.remove(queryTo);
			query = getQueryFromAge(donationFilterFrom.getDonationFilterCodesPath(), 65);
			
			andClausesNumerator.add(query);
			
			countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,null);
			d5.setAnswerResult(String.valueOf(countNumerator));
		
		} catch (XMLDataBaseException e) {
			
			
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
	
	
	public static DataQuestion get11Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de unidades  de sangre y de los siguientes componentes sanguíneos distribuidos / transfundidos en el país (exceptuando las unidades de sangre autóloga)");

			TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.PRODUCT_TYPE);

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
			
			
		}
		
		return q;
	}

	

	public static DataQuestion get12Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de pacientes transfundidos en el país.");
			
			int countTransfusions = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
			
			TransfusionFilterCode donationFilterFrom = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.DONOR_AGE_FROM);
			TransfusionFilterCode donationFilterTo = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.DONOR_AGE_TO);
			
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
			
			DataAnswer d6 = new DataAnswer();
			q.getAnswers().add(d6);
			d6.setAnswer("Total.");
			d6.setAnswerResult(String.valueOf(countTransfusions));
		
		} catch (XMLDataBaseException e) {
			
			
		}
		
		return q;
	}
	
	public static DataQuestion get13Question(List<List<String>> orClausesList, List<String> andClausesNumerator, EntityManager em){
		
		DataQuestion q = new DataQuestion();
		List<DataAnswer> answers = new ArrayList<>();
		q.setAnswers(answers);
			
		try {
			
			q.setQuestion("Número de reacciones adversas graves relacionadas con las transfusiones que se han notificado en el país");

			TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(Constants.ADVERS_EVENT_SEVERITY);
			
			EventSeverityCode event = FactoryDAO.getCodesDAO(em).getSeverityById(Constants.ADVERS_EVENT_SEVERITY_SEVERE);
			
			String pathQuery = donationFilter.getTransfusionFilterCodesPath() +"='"+event.getConcept().getConceptCode()+ "'";
			
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
			
//			DataAnswer d3 = new DataAnswer();
//			q.getAnswers().add(d3);
//			d3.setAnswer("Sangre entera.");
//			d3.setAnswerResult("0");
//
//			
//			DataAnswer d4 = new DataAnswer();
//			q.getAnswers().add(d4);
//			d4.setAnswer("Hematíes.");
//			andClausesNumerator.remove(query);
//			
//			unit = FactoryDAO.getCodesDAO(em).getProductById(Constants.PRODUCT_TYPE_HEMATIES);
//			query = donationFilter.getTransfusionFilterCodesPath() + "='"+unit.getConcept().getConceptCode()+"'";
//			andClausesNumerator.add(query);
//			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
//			d4.setAnswerResult(String.valueOf(countNumerator));
//			
//			
//			DataAnswer d5 = new DataAnswer();
//			q.getAnswers().add(d5);
//			d5.setAnswer("Crioprecipitado");
//			andClausesNumerator.remove(query);
//			
//			unit = FactoryDAO.getCodesDAO(em).getProductById(Constants.PRODUCT_TYPE_CRIOPRECIPITADO);
//			query = donationFilter.getTransfusionFilterCodesPath() + "='"+unit.getConcept().getConceptCode()+"'";
//			andClausesNumerator.add(query);
//			countNumerator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
//			d5.setAnswerResult(String.valueOf(countNumerator));
			
		
		} catch (XMLDataBaseException e) {
			
			
		}
		
		return q;
	}
}
