package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="reg_email__")
	private WebElement Email;
	
	@FindBy(name="reg_passwd__")
	private WebElement Password;
	
	@FindBy(id="day")
	private WebElement Date;
	
	@FindBy(id="month")
	private WebElement Month;
	
	@FindBy(id="year")
	private WebElement Year;
	
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement newEmail;

	
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void RegisterPageFunctionality(String fname,String lname,String email,String cmail,String pass,String date,String month ,String year)

	{
		sendkeys(firstname, fname);
		sendkeys(lastname, lname);
		sendkeys(Email, email);
		sendkeys(newEmail, cmail);
		sendkeys(Password, pass);
		dropDown(Date, date);
		dropDown(Month, month);
		dropDown(Year, year);
	}





}
