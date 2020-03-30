package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionfile {

	WebDriver driver;

	 @Given("^Open the chrome browser and open mercury page$")
	 public void method1()
	 {
	  System.setProperty("webdriver.chrome.driver",
	    "C:\\Users\\kiran\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	  
	 }

	 @When("^verify the url and title of the page$")
	 public void method2()
	 {
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	 }

	 @Then ("^Enter the details for Username, passowrd click the signin$")
	 public void method3() throws InterruptedException
	 {
	//driver.findElement(By.id("wpName2")).sendKeys("Mittal");
	  
	//  driver.findElement(By.id("wpPassword2")).sendKeys("abc@1234");
	  
	 // driver.findElement(By.id("wpRetype")).sendKeys("abc@1234");
	  
	//  driver.findElement(By.id("wpEmail")).sendKeys("ab123c@gmail.com");
	  
	  driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("RamaPaladugu");
		
	 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("ABC12345678");
		driver.findElement(By.xpath("//*[@name='login']")).submit();
	

	 }

	 @Then("^the account created successfully$")
	 
	 public void method4()
	 {
	  System.out.println(driver.getCurrentUrl());
	  System.out.println("Account created successfully");
	  driver.close();
	 }
	 

	
	
	
	
}
