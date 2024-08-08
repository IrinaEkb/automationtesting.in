package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.automationtesting.in/Register.html");

        String predefindDOB = "May";

        WebElement dropdownMonth = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
        // create select object
        Select selectMonth = new Select(dropdownMonth);

        //get all options in dropdown
        List<WebElement> allOptions = selectMonth.getOptions();

        //iterate through each option
        for (WebElement option : allOptions) {
            String monthText = option.getText();
            System.out.println(monthText);

            // compare DOB
            if (monthText.equals(predefindDOB)) {
                System.out.println("Match found: " + monthText);
                break;
            }

        }

        driver.quit();
    }
}
