package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {
    public static void main(String[] args) {
        /*
        Invoke Chrome Browser
        Navigate to URL: https://clarusway.com/
        Navigate to URL: http://amazon.com/
        Come back to the Clarusway using the back command.
                Again go back to the amazon website using forward command
        Refresh the Browser using refresh command.
        Close the Browser.
         */
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Clarusway ve amazon sitelerine gittik  Best Practice->driver.get()
        driver.navigate().to("http://amazon.com");
        driver.navigate().to("https://clarusway.com");

        //geri tuşuyla amazona geri döndük
        driver.navigate().back();

        //İleri tuşuyla clarswaya geri döndük
        driver.navigate().forward();

        //Sayfamızı kapattık
        driver.navigate().refresh();

        //Browser'ımızı kapattık
        driver.close();
    }
}
