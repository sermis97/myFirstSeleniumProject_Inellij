package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1_findingElements_using_id {
    public static void main(String[] args) throws InterruptedException {

          /*userName: tomsmith
        password: SuperSecretPassword!

        NOT ALL ELEMENTS  HAVE IDS.
        THE ID MIGHT BE AUTO-GENERATED
         */

       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        Thread.sleep(4000);

        driver.quit();
    }
}
