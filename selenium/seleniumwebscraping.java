import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class selenium {
    public static void main(String[] args) throws InterruptedException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the browser  you want to run \nchrome\nfirefox\nsafari ");
            String s = sc.next();
            WebDriver driver = browserselection(s);
            implementation(driver);
        }
        public static void implementation(WebDriver driver) throws InterruptedException {
            driver.get("https://news.ycombinator.com/");
            String s=driver.getTitle();
            System.out.println(s);
            if(s.equalsIgnoreCase("Hacker news")){
                System.out.println("yes it is the right website");
                driver.manage().window().maximize();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,500)", "");
                WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
                ele.sendKeys("linux");
                ele.sendKeys(Keys.RETURN);
                Thread.sleep(3000);
                driver.findElement(By.id("downshift-2-label")).click();
                driver.findElement(By.xpath("//button[normalize-space()='Custom range']")).click();
                Thread.sleep(7000);
                driver.findElement(By.xpath("//span[@aria-label='Previous Month']")).click();
                driver.findElement(By.xpath("//div[@aria-label='Sun Jan 01 2023']")).click();
                driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
                Thread.sleep(3000);}
            else{
                System.out.println("This is wrong website");
            }
            driver.close();
        }
        public static WebDriver browserselection(String s) {

            if (s.equalsIgnoreCase("chrome")) {
                return new ChromeDriver();
            }
            else if(s.equalsIgnoreCase("safari"))
            {
                return new SafariDriver();
            }
            else
            {
                return new FirefoxDriver();
            }
        }
    }
