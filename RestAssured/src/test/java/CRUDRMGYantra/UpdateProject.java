package CRUDRMGYantra;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void getsingle() {
		
		JSONObject job=new JSONObject();
		job.put("createdBy", "kurl1");
		job.put("projectName","dwe111");
		
		job.put("status","ongoing");
		job.put("teamSize",6);
		
		RequestSpecification res = RestAssured.given();
		res.body(job);
		res.contentType(ContentType.JSON);
		
		Response pos = res.put("http://rmgtestingserver:8084/projects/TY_PROJ_24324");
		System.out.println(pos.prettyPeek());
		
		
		
	}

}
