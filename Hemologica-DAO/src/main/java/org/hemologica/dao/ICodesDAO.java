package org.hemologica.dao;

import java.util.List;
import org.hemologica.dao.model.CitiesCode;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.DocumentsTypesCode;
import org.hemologica.dao.model.DonationEventsCode;
import org.hemologica.dao.model.DonationFailCausesCode;
import org.hemologica.dao.model.DonationFailTypeCode;
import org.hemologica.dao.model.DonationLaboratoyCode;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.ResponsibleTransfusionPerson;
import org.hemologica.dao.model.StatesCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionLaboratoryCode;
import org.hemologica.dao.model.UnitsType;

public interface ICodesDAO {
	
	public List<MessageSendOption> getMessageOptions();
	
	public List<UnitsType> getProducts();
	
	public List<DocumentsTypesCode> getDocumentsTypes();
	
	public List<CountriesCode> getCountries();
	
	public List<StatesCode> getStatesCode();
	
	public List<CitiesCode> getCities();

	public List<CitiesCode> getCitiesByState(String stateCode);

	public List<DonationFailTypeCode> getRejectionTypes();

	public List<DonationFailCausesCode> getRejectionReasons();

	public List<DonationLaboratoyCode> getDonationsAnalysis();

	public List<DonationEventsCode> getDonationsEvents();

	public List<ResponsibleTransfusionPerson> getResponsibleTransfusionPerson(String centerCode);

	public List<TransfusionLaboratoryCode> getTransfusionsAnalysis();

	public List<TransfusionEventsCode> getTransfusionsEvents();

}
