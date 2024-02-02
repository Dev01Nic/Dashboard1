package org.nic.Index.repository;

import java.util.Date;

import org.nic.Index.dto.CformIssuedDTO;
import org.nic.Index.model.cformIssued;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CformIssuedRepository extends JpaRepository<cformIssued, Long> {
	@Query("SELECT new org.nic.Index.dto.CformIssuedDTO(" +
		       "COUNT(rd.finalSlNo) AS CformIssued, " +
		       "MIN(rd.logDate) AS MinIssuedDate, " +
		       "MAX(rd.logDate) AS MaxIssuedDate," +
		       "COUNT(CASE WHEN MONTH(rd.logDate) = MONTH(CURRENT_DATE()) AND YEAR(rd.logDate) = YEAR(CURRENT_DATE()) THEN 1 ELSE NULL END) AS countIssuedByMonth) " +
		       "FROM cformIssued rd")
		CformIssuedDTO getCformIssuedSummary();
}
