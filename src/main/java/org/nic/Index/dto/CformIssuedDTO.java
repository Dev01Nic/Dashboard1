package org.nic.Index.dto;

import java.util.Date;

public class CformIssuedDTO {
	private Long CformIssued;
	
	private Date MinIssuedDate;
	
	private Date MaxIssuedDate;
	
	private Long countIssuedByMonth;

    public CformIssuedDTO() {
        
    }

    public CformIssuedDTO(Long CformIssued, Date MinIssuedDate, Date MaxIssuedDate, Long countIssuedByMonth) {
        this.CformIssued = CformIssued;
        this.MinIssuedDate = MinIssuedDate;
        this.MaxIssuedDate = MaxIssuedDate;
        this.countIssuedByMonth = countIssuedByMonth;
    }
    

	public Long getCountIssuedByMonth() {
		return countIssuedByMonth;
	}

	public void setCountIssuedByMonth(Long countIssuedByMonth) {
		this.countIssuedByMonth = countIssuedByMonth;
	}

	public Long getCformIssued() {
		return CformIssued;
	}

	public void setCformIssued(Long cformIssued) {
		this.CformIssued = cformIssued;
	}

	public Date getMinIssuedDate() {
		return MinIssuedDate;
	}

	public void setMinIssuedDate(Date MinIssuedDate) {
		this.MinIssuedDate = MinIssuedDate;
	}

	public Date getMaxIssuedDate() {
		return MaxIssuedDate;
	}

	public void setMaxIssuedDate(Date MaxIssuedDate) {
		this.MaxIssuedDate = MaxIssuedDate;
	}
	
}
