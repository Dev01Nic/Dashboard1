package org.nic.Index.repository;

import org.nic.Index.dto.CformRequestDTO;
import org.nic.Index.model.cformRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CformRequestRepository extends JpaRepository<cformRequest, Long> {
	 @Query("SELECT new org.nic.Index.dto.CformRequestDTO(" +
		       "COUNT(rd.requestNo) AS CformCount, " +
		       "MIN(rd.requestDt) AS CRequestDate, " +
		       "MAX(rd.requestDt) AS MaxRequestDate,"+
		       "COUNT(CASE WHEN MONTH(rd.requestDt) = MONTH(CURRENT_DATE()) AND YEAR(rd.requestDt) = YEAR(CURRENT_DATE()) THEN 1 ELSE NULL END) AS CountRequestByMonth) " +
		       "FROM cformRequest rd")
		CformRequestDTO getCformRequestSummary();
	 
	 @Query("SELECT COUNT(e.requestNo) FROM cformRequest e WHERE MONTH(e.requestDt) = :month AND YEAR(e.requestDt) = :year")
	    String countByRequestDtMonthAndYear(@Param("month") String month, @Param("year") String year);
}
