package id.co.gemardy.digitalmortgageservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.Product;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.SubmitApplicationRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response.InquiryDigitalMortgageResponse;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.entity.DigitalMortgageApplicationEntity;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MortgageApplicationMapper {
    
    MortgageApplicationMapper INSTANCE = Mappers.getMapper(MortgageApplicationMapper.class);

    @Mapping(target = "listProductApply", expression = "java(listOfProductToString(request.getListProductApply()))")
    @Mapping(target = "dateOfBirth", dateFormat = "yyyy-MM-dd")
    DigitalMortgageApplicationEntity requestApplyConvertToEntity(SubmitApplicationRequest request);

    @Mapping(target = "reffCode", source = "listResponseInquiry.reffCode")
    @Mapping(target = "statusApplication", source = "listResponseInquiry.status")
    @Mapping(target = "listOfProduct", expression = "java(listOfProductToJson(listResponseInquiry.getListProductApply()))")
    @Mapping(target = "cif", source = "listResponseInquiry.cif")
    List<InquiryDigitalMortgageResponse> listApplyEntityConvertToListResponseInquiry(List<DigitalMortgageApplicationEntity> listResponseInquiry);

    default String listOfProductToString(List<Product> listOfProduct) {
        return new Gson().toJson(listOfProduct);
    }

    default List<Product> listOfProductToList(String listOfProduct) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return  mapper.readValue(listOfProduct, new TypeReference<List<Product>>(){});
    }
}
