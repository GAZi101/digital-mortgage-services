package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.service;

import java.util.List;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.BaseRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.SubmitApplicationRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response.InquiryDigitalMortgageResponse;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response.SubmitApplicationResponse;

public interface DigitalMortgageService {
    
    SubmitApplicationResponse submitApplication(SubmitApplicationRequest request);
    List<InquiryDigitalMortgageResponse> inquiryDigitalOpeningApply(BaseRequest request);
}
