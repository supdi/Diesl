
package Diesl;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get(XPath.URL);
		
	//Click on sign up link 
		driver.findElementByLinkText(XPath.SignupLink).click();
		
	//Validations for the email 
		driver.findElementByXPath(XPath.Emailaddress).sendKeys("   ");
		System.out.println(">Enter blank email address");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Emailiderr).getText());
		driver.findElementByXPath(XPath.Emailaddress).clear();
		
		//System.out.println((driver.findElementByXPath(XPath.Emailiderr).equals("This field is required.")));
		
	// Enter wrong email address format 
		driver.findElementByXPath(XPath.Emailaddress).sendKeys("supriya%$gmail.com");
		System.out.println(">Email: supriya%$gmail.com");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Emailiderr).getText());
		driver.findElementByXPath(XPath.Emailaddress).clear();
		
	// Enter wrong email address format 
		driver.findElementByXPath(XPath.Emailaddress).sendKeys("supriya@$gmail");
		System.out.println(">Email: supriya@$gmail");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Emailiderr).getText());
		driver.findElementByXPath(XPath.Emailaddress).clear();

	// Enter wrong email address format 
		driver.findElementByXPath(XPath.Emailaddress).sendKeys("supriya.com");
		System.out.println(">Email: supriya.com");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Emailiderr).getText());
		driver.findElementByXPath(XPath.Emailaddress).clear();
	
	// Enter wrong email address format 
		driver.findElementByXPath(XPath.Emailaddress).sendKeys("supriya@gmail.com");
		System.out.println(" >Email: supriya@gmail.com");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Emailiderr).getText());
		driver.findElementByXPath(XPath.Emailaddress).clear();
		
		driver.findElementByXPath(XPath.Emailaddress).sendKeys("supriya@gmail.com");
		System.out.println(" >Email: supriya@gmail.co.in");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Emailiderr).getText());
		//driver.findElementByXPath(XPath.Emailaddress).clear();
	
	// First name validations 
		driver.findElementByXPath(XPath.Firstname).sendKeys("  ");
		System.out.println("Firstname:   ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Firstnameerr).getText());
		driver.findElementByXPath(XPath.Firstname).clear();
	
		driver.findElementByXPath(XPath.Firstname).sendKeys("Supriya");
		System.out.println("Firstname:Supriya");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Firstnameerr).getText());
		//driver.findElementByXPath(XPath.Firstname).clear();
		
	//Last name validations 
		driver.findElementByXPath(XPath.Lastname).sendKeys("  ");
		System.out.println("Lastname:   ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Lastnameerr).getText());
		driver.findElementByXPath(XPath.Lastname).clear();
	
		driver.findElementByXPath(XPath.Lastname).sendKeys("QA");
		System.out.println("Lastname: QA");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Lastnameerr).getText());
		//driver.findElementByXPath(XPath.Firstname).clear();
	
	//Username name validations
		
		driver.findElementByXPath(XPath.Username).sendKeys("  ");
		System.out.println("Username:   ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Usernameerr).getText());
		driver.findElementByXPath(XPath.Username).clear();
	
		driver.findElementByXPath(XPath.Username).sendKeys("QA");
		System.out.println("Username: QA");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Usernameerr).getText());
		driver.findElementByXPath(XPath.Username).clear();
		
		driver.findElementByXPath(XPath.Username).sendKeys("Tester");
		System.out.println("Username: Tester");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Usernameerr).getText());
		//driver.findElementByXPath(XPath.Username).clear();
		
	// Company Name validations 
		
		driver.findElementByXPath(XPath.Companyname).sendKeys("  ");
		System.out.println("Companyname:   ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println("System allow user to enter any value or it can be blank");
	
	//Password Validations
		
		driver.findElementByXPath(XPath.Password).sendKeys("  ");
		System.out.println("Password:   ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Passworderr).getText());
		//driver.findElementByXPath(XPath.Password).clear();
		
		driver.findElementByXPath(XPath.Password).sendKeys("Test");
		System.out.println("Password:Test ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Passworderr).getText());
		driver.findElementByXPath(XPath.Password).clear();
		
		driver.findElementByXPath(XPath.Password).sendKeys("Tester123");
		System.out.println("Password:Tester123 ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Passworderr).getText());
		//driver.findElementByXPath(XPath.Password).clear();
		
	//Password confirmation validations 
		
		driver.findElementByXPath(XPath.Confirmpassword).sendKeys("  ");
		System.out.println("Confirmpassword:   ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Confirmpassworderr).getText());
		//driver.findElementByXPath(XPath.Password).clear();
		
		driver.findElementByXPath(XPath.Confirmpassword).sendKeys("Test");
		System.out.println("Confirmpassword:Test");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Confirmpassworderr).getText());
		driver.findElementByXPath(XPath.Confirmpassword).clear();
		
		driver.findElementByXPath(XPath.Confirmpassword).sendKeys("Tester123");
		System.out.println("ConfirmPassword: Tester123 ");
		driver.findElementByXPath(XPath.Createaccount).click();
		System.out.println(driver.findElementByXPath(XPath.Confirmpassworderr).getText());
		//driver.findElementByXPath(XPath.Password).clear();
		
		//Check whether the password and confirm password matches 
		String bname1= driver.findElementByXPath(XPath.Passworderr).getText();

		String bname2= driver.findElementByXPath(XPath.Confirmpassworderr).getText();
 
		if(bname1.equals(bname2))
		{
			System.out.println("Password matches");
		}else
		 {
			System.out.println("Password doesn't match");
		 }
	
		//Check whether the check box is available to check 
		if(driver.findElementByXPath(XPath.Emailpramotion).isSelected())
		{
			System.out.print("Check box is not selected- Pass");
		}
		else
		{
		driver.findElementByXPath(XPath.Emailpramotion).click();
		}
		//Check the validations for Terms and conditions 
		
		driver.findElementByXPath(XPath.Termsandconditios).isSelected();
		System.out.println("Check box is checked");
		
			
			
		
	
		
		

	
	
	
	
	
	
	
	
	
	
	}
	

}
