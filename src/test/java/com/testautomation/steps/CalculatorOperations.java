package com.testautomation.steps;

import com.testautomation.setup.ConfigureAndroid;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;


public class CalculatorOperations extends ConfigureAndroid {
    @Given("Appium server is running and Android device Is connected")
    public void appiumServerIsRunningAndAndroidDeviceIsConnected()  {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

    }
    @And("Calculation Application is Launched")
    public void calculationApplicationIsLaunched() throws MalformedURLException {
        androidSetup();
    }

    @And("User accepts the agreement")
    public void user_accepts_the_agreement() {
        WebDriverWait wait;
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // alert(accept);
        try {

            wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.miui.calculator:id/btn_2_s")));


            WebElement five = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
            WebElement equals = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    @When("User enter number {int}")
//    public void user_enter_number(Integer int1) {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new io.cucumber.java.PendingException();
////         try{
//
//             WebElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
//            two.click();
//            System.out.println("clicked 2");
//
//            System.out.println("clicked +");
//            five.click();
//            System.out.println("clicked 5");
//            equals.click();
//            System.out.println("clicked =");
//            WebElement result = driver.findElement(By.id("com.miui.calculator:id/result"));
//            String value = result.getText();
//            System.out.println(value);
//
//            driver.quit();
//            System.out.println("Test Complete and application closed");
//        } catch (Exception e) {
//            e.getCause();
//            e.getMessage();
//            e.printStackTrace();
//
//        }
//    }
    @When("Clicks on {string} button")
    public void clicks_on_button(String string1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Verify result is number {int}")
    public void verify_result_is_number(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}


