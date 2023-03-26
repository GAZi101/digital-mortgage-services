package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.adapter.APIAdapter;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.BaseRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request.SubmitApplicationRequest;
import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.service.DigitalMortgageService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "mortgage")
public class DigitalMortgageController {
    
    private final DigitalMortgageService digitalMortgageService;
    private final APIAdapter apiAdapter;

    @Autowired
    public DigitalMortgageController(DigitalMortgageService digitalMortgageService, APIAdapter apiAdapter) {
        this.digitalMortgageService = digitalMortgageService;
        this.apiAdapter = apiAdapter;
    }

    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Apply Digital Mortgage") })
    @PostMapping("/submit-apply")
    @ResponseBody
    public ResponseEntity<?> applyMortgage(@RequestBody @Valid SubmitApplicationRequest applyMortgageRequest) {
        return apiAdapter.createResponse(digitalMortgageService.submitApplication(applyMortgageRequest));
    }

    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Apply Digital Mortgage") })
    @PostMapping("/inquiry-application")
    @ResponseBody
    public ResponseEntity<?> inquiryApplication(@RequestBody @Valid BaseRequest request) {
        return apiAdapter.createResponse(digitalMortgageService.inquiryDigitalOpeningApply(request));
    }
}
