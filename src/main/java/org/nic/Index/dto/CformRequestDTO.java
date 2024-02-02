package org.nic.Index.dto;

import java.util.Date;

public class CformRequestDTO {
    private Long CformCount;
    private Date CRequestDate;
    private Date MaxRequestDate;
    private Long filterCount;
    private Long CountRequestByMonth;
    
    public CformRequestDTO() {
        
    }

    public CformRequestDTO(Long CformCount, Date CRequestDate, Date MaxRequestDate, Long filterCount, Long CountRequestByMonth ) {
        this.CformCount = CformCount;
        this.CRequestDate = CRequestDate;
        this.MaxRequestDate = MaxRequestDate;
        this.filterCount = filterCount;
        this.CountRequestByMonth = CountRequestByMonth;
    }

    public Long getCountRequestByMonth() {
		return CountRequestByMonth;
	}

	public void setCountRequestByMonth(Long countRequestByMonth) {
		CountRequestByMonth = countRequestByMonth;
	}

	public Long getCformCount() {
        return CformCount;
    }

    public void setCformCount(Long cformCount) {
        this.CformCount = cformCount; 
    }

    public Date getCRequestDate() {
        return CRequestDate;
    }

    public void setCRequestDate(Date CRequestDate) {
        this.CRequestDate = CRequestDate;
    }

	public Date getMaxRequestDate() {
		return MaxRequestDate;
	}

	public void setMaxRequestDate(Date MaxRequestDate) {
		this.MaxRequestDate = MaxRequestDate;
	}

	public Long getFilterCount() {
		return filterCount;
	}

	public void setFilterCount(Long filterCount) {
		this.filterCount = filterCount;
	}
	
    
}
