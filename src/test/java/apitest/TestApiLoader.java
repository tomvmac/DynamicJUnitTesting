package apitest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.easetech.easytest.annotation.*;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = { "c://MyTemp//testdata//apiTestCases.xls" })
@Format(date= "dd/MM/yyyy")
@Report
@Parallel(threads=5)
public class TestApiLoader {

    @Test
    public void getExcelTestData(@Param(name="url") String url,
                                 @Param(name="httpverb") String httpverb,
                                 @Param(name="expectedResponse") String expectedResponse) {

        System.out.print("Executing TestApiLoader :");
        System.out.println("url is :" + url + " and httpverb is :" + httpverb);
        System.out.println("expectedResponse is " + expectedResponse);

        // Invoke API URL with property http verb and get response with Apache Http Client
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response;
        String strResponse = new String();
        JSONObject jsonResponse;
        JSONObject jsonExpectedResponse = new JSONObject(expectedResponse);

        try {
            response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                // parsing JSON
                strResponse = EntityUtils.toString(entity);
                jsonResponse = new JSONObject(strResponse);
                JSONAssert.assertEquals(jsonExpectedResponse, jsonResponse, true);

            }

        } catch (Exception e) {
        }

    }
}
