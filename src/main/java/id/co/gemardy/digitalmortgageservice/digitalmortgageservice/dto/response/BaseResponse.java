package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse {

    private String responseCode;
    private String message;
    private Object dataResult;

    public BaseResponse(String responseCode, Object dataResult, String message) {
        this.responseCode = responseCode;
        this.dataResult = dataResult;
        this.message = message;
    }


}
