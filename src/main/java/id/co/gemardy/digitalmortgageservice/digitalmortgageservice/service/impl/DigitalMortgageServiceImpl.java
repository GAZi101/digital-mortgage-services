package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.service.impl;

import java.util.List;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.utils.ReffNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.BaseRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.SubmitApplicationRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response.InquiryDigitalMortgageResponse;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response.SubmitApplicationResponse;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.entity.DigitalMortgageApplicationEntity;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.repository.DigitalMortgageApplicationRepository;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.service.DigitalMortgageService;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.utils.StatusApplicationEnum;
import id.co.gemardy.digitalmortgageservice.mapper.MortgageApplicationMapper;

@Service
public class DigitalMortgageServiceImpl implements DigitalMortgageService {

    private final DigitalMortgageApplicationRepository applicationRepository;

    @Autowired
    public DigitalMortgageServiceImpl(DigitalMortgageApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }
    
    @Override
    public SubmitApplicationResponse submitApplication(SubmitApplicationRequest request) {
        
        DigitalMortgageApplicationEntity entity = MortgageApplicationMapper.INSTANCE.requestApplyConvertToEntity(request);
        entity.setStatus(StatusApplicationEnum.INPROGRESS);
        entity.setReffCode(ReffNumberGenerator.generateReffNumberMortgage());
        applicationRepository.save(entity);

        return SubmitApplicationResponse.builder().reffCode(entity.getReffCode()).build();
    }

    @Override
    public List<InquiryDigitalMortgageResponse> inquiryDigitalOpeningApply(BaseRequest request) {

        List<DigitalMortgageApplicationEntity> listApplication = applicationRepository.findByDeviceId(request.getDeviceId());


        return MortgageApplicationMapper.INSTANCE.listApplyEntityConvertToListResponseInquiry(listApplication);
    }
    
}
