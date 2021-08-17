import org.testng.annotations.Test;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import org.json.simple.JSONObject;
import groovy.util.logging.Log;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import junit.framework.Assert;

import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import java.net.URI;
import java.net.http.HttpResponse.BodyHandler;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.List.*;
import static java.util.regex.Matcher.*;
import static java.util.regex.Pattern.*;
import org.apache.commons.validator.routines.EmailValidator;
import java.util.regex.Pattern; 

@Test

public class Assignment_RA  {
	
	
	 public static boolean isValid(String email) 
	    { 
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  //part before @
	                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
	 
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    } 
	//GETStatus code
	public static void assignment ()
	
	{
		Response response = given().when().get("https://jsonplaceholder.typicode.com/users");
			Assert.assertEquals(response.getStatusCode(), 200);
			Assert.assertEquals(response.jsonPath().getString("[8].username"),"Delphine");
			Assert.assertEquals(response.jsonPath().getString("[8].email"),"Chaim_McDermott@dana.io");
			Assert.assertTrue(isValid(response.jsonPath().getString("[8].email")));

}
		
	 } 
	
