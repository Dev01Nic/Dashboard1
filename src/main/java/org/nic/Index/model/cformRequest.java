package org.nic.Index.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="df_request_online")
@Entity
public class cformRequest {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name="ack_no")
    private String requestNo;
    
	@Column(name="request_date")
    private Date requestDt;

	public Date getrequestDt() {
		return requestDt;
	}

	public void setrequestDt(Date requestDt) {
		this.requestDt = requestDt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getrequestNo() {
		return requestNo;
	}

	public void setrequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
}
