package org.nic.Index.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.nic.Index.dto.CformIssuedDTO;
import org.nic.Index.dto.CformRequestDTO;
import org.nic.Index.dto.InvoiceRequestDTO;
import org.nic.Index.dto.RegdDealerSummaryDTO;
import org.nic.Index.repository.CformRequestRepository;
import org.nic.Index.repository.RegdDealerRepository;
import org.nic.Index.service.impl.CardsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@Autowired
	public CardsServices cardsServices;
	@Autowired
	public CformRequestRepository cformRequestRepository;
	@Autowired
	public RegdDealerRepository regdDealerRepository;
	
		@GetMapping("/getYearsForCform")
	    @ResponseBody
	    public List<Integer> getYearsForCform() {
	        CformRequestDTO CformYears = cardsServices.getCformRequestSummary();
	     
	        Date minCformDate = CformYears.getCRequestDate(); 
	        Date maxCformDate = CformYears.getMaxRequestDate();
	      
	        List<Integer> CformList = new ArrayList<>();
	       
	        Calendar minCformCalendar = Calendar.getInstance();
	        minCformCalendar.setTime(minCformDate);
	        int minCformYearValue = minCformCalendar.get(Calendar.YEAR);
	     
	        Calendar maxCformCalendar = Calendar.getInstance();
	        maxCformCalendar.setTime(maxCformDate);
	        int maxCformYearValue = maxCformCalendar.get(Calendar.YEAR);
	     
	        for (int year = minCformYearValue; year <= maxCformYearValue; year++) {
	        	CformList.add(year);
	        }
	        
	        return CformList;
	    }
		
		@GetMapping("/getYearsForRegdDealer")
	    @ResponseBody
	    public List<Integer> getYearsForRegdDealer() {
	        RegdDealerSummaryDTO regdDealerYear = cardsServices.getVatSummary();
	    
	        Date minRegdDealerDate = regdDealerYear.getMinLogDate();
	        Date maxRegdDealerDate = regdDealerYear.getMaxLogDate();

	        List<Integer> regdDealerList = new ArrayList<>();

	        Calendar minRegdDealerCalendar = Calendar.getInstance();
	        minRegdDealerCalendar.setTime(minRegdDealerDate);
	        int minRegdDealerYearValue = minRegdDealerCalendar.get(Calendar.YEAR);
  
	        Calendar maxRegdDealerCalendar = Calendar.getInstance();
	        maxRegdDealerCalendar.setTime(maxRegdDealerDate);
	        int maxRegdDealerYearValue = maxRegdDealerCalendar.get(Calendar.YEAR);
	        
	        for (int year = minRegdDealerYearValue; year <= maxRegdDealerYearValue; year++) {
	        	regdDealerList.add(year);
	        }
  
	        return regdDealerList;
	    }
		 
		@GetMapping("/getYearsForCformIssued")
	    @ResponseBody
	    public List<Integer> getYearsForCformIssued() {
	        CformIssuedDTO cformIssuedDTO = cardsServices.getCformIssuedSummary();
	        
	        Date minIssuedDate = cformIssuedDTO.getMinIssuedDate();
	        Date maxIssuedDate = cformIssuedDTO.getMaxIssuedDate();

	        List<Integer> IssuedCformList = new ArrayList<>();

	        Calendar minRegdDealerCalendar = Calendar.getInstance();
	        minRegdDealerCalendar.setTime(minIssuedDate);
	        int minIssuedYearValue = minRegdDealerCalendar.get(Calendar.YEAR);
  
	        Calendar maxRegdDealerCalendar = Calendar.getInstance();
	        maxRegdDealerCalendar.setTime(maxIssuedDate);
	        int maxIssuedYearValue = maxRegdDealerCalendar.get(Calendar.YEAR);
	        
	        for (int year = minIssuedYearValue; year <= maxIssuedYearValue; year++) {
	        	IssuedCformList.add(year);
	        }
  
	        return IssuedCformList;
	    }
		
		@GetMapping("/getYearsForInvoice")
	    @ResponseBody
	    public List<Integer> getYearsForInvoice() {
	        InvoiceRequestDTO invoiceRequestDTO = cardsServices.getInvoiceRequestSummary();
	        
	        Date minInvoiceDate = invoiceRequestDTO.getInvoiceDate();
	        Date maxInvoiceDate = invoiceRequestDTO.getMaxInvoiceDate();

	        List<Integer> InvoiceList = new ArrayList<>();

	        Calendar minRegdDealerCalendar = Calendar.getInstance();
	        minRegdDealerCalendar.setTime(minInvoiceDate);
	        int minInvoiceYearValue = minRegdDealerCalendar.get(Calendar.YEAR);
  
	        Calendar maxRegdDealerCalendar = Calendar.getInstance();
	        maxRegdDealerCalendar.setTime(maxInvoiceDate);
	        int maxInvoiceYearValue = maxRegdDealerCalendar.get(Calendar.YEAR);
	        
	        for (int year = minInvoiceYearValue; year <= maxInvoiceYearValue; year++) {
	        	InvoiceList.add(year);
	        }
  
	        return InvoiceList;
	    }
		
		@GetMapping("/")
		public String showPage(Model model) {
	
			CformIssuedDTO IssuedSummary = cardsServices.getCformIssuedSummary();
			if (IssuedSummary != null) {
				model.addAttribute("IssuedSummary", IssuedSummary);
			}
	
			CformRequestDTO RequestSummary = cardsServices.getCformRequestSummary();
			if (RequestSummary != null) {
				model.addAttribute("RequestSummary", RequestSummary);
			}
			
			RegdDealerSummaryDTO vatSummary = cardsServices.getVatSummary();
			System.out.println("vat Summary" + vatSummary.getVatRegistered());
			System.out.println("vat cancelled" + vatSummary.getCountvatCancelledByMonth());
			if (vatSummary != null) {
				model.addAttribute("vatSummary", vatSummary);
			}
			
			InvoiceRequestDTO invoiceSummary = cardsServices.getInvoiceRequestSummary();
			if (invoiceSummary != null) {
				model.addAttribute("invoiceSummary", invoiceSummary);
			}
			
			return "index";
		}
		
		@GetMapping("/getCountForCform")
	    @ResponseBody
	    public String getCountForCform(@RequestParam(name="month") String month, @RequestParam(name="year") String year) {	
			return cformRequestRepository.countByRequestDtMonthAndYear(month, year);
	    }
		
		@GetMapping("/getCountForDealer")
	    @ResponseBody
	    public String getCountForDealer(@RequestParam(name="month") String month, @RequestParam(name="year") String year) {
			return regdDealerRepository.countDealerByMonthAndYear(month, year);
	    }
}
