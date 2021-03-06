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
 * This file was automatically generated by EvoMaster on 2022-03-11T01:23:56.510571-08:00[America/Los_Angeles]
 * <br>
 * The generated test suite contains 2 tests
 * <br>
 * Covered targets: 22
 * <br>
 * Used time: 0h 5m 0s
 * <br>
 * Needed budget for current results: 86%
 * <br>
 * This file contains one example of each category of fault. The test cases in this file are a subset of the set of test cases likely to indicate faults.
 */
public class EvoMaster_fault_representatives_Test {

    
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
                    "fields=n79Mz&" + 
                    "codes=B3")
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
                    "fields=_EM_240_XYZ_&" + 
                    "codes=FGM_2%3B7_UUZ")
                .then()
                .statusCode(500) // eu/fayder/restcountries/v2/rest/CountryRestV2_268_getCountriesJson
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(500.0))
                .body("'message'", containsString("Internal Server Error"));
        
    }


}
