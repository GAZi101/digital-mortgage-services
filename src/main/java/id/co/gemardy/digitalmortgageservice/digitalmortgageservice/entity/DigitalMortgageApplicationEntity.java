package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.entity;

import java.math.BigDecimal;
import java.util.Date;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.utils.StatusApplicationEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity( name= "digital_mortgage_application")
public class DigitalMortgageApplicationEntity extends BaseEntity {
    
    @Column(name = "product_code")
    private String productCode;
    @Column(name = "amount_loan", length = 40)
    private BigDecimal amountLoan;
    @Column(name = "image_ktp")
    private String imageKTP;
    @Column(name = "image_kk")
    private String imageKK;
    @Column(name = "image_selfie")
    private String imageSelfie;
    @Column(name = "device_info", length = 40)
    private String deviceInfo;
    @Column(name = "user_id", length = 40)
    private String userId;
    @Column(name = "is_ntb", length = 1) // is new to bank
    private String isNTB;
    @Column(name = "is_etb", length = 1)// is existing to bank
    private String isETB;
    @Column(name = "device_id", length = 50)
    private String deviceId;
    @Column( length = 20 )
    private String cif;
    @Column(name = "number_phone", length = 20)
    private String numberPhone;
    @Column(name = "type_of_property", length = 20)
    private String typeOfProperty;
    @Column(name = "customer_name", length = 50)
    private String customerName;
    @Column(name = "mother_name", length = 50)
    private String motherName;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "reff_code", length = 20)
    private String reffCode;
    @Column(name = "has_married", length = 1)
    private String hasMarried;
    @Column(name = "is_joint_income", length = 1)
    private String isJointIncome;
    @Column(length = 50)
    private String occupation;
    @Column(name = "list_product_apply", length = 255)
    private String listProductApply;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusApplicationEnum status;
}
