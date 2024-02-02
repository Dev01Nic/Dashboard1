package org.nic.Index.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table (name = "regd_dealer")
@Entity
public class regd_dealer  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "vat_rc_no")
    private String tinNumber;

	@Column(name = "status_cd")
    private String status;

	@Column(name = "log_dt")
    private Date logDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String gettinNumber() {
		return tinNumber;
	}

	public void settinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getlogDate() {
		return logDate;
	}

	public void setlogDate(Date logDate) {
		this.logDate = logDate;
	}

	
}
