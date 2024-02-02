package org.nic.Index.dto;

import java.util.Date;

public class InvoiceRequestDTO {
	private Long InvoiceRequest;
	private Date InvoiceDate;
	private Date MaxInvoiceDate;
	private Long CurrentMonthInvoice;
	
	public InvoiceRequestDTO(){
		
	}
	public InvoiceRequestDTO(Long invoiceRequest, Date invoiceDate, Date MaxInvoiceDate, Long CurrentMonthInvoice) {
		this.InvoiceRequest = invoiceRequest;
		this.InvoiceDate = invoiceDate;
		this.MaxInvoiceDate = MaxInvoiceDate;
		this.CurrentMonthInvoice=CurrentMonthInvoice;
	}
	
	public Long getCurrentMonthInvoice() {
		return CurrentMonthInvoice;
	}
	public void setCurrentMonthInvoice(Long currentMonthInvoice) {
		CurrentMonthInvoice = currentMonthInvoice;
	}
	public Long getInvoiceRequest() {
		return InvoiceRequest;
	}
	public void setInvoiceRequest(Long invoiceRequest) {
		this.InvoiceRequest = invoiceRequest;
	}
	public Date getInvoiceDate() {
		return InvoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.InvoiceDate = invoiceDate;
	}
	public Date getMaxInvoiceDate() {
		return MaxInvoiceDate;
	}
	public void setMaxInvoiceDate(Date MaxInvoiceDate) {
		MaxInvoiceDate = MaxInvoiceDate;
	}
	
	
}
