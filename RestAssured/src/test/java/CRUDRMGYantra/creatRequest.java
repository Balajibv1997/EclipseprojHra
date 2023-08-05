package CRUDRMGYantra;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenaricUtilities.JavaUtilities;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class creatRequest {


	@Test
	public void creat() {
		
		JavaUtilities jLib=new JavaUtilities();
		int ran = jLib.getRandomNumber();
	
		
		JSONObject job=new JSONObject();
		job.put("createdBy", "kur"+ran);
		job.put("projectName","Rss"+ran);
		
		job.put("status","ongoing");
		job.put("teamSize",6);
		
		RequestSpecification res = RestAssured.given();
		res.body(job);
		res.contentType(ContentType.JSON);
		
		Response pos = res.post("http://rmgtestingserver:8084/addProject");
		System.out.println(pos.prettyPeek());
		System.out.println(ran);
	}
}
