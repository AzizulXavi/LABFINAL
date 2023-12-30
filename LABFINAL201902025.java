package lab.pkgfinal.pkg201902025;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LABFINAL201902025 {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
driver.get("HTTPS://WWW.SAUCEDEMO.COM/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("standard_user");
Thread.sleep(5000);
driver.findElement(By.id("password")).sendKeys("secret_sauce");
Thread.sleep(5000);
driver.findElement(By.id("45")).click();
String actual = driver.getTitle();
String expected = "login ";
driver.close();
if(actual.equalsIgnoreCase(expected))
{
System.out.println("Test Successfull");
}
else
{
System.out.println("Test failed");
}
}
}

