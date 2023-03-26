package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response;

import java.util.List;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InquiryDigitalMortgageResponse {
    
    private String reffCode;
    private String status;
    private List<Product> listProductApply;
    private String cif;
}
