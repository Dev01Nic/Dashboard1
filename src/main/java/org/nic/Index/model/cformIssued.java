package org.nic.Index.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="df_issue_online")
@Entity
public class cformIssued {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "final_sl_no")
    private String finalSlNo;
    
	@Column(name = "log_date")
    private Date logDate;

	public Date getLog_date() {
		return logDate;
	}

	public void setLog_date(Date logDate) {
		this.logDate = logDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFinalSlNo() {
		return finalSlNo;
	}

	public void setFinal_sl_no(String finalSlNo) {
		this.finalSlNo = finalSlNo;
	}
}
