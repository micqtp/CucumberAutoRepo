package com.basic.TagsSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsStepDef {
	
	WebDriver driver;
	
	
	@Given("^user need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
	}

	@When("^user enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName)
	{ 
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys(userName);	
	}
	
	@Then("^user checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException
	{
		String userNameActual = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
	}	
	
	@And("^user enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String userSurname) throws InterruptedException
	{
		driver.findElement(By.id(("u_0_q"))).sendKeys(userSurname);
		Thread.sleep(1000);
	}
	
	@Then("^user mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws InterruptedException
	{
		String mobileNumber = driver.findElement(By.id("u_0_t")).getAttribute("value");
		Assert.assertEquals("", mobileNumber);
		Thread.sleep(1000);
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver = null;
	}
	
	
}
