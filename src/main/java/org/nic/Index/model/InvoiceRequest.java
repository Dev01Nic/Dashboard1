package org.nic.Index.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="df_invoice_online_new")
@Entity
public class InvoiceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name="df_invoice_id")
    private Long InvoiceNo;
    
	@Column(name="invoice_date")
    private Date InvoiceDt;

	public Date getInvoiceDt() {
		return InvoiceDt;
	}

	public void setInvoiceDt(Date InvoiceDt) {
		this.InvoiceDt = InvoiceDt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInvoiceNo() {
		return InvoiceNo;
	}

	public void setInvoiceNo(Long InvoiceNo) {
		this.InvoiceNo = InvoiceNo;
	}

}
