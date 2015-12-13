package org.hemologica.salud.ejb.beans;

import java.io.ByteArrayOutputStream;
import javax.ejb.Local;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataOmsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

@Local
public interface StatisticsBeanLocal {

	DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics donationsStatisticsData) throws XMLDataBaseException;

	DataTransfusionsStatisticsResults getTransfusionsStatistics(DataTransfusionsStatistics donationsStatisticsData) throws XMLDataBaseException;

	ByteArrayOutputStream getOmsStatistics(DataOmsStatistics statictic);

}
