package org.hemologica.salud.ejb.beans;

import javax.ejb.Local;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

@Local
public interface StatisticsBeanLocal {

	DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics donationsStatisticsData) throws XMLDataBaseException;

}
