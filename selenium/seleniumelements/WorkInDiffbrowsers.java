import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.*;
public class differentbrowsers
{
    public static void main(String[] args) throws InterruptedException
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your preffered browser\n1.chrome\n2.safari\n3.Firefox");
            String browser=sc.next();
            MakeMyTrip(browser);

        }
        public static void MakeMyTrip(String browser) throws InterruptedException {
            WebDriver driver;
            if (browser.equals("chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equals("safari")) {
                driver = new SafariDriver();
            } else {
                driver = new FirefoxDriver();
            }
            SearchElement(driver);
        }
        public static void SearchElement(WebDriver driver) throws InterruptedException {
            driver.get("https://www.makemytrip.com/railways/");
            driver.manage().window().maximize();
            WebElement elementclick = driver.findElement(By.xpath("//a[normalize-space()='Search']"));
            elementclick.click();
            Thread.sleep(3000);
            driver.close();

        }

    }
