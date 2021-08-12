import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

import static org.hamcrest.Matchers.*;


public class Test_02GET {
	
	
	@Test
	void test_02() {
		
		Response response = get("https://reqres.in/api/users?page-2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode,200);
	}

	@Test
	void test_03()
	
	{
		given()
			.get("https://reqres.in/api/users?page-2")
		.then()
			.statusCode(200)
		.body("data.id[0]", equalTo(7));
		
	}
	@Test
	public static void getResponseBody(){
		 
		   given() .queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1")
		           .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
		           .body();
		}
	
	
}
	




