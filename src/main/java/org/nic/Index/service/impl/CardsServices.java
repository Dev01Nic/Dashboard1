package org.nic.Index.service.impl;

import java.time.Month;
import java.time.Year;
import java.util.Date;

import org.nic.Index.dto.CformIssuedDTO;
import org.nic.Index.dto.CformRequestDTO;
import org.nic.Index.dto.InvoiceRequestDTO;
import org.nic.Index.dto.RegdDealerSummaryDTO;
import org.nic.Index.repository.CformIssuedRepository;
import org.nic.Index.repository.CformRequestRepository;
import org.nic.Index.repository.InvoiceRequestRepository;
import org.nic.Index.repository.RegdDealerRepository;
import org.nic.Index.services.cardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardsServices implements cardServices {
	@Autowired
	public RegdDealerRepository regdDealerRepository;
	@Autowired
	public CformRequestRepository cformRequestRepository;
	@Autowired
	public CformIssuedRepository cformIssuedRepository;
	@Autowired
	public InvoiceRequestRepository invoiceRequestRepository;

	public RegdDealerSummaryDTO getVatSummary() {
        return regdDealerRepository.getVatSummary();
    }
	
	public CformIssuedDTO getCformIssuedSummary() {
		return cformIssuedRepository.getCformIssuedSummary();
	}
	
	public CformRequestDTO getCformRequestSummary() {
		return cformRequestRepository.getCformRequestSummary();
	}
	
	public InvoiceRequestDTO getInvoiceRequestSummary() {
		return invoiceRequestRepository.getInvoiceRequestSummary();
	}

	@Override
	public String getCountForCform(String month, String year) {
		return cformRequestRepository.countByRequestDtMonthAndYear(month, year);
	}

	@Override
	public String getCountForDealer(String month, String year) {
		return regdDealerRepository.countDealerByMonthAndYear(month, year);
	}

}
