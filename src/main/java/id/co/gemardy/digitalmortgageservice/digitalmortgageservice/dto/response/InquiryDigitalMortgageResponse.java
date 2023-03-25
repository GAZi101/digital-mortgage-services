package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.utils.StatusApplicationEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InquiryDigitalMortgageResponse {
    
    private String reffCode;
    private StatusApplicationEnum statusApplication;
    private String listOfProduct;
    private String cif;
}
