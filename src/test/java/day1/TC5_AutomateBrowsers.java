package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC5_AutomateBrowsers {
    public static void main(String[] args) {

       /*
       WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();   // Sadece Microsoft Edge browserı açar
       */

        //Sadece firefoxu açar

        WebDriverManager .firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

    }
}
