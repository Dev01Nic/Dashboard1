package org.nic.Index.repository;


import org.nic.Index.dto.RegdDealerSummaryDTO;
import org.nic.Index.model.regd_dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RegdDealerRepository extends JpaRepository<regd_dealer, Long> {
	
//	@Query("SELECT new org.nic.Index.dto.RegdDealerSummaryDTO(" +
//		       "COUNT(rd.tinNumber) AS vatRegistered, " +
//		       "COUNT(CASE WHEN rd.status = 'T' THEN 1 ELSE NULL END) AS vatTransferred, " +
//		       "COUNT(CASE WHEN rd.status = 'C' THEN 1 ELSE NULL END) AS vatCancelled, " +
//		       "MIN(rd.logDate) AS minLogDate, " +
//		       "MAX(rd.logDate) AS maxLogDate)"+
//		       "FROM regd_dealer rd")
//		RegdDealerSummaryDTO getVatSummary(); 
	
	@Query("SELECT new org.nic.Index.dto.RegdDealerSummaryDTO(" +
		       "COUNT(rd.tinNumber) AS vatRegistered, " +
		       "COUNT(CASE WHEN rd.status = 'T' THEN 1 ELSE NULL END) AS vatTransferred, " +
		       "COUNT(CASE WHEN rd.status = 'C' THEN 1 ELSE NULL END) AS vatCancelled, " +
		       "MIN(rd.logDate) AS minLogDate, " +
		       "MAX(rd.logDate) AS maxLogDate, " +
		       "COUNT(CASE WHEN MONTH(rd.logDate) = MONTH(CURRENT_DATE()) AND YEAR(rd.logDate) = YEAR(CURRENT_DATE()) THEN 1 ELSE NULL END) AS countByMonth, " +
		       "COUNT(CASE WHEN rd.status = 'C' AND MONTH(rd.logDate) = MONTH(CURRENT_DATE()) AND YEAR(rd.logDate) = YEAR(CURRENT_DATE()) THEN 1 ELSE NULL END) AS countvatCancelledByMonth, " +
		       "COUNT(CASE WHEN rd.status = 'T' AND  MONTH(rd.logDate) = MONTH(CURRENT_DATE()) AND YEAR(rd.logDate) = YEAR(CURRENT_DATE()) THEN 1 ELSE NULL END) AS countVatTransferredByMonth) " +
			"FROM regd_dealer rd")
		RegdDealerSummaryDTO getVatSummary();

	
	 @Query("SELECT COUNT(e.tinNumber) FROM regd_dealer e WHERE MONTH(e.logDate) = :month AND YEAR(e.logDate) = :year")
	    String countDealerByMonthAndYear(@Param("month") String month, @Param("year") String year);
}
