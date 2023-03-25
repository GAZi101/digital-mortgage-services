package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseRequest {

    @NotBlank(message="field deviceId must not be blank!")
    private String deviceId;
    @NotBlank(message="field appVersion must not be blank!")
    private String appVersion;

}
