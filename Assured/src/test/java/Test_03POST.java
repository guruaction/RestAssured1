import org.testng.annotations.Test;
import groovy.util.logging.Log;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.net.http.HttpResponse.BodyHandler;
import java.util.concurrent.TimeUnit;

@Test
public class Test_03POST {
	
	@Test
	//GETStatus code
	public static void getstatuscode () {
		
		given()
			.get("https://reqres.in/api/users?page-2")
		.then()
			.statusCode(200);
	}			
	//getresponseContentType
	@Test
	public static void getResponseContentType()
	{
		   System.out.println("The content type of response "+
		           get("https://reqres.in/api/users?page-2").then().extract()
      		              .contentType());
	}
	//get response time
	
	
	@Test
	public static void getResponseTime() {
		  System.out.println("The time taken to fetch the response "+get("https://reqres.in/api/users?page-2")
		         .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
		}
	
	//getResponseBody
	@Test
	public static void getResponseBody()
	{
			   given() .queryParam("CUSTOMER_ID","68195")
			           .queryParam("PASSWORD","1234!")
			           .queryParam("Account_No","1")
			           .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
			           .body();
			}
	

	}
	
	

