package CRUDRMGYantra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {

	
	@Test
	public void get() {
		
		Response get = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_24324");
		System.out.println(get.prettyPeek());
	}
}
