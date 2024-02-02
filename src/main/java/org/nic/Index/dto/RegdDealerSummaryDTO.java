package org.nic.Index.dto;

import java.util.Date;

public class RegdDealerSummaryDTO {
	private Long vatRegistered;
    private Long vatTransferred;
    private Long vatCancelled;
    private Date minLogDate;
    private Date maxLogDate;
    private Long countByMonth;
    private Long countVatTransferredByMonth;
    private Long countvatCancelledByMonth;

    public RegdDealerSummaryDTO() {
        
    }

    public RegdDealerSummaryDTO(Long vatRegistered, Long vatTransferred, Long vatCancelled, Date minLogDate, Date maxLogDate, Long countByMonth, Long countVatTransferredByMonth, Long countvatCancelledByMonth) {
        this.vatRegistered = vatRegistered;
        this.vatTransferred = vatTransferred;
        this.vatCancelled = vatCancelled;
        this.minLogDate = minLogDate;
        this.maxLogDate = maxLogDate;
        this.countByMonth = countByMonth;
        this.countVatTransferredByMonth = countVatTransferredByMonth;
        this.countvatCancelledByMonth = countvatCancelledByMonth;
    }

    
    public Long getCountVatTransferredByMonth() {
		return countVatTransferredByMonth;
	}

	public void setCountVatTransferredByMonth(Long countVatTransferredByMonth) {
		this.countVatTransferredByMonth = countVatTransferredByMonth;
	}

	public Long getCountvatCancelledByMonth() {
		return countvatCancelledByMonth;
	}

	public void setCountvatCancelledByMonth(Long countvatCancelledByMonth) {
		this.countvatCancelledByMonth = countvatCancelledByMonth;
	}

	public Long getCountByMonth() {
		return countByMonth;
	}

	public void setCountByMonth(Long countByMonth) {
		this.countByMonth = countByMonth;
	}

	public Long getVatRegistered() {
        return vatRegistered;
    }

    public void setVatRegistered(Long vatRegistered) {
        this.vatRegistered = vatRegistered;
    }

    public Long getVatTransferred() {
        return vatTransferred;
    }

    public void setVatTransferred(Long vatTransferred) {
        this.vatTransferred = vatTransferred;
    }

    public Long getVatCancelled() {
        return vatCancelled;
    }

    public void setVatCancelled(Long vatCancelled) {
        this.vatCancelled = vatCancelled;
    }

    public Date getMinLogDate() {
        return minLogDate;
    }

    public void setMinLogDate(Date minLogDate) {
        this.minLogDate = minLogDate;
    }

	public Date getMaxLogDate() {
		return maxLogDate;
	}

	public void setMaxLogDate(Date maxLogDate) {
		this.maxLogDate = maxLogDate;
	}
    
		
}
