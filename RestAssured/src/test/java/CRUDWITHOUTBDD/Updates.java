package CRUDWITHOUTBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Updates {

	
	
	@Test
	public void put() {
		
		
		JSONObject job=new JSONObject();
		job.put("name","kuch");
		job.put("job", "git");
		
		RequestSpecification res = RestAssured.given();
		res.body(job);
		res.contentType(ContentType.JSON);
		
		              Response put = res.put("https://reqres.in/api/users/2");
		              System.out.println(put.asPrettyString());
	}
}
