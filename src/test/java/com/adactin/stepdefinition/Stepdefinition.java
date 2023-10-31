package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.AdactinRunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	public static WebDriver driver = AdactinRunnerClass.driver;


	@Given("^user Launch The Url Of Adactin Application$")
	public void user_Launch_The_Url_Of_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.xpath("//td/child::input[@id='username']"));
		username.sendKeys("Ramya1302");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//td/child::input[@id='password']"));
		password.sendKeys("KW8W4G");
	}

	@Then("^user Click The Login Button And It Naigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Naigates_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//td/child::input[@id='login']"));
		login.click();
	}

	@When("^user Select The Location In Location Dropdown$")
	public void user_Select_The_Location_In_Location_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@name='location']"));
		WebElement s = driver.findElement(By.id("location"));
		Select b = new Select(s);
		b.selectByIndex(2);
	}

	@When("^user Select The Hotel In Hotels Dropdown$")
	public void user_Select_The_Hotel_In_Hotels_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@id='hotels']"));
		WebElement a = driver.findElement(By.id("hotels"));
		Select c = new Select(a);
		c.selectByIndex(3);
	}

	@When("^user Select The Room Type In Room Type Dropdown$")
	public void user_Select_The_Room_Type_In_Room_Type_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@name='room_type']"));
		WebElement d = driver.findElement(By.id("room_type"));
		Select e = new Select(d);
		e.selectByIndex(1);
	}

	@When("^user Select The Number Of Rooms In Number Of Rooms Dropdown$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@name='room_nos']"));
		WebElement f = driver.findElement(By.id("room_nos"));
		Select g = new Select(f);
		g.selectByIndex(3);
	}

	@When("^user Enter The Check In Date In Check In Date Tab$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Tab() throws Throwable {
		WebElement h = driver.findElement(By.xpath("//input[@name='datepick_in'] "));
		h.click();
		h.clear();
		h.sendKeys("31/10/2023");
	}

	@When("^user Enter The Check Out Date In Check Out Date Tab$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Tab() throws Throwable {
		WebElement l = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		l.click();
		l.clear();
		l.sendKeys("5/11/2023");
	}

	@When("^user Select The Number Of Adults In Adults Per Room Dropdown$")
	public void user_Select_The_Number_Of_Adults_In_Adults_Per_Room_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@name='adult_room']"));
		WebElement p = driver.findElement(By.id("adult_room"));
		Select o = new Select(p);
		o.selectByIndex(1);
	}

	@When("^user Select The Number Of Children In Children Per Room Dropdown$")
	public void user_Select_The_Number_Of_Children_In_Children_Per_Room_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@name='child_room']"));
		WebElement i = driver.findElement(By.id("child_room"));
		Select u = new Select(i);
		u.selectByIndex(3);
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
		click.click();
	}

	@When("^user Click The Radio Button To Select The Hotels In the Below List Of Hotels$")
	public void user_Click_The_Radio_Button_To_Select_The_Hotels_In_the_Below_List_Of_Hotels() throws Throwable {
		WebElement radiobutton = driver
				.findElement(By.xpath("//td[@bgcolor='#FFFFFF']/child::input[@id='radiobutton_0']"));
		radiobutton.click();
	}

	@Then("^user Click The Continue Button And It Navigates To The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
		WebElement cont = driver.findElement(By.xpath("//td[@align='center']/child::input[@id='continue']"));
		cont.click();
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Selva");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("Ramya");

	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("No 30 Middle Street Shanmugapuram,Puducherry,605009.");
	}

	@When("^user Enter The Credit Card Number In Credit Card no\\. Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_no_Field() throws Throwable {
		WebElement ccnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnum.sendKeys("4563876590238234");

	}

	@When("^user Select The Card Type In Credit Card Type Dropdown$")
	public void user_Select_The_Card_Type_In_Credit_Card_Type_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@name='cc_type']"));
		WebElement t = driver.findElement(By.id("cc_type"));
		Select r = new Select(t);
		r.selectByIndex(4);
	}

	@When("^user Select The Expiry Month And Year in The Expiry Date Dropdown$")
	public void user_Select_The_Expiry_Month_And_Year_in_The_Expiry_Date_Dropdown() throws Throwable {
		driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		WebElement w = driver.findElement(By.id("cc_exp_month"));
		Select v = new Select(w);
		v.selectByIndex(6);
		
		driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		WebElement n = driver.findElement(By.id("cc_exp_year"));
		Select m = new Select(n);
		m.selectByIndex(6);
	}

	@When("^user Enter The Cvv Number In The CVV Number Field$")
	public void user_Enter_The_Cvv_Number_In_The_CVV_Number_Field() throws Throwable {
		WebElement cvvnum = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvvnum.sendKeys("457");

	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		booknow.click();
	}

	@Then("^User Click The Logout Button And It Navigates To The Logout Page$")
	public void user_Click_The_Logout_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		WebElement logout = driver.findElement(By.name("logout"));
		logout.click();

	}

}
