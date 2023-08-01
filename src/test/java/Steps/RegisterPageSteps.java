package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass{

	
	@Given("user on Register Page")
	public void user_on_register_page() {
	  inialization();
	}

	@When("user Enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and_and_and_and(String fname, String lname, String email, String cemail, String pass, String date, String month, String year) {
		RegisterPage reg=new RegisterPage();
		reg.RegisterPageFunctionality(fname, lname, email, cemail, pass, date, month, year);
		
	}
	
	@After
	public static void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte f []=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
			
		}
		else 
		{
			byte f []=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(f, "image/png", scenario.getName());
			
		}
	}
	
	
	
	
	
	
	
	
	
}
