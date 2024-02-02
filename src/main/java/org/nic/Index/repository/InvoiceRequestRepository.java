package org.nic.Index.repository;

import org.nic.Index.dto.InvoiceRequestDTO;
import org.nic.Index.model.InvoiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InvoiceRequestRepository extends JpaRepository<InvoiceRequest, Long> {
	
	@Query("SELECT new org.nic.Index.dto.InvoiceRequestDTO(" +
		       "COUNT(rd.InvoiceNo) AS InvoiceRequest, " +
		       "MIN(rd.InvoiceDt) AS InvoiceDate, " +
		       "MAX(rd.InvoiceDt) AS MaxInvoiceDate, "+
		       "COUNT(CASE WHEN MONTH(rd.InvoiceDt) = MONTH(CURRENT_DATE()) AND YEAR(rd.InvoiceDt) = YEAR(CURRENT_DATE()) THEN 1 ELSE NULL END) AS CurrentMonthInvoice) " +
		       "FROM InvoiceRequest rd")
	
	InvoiceRequestDTO getInvoiceRequestSummary();
}
