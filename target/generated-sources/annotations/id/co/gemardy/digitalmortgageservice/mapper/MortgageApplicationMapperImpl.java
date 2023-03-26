package id.co.gemardy.digitalmortgageservice.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.SubmitApplicationRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response.InquiryDigitalMortgageResponse;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.entity.DigitalMortgageApplicationEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-26T12:01:28+0700",
    comments = "version: 1.5.0.RC1, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
public class MortgageApplicationMapperImpl implements MortgageApplicationMapper {

    @Override
    public DigitalMortgageApplicationEntity requestApplyConvertToEntity(SubmitApplicationRequest request) {
        if ( request == null ) {
            return null;
        }

        DigitalMortgageApplicationEntity digitalMortgageApplicationEntity = new DigitalMortgageApplicationEntity();

        try {
            if ( request.getDateOfBirth() != null ) {
                digitalMortgageApplicationEntity.setDateOfBirth( new SimpleDateFormat( "yyyy-MM-dd" ).parse( request.getDateOfBirth() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        digitalMortgageApplicationEntity.setProductCode( request.getProductCode() );
        digitalMortgageApplicationEntity.setAmountLoan( request.getAmountLoan() );
        digitalMortgageApplicationEntity.setImageKTP( request.getImageKTP() );
        digitalMortgageApplicationEntity.setImageKK( request.getImageKK() );
        digitalMortgageApplicationEntity.setImageSelfie( request.getImageSelfie() );
        digitalMortgageApplicationEntity.setDeviceInfo( request.getDeviceInfo() );
        digitalMortgageApplicationEntity.setUserId( request.getUserId() );
        digitalMortgageApplicationEntity.setIsNTB( request.getIsNTB() );
        digitalMortgageApplicationEntity.setIsETB( request.getIsETB() );
        digitalMortgageApplicationEntity.setDeviceId( request.getDeviceId() );
        digitalMortgageApplicationEntity.setCif( request.getCif() );
        digitalMortgageApplicationEntity.setNumberPhone( request.getNumberPhone() );
        if ( request.getTypeOfProperty() != null ) {
            digitalMortgageApplicationEntity.setTypeOfProperty( request.getTypeOfProperty().name() );
        }
        digitalMortgageApplicationEntity.setCustomerName( request.getCustomerName() );
        digitalMortgageApplicationEntity.setMotherName( request.getMotherName() );
        digitalMortgageApplicationEntity.setHasMarried( request.getHasMarried() );
        digitalMortgageApplicationEntity.setIsJointIncome( request.getIsJointIncome() );
        digitalMortgageApplicationEntity.setOccupation( request.getOccupation() );

        digitalMortgageApplicationEntity.setListProductApply( listOfProductToString(request.getListProductApply()) );

        return digitalMortgageApplicationEntity;
    }

    @Override
    public List<InquiryDigitalMortgageResponse> listApplyEntityConvertToListResponseInquiry(List<DigitalMortgageApplicationEntity> listResponseInquiry) {
        if ( listResponseInquiry == null ) {
            return null;
        }

        List<InquiryDigitalMortgageResponse> list = new ArrayList<InquiryDigitalMortgageResponse>( listResponseInquiry.size() );
        for ( DigitalMortgageApplicationEntity digitalMortgageApplicationEntity : listResponseInquiry ) {
            try {
                list.add( digitalMortgageApplicationEntityToInquiryDigitalMortgageResponse( digitalMortgageApplicationEntity ) );
            }
            catch ( JsonProcessingException e ) {
                throw new RuntimeException( e );
            }
        }

        return list;
    }

    protected InquiryDigitalMortgageResponse digitalMortgageApplicationEntityToInquiryDigitalMortgageResponse(DigitalMortgageApplicationEntity digitalMortgageApplicationEntity) throws JsonProcessingException {
        if ( digitalMortgageApplicationEntity == null ) {
            return null;
        }

        InquiryDigitalMortgageResponse.InquiryDigitalMortgageResponseBuilder inquiryDigitalMortgageResponse = InquiryDigitalMortgageResponse.builder();

        inquiryDigitalMortgageResponse.reffCode( digitalMortgageApplicationEntity.getReffCode() );
        if ( digitalMortgageApplicationEntity.getStatus() != null ) {
            inquiryDigitalMortgageResponse.status( digitalMortgageApplicationEntity.getStatus().name() );
        }
        inquiryDigitalMortgageResponse.listProductApply( listOfProductToList( digitalMortgageApplicationEntity.getListProductApply() ) );
        inquiryDigitalMortgageResponse.cif( digitalMortgageApplicationEntity.getCif() );

        return inquiryDigitalMortgageResponse.build();
    }
}
