/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import java.util.Date;
import java.io.File;
import org.openapitools.model.FileSchemaTestClass;
import java.util.List;
import org.joda.time.LocalDate;
import java.util.Map;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import java.io.File;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openapitools.codegen.utils.JsonCache;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API tests for FakeApi.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FakeApiTest {
    private static Validator validator;
    private static JsonCache cache;

    @BeforeClass
    public static void beforeClass() throws Exception {
        File cacheFile = new File(System.getProperty("jaxrs.test.client.json",
                "C:\\source\\GitHub\\demonfiddler\\openapi-generator\\samples\\server\\petstore\\jaxrs-cxf-test-data\\src\\main\\resources\\test-data.json"));
        cache = JsonCache.Factory.instance.get("test-data").load(cacheFile).child("/org.openapitools.api/FakeApi");

        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @LocalServerPort
    private int serverPort;

    private FakeApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("http://localhost:" + serverPort + "/services", FakeApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client); 
    }

    private void validate(Object o) {
        assertNotNull(o);
        Set<ConstraintViolation<Object>> violations = validator.validate(o);
        if (!violations.isEmpty()) {
            StringBuilder message = new StringBuilder("Validation failed");
            for (ConstraintViolation<Object> violation : violations)
                message.append("; ").append(violation.getPropertyPath()).append(": ").append(violation.getMessage());
            fail(message.toString());
        }
    }

    
    /**
     * creates an XmlItem
     *
     * this route creates an XmlItem
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createXmlItemTest() throws Exception {
        XmlItem xmlItem = cache.getObject("/createXmlItem/xmlItem", XmlItem.class);
        api.createXmlItem(xmlItem);
    }
    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void fakeOuterBooleanSerializeTest() throws Exception {
        Boolean body = cache.getBoolean("/fakeOuterBooleanSerialize/body");
        Boolean response = api.fakeOuterBooleanSerialize(body);
        // TODO: complete test assertions
        validate(response);
    }
    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void fakeOuterCompositeSerializeTest() throws Exception {
        OuterComposite body = cache.getObject("/fakeOuterCompositeSerialize/body", OuterComposite.class);
        OuterComposite response = api.fakeOuterCompositeSerialize(body);
        // TODO: complete test assertions
        validate(response);
    }
    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void fakeOuterNumberSerializeTest() throws Exception {
        BigDecimal body = cache.getBigDecimal("/fakeOuterNumberSerialize/body");
        BigDecimal response = api.fakeOuterNumberSerialize(body);
        // TODO: complete test assertions
        validate(response);
    }
    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void fakeOuterStringSerializeTest() throws Exception {
        String body = cache.getString("/fakeOuterStringSerialize/body");
        String response = api.fakeOuterStringSerialize(body);
        // TODO: complete test assertions
        validate(response);
    }
    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void testBodyWithFileSchemaTest() throws Exception {
        FileSchemaTestClass body = cache.getObject("/testBodyWithFileSchema/body", FileSchemaTestClass.class);
        api.testBodyWithFileSchema(body);
    }
    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void testBodyWithQueryParamsTest() throws Exception {
        String query = cache.getString("/testBodyWithQueryParams/query");
        User body = cache.getObject("/testBodyWithQueryParams/body", User.class);
        api.testBodyWithQueryParams(query, body);
    }
    
    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void testClientModelTest() throws Exception {
        Client body = cache.getObject("/testClientModel/body", Client.class);
        Client response = api.testClientModel(body);
        // TODO: complete test assertions
        validate(response);
    }
    
    // Currently failing - see https://github.com/OpenAPITools/openapi-generator/issues/2193.
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    @Ignore
    public void testEndpointParametersTest() throws Exception {
        BigDecimal number = cache.getBigDecimal("/testEndpointParameters/number");
        Double _double = cache.getDouble("/testEndpointParameters/_double");
        String patternWithoutDelimiter = cache.getString("/testEndpointParameters/patternWithoutDelimiter");
        byte[] _byte = cache.getBinary("/testEndpointParameters/_byte");
        Integer integer = cache.getInt("/testEndpointParameters/integer");
        Integer int32 = cache.getInt("/testEndpointParameters/int32");
        Long int64 = cache.getLong("/testEndpointParameters/int64");
        Float _float = cache.getFloat("/testEndpointParameters/_float");
        String string = cache.getString("/testEndpointParameters/string");
        Attachment binary = new Attachment("binary", MediaType.TEXT_PLAIN, "Dummy attachment content");
        LocalDate date = cache.getObject("/testEndpointParameters/date", LocalDate.class);
        Date dateTime = cache.getObject("/testEndpointParameters/dateTime", Date.class);
        String password = cache.getString("/testEndpointParameters/password");
        String paramCallback = cache.getString("/testEndpointParameters/paramCallback");
        api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
    }
    
    // Currently failing - see https://github.com/OpenAPITools/openapi-generator/issues/2193.
    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws ApiException if the API call fails
     */
    @Test
    @Ignore
    public void testEnumParametersTest() throws Exception {
        List<String> enumHeaderStringArray = cache.getObjects("/testEnumParameters/enumHeaderStringArray", String.class);
        String enumHeaderString = cache.getString("/testEnumParameters/enumHeaderString");
        List<String> enumQueryStringArray = cache.getObjects("/testEnumParameters/enumQueryStringArray", String.class);
        String enumQueryString = cache.getString("/testEnumParameters/enumQueryString");
        Integer enumQueryInteger = cache.getInt("/testEnumParameters/enumQueryInteger");
        Double enumQueryDouble = cache.getDouble("/testEnumParameters/enumQueryDouble");
        List<String> enumFormStringArray = cache.getObjects("/testEnumParameters/enumFormStringArray", String.class);
        String enumFormString = cache.getString("/testEnumParameters/enumFormString");
        api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
    }
    
    /**
     * Fake endpoint to test group parameters (optional)
     *
     * Fake endpoint to test group parameters (optional)
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void testGroupParametersTest() throws Exception {
        Integer requiredStringGroup = cache.getInt("/testGroupParameters/requiredStringGroup");
        Boolean requiredBooleanGroup = cache.getBoolean("/testGroupParameters/requiredBooleanGroup");
        Long requiredInt64Group = cache.getLong("/testGroupParameters/requiredInt64Group");
        Integer stringGroup = cache.getInt("/testGroupParameters/stringGroup");
        Boolean booleanGroup = cache.getBoolean("/testGroupParameters/booleanGroup");
        Long int64Group = cache.getLong("/testGroupParameters/int64Group");
        api.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
    }
    
    /**
     * test inline additionalProperties
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void testInlineAdditionalPropertiesTest() throws Exception {
        Map<String, String> param = cache.getObject("/testInlineAdditionalProperties/param", Map.class);
        api.testInlineAdditionalProperties(param);
    }
    
    // Currently failing - see https://github.com/OpenAPITools/openapi-generator/issues/2193.
    /**
     * test json serialization of form data
     *
     * @throws ApiException if the API call fails
     */
    @Test
    @Ignore
    public void testJsonFormDataTest() throws Exception {
        String param = cache.getString("/testJsonFormData/param");
        String param2 = cache.getString("/testJsonFormData/param2");
        api.testJsonFormData(param, param2);
    }
    
}
