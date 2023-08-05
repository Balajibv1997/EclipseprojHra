package CRUDRMGYantra;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProject {
	@Test
	public void get() {
		
		Response get = RestAssured.get("http://rmgtestingserver:8084/projects");
		System.out.println(get.prettyPeek());
		
		int code = get.getStatusCode();
		Assert.assertEquals(200, code);
		System.out.println("Tc is Pass");
	}

}
