package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TC5_findingElements_using_TagName {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = driver.findElements(By.tagName("tr"));

        // to get the all number of rows
        System.out.println(tableRows.size());//10

        //to get the last Name, First Name ,Email, Due, Website, Action of the table(index 0)

        System.out.println(tableRows.get(0).getText());//Last Name First Name Email Due Web Site Action


        //to get all information of a table
        /*
        Last Name First Name Email Due Web Site Action
        Last Name First Name Email Due Web Site Action
        Smith John jsmith@gmail.com $50.00 http://www.jsmith.com edit delete
        Bach Frank fbach@yahoo.com $51.00 http://www.frank.com edit delete
        Doe Jason jdoe@hotmail.com $100.00 http://www.jdoe.com edit delete
        Conway Tim tconway@earthlink.net $50.00 http://www.timconway.com edit delete

         */
        System.out.println(tableRows.get(0).getText());
        System.out.println(tableRows.get(1).getText());
        System.out.println(tableRows.get(2).getText());
        System.out.println(tableRows.get(3).getText());
        System.out.println(tableRows.get(4).getText());



    }
}
