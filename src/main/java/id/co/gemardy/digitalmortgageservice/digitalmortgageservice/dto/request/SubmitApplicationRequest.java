package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request;

import java.math.BigDecimal;
import java.util.List;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.utils.PropertyTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubmitApplicationRequest extends BaseRequest {
    
    private String productCode;
    private BigDecimal amountLoan;
    private String imageKTP;
    private String imageKK;
    private String imageSelfie;
    private String deviceInfo;
    private String userId;
    private String isNTB;
    private String isETB;
    private String cif;
    private String numberPhone;
    private PropertyTypeEnum typeOfProperty;
    private String customerName;
    private String motherName;
    private String dateOfBirth;
    private String hasMarried;
    private String isJointIncome;
    private String occupation;
    private List<Product> listProductApply;
}
