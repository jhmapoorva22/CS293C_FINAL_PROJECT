import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.evomaster.client.java.controller.api.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import static org.evomaster.client.java.controller.db.dsl.SqlDsl.sql;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import  java.util.List;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;
import static org.evomaster.client.java.controller.expect.ExpectationHandler.expectationHandler;
import  org.evomaster.client.java.controller.expect.ExpectationHandler;
import  io.restassured.path.json.JsonPath;
import  java.util.Arrays;




/**
 * This file was automatically generated by EvoMaster on 2022-03-11T01:49:27.021761-08:00[America/Los_Angeles]
 * <br>
 * The generated test suite contains 2 tests
 * <br>
 * Covered targets: 44
 * <br>
 * Used time: 0h 10m 0s
 * <br>
 * Needed budget for current results: 43%
 * <br>
 * This file contains test cases that are likely to indicate faults.
 */
public class EvoMaster_faults_Test {

    
    private static final SutHandler controller = new em.embedded.eu.fayder.EmbeddedEvoMasterController();
    private static String baseUrlOfSut;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        assertNotNull(baseUrlOfSut);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetStateOfSUT();
    }
    
    
    
    
    /**
    * [test_0_with500] is a part of 1 or more clusters, as defined by the selected clustering options. 
    * ErrorText_0
    * LastLine_0
    */
    @Test
    public void test_0_with500() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/rest/v2/alpha?" + 
                    "fields=050YWlGW8Fb&" + 
                    "codes=UEU_1%3B75%60XYZU")
                .then()
                .statusCode(500) // eu/fayder/restcountries/v2/rest/CountryRestV2_268_getCountriesJson
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(500.0))
                .body("'message'", containsString("Internal Server Error"));
        
    }
    
    
    /**
    * [test_1_with500] is a part of 1 or more clusters, as defined by the selected clustering options. 
    * ErrorText_0
    * LastLine_0
    */
    @Test
    public void test_1_with500() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/rest/v2/alpha?" + 
                    "fields=L294lRVS7&" + 
                    "codes=Z1")
                .then()
                .statusCode(500) // eu/fayder/restcountries/v2/rest/CountryRestV2_268_getCountriesJson
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(500.0))
                .body("'message'", containsString("Internal Server Error"));
        
    }


}
