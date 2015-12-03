package org.hemologica.salud.ejb.beans;

import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;

public interface StatisticsBeanLocal {

	DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics donationsStatisticsData);

}
