package id.co.gemardy.digitalmortgageservice.digitalmortgageservice;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DigitalMortgageServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void traceIdGenerate (){
		System.out.println(MDC.get("traceId"));
	}

}
