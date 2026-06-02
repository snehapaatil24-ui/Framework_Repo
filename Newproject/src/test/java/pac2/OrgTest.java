package pac2;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createorgtest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser", "CHROME");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createorgtest");
	}
	@Test
	public void modifyorgtest() {
		System.out.println("execute modifyorgtest");
	}
}
