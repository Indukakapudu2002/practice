import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class button
{
    public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://letcode.in/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[normalize-space()='Explore Workspace']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Click']")).click();
            // location
            WebElement button1 = driver.findElement(By.id("position"));
            Point location = button1.getLocation();
            System.out.println(location);
            // color
            WebElement button2 = driver.findElement(By.id("color"));
            String color = button2.getCssValue("background-color");
            System.out.println(color);
            // width & height
            Rectangle rect = driver.findElement(By.id("property")).getRect();
            int height = rect.getHeight();
            int width = rect.getWidth();
            System.out.println("Tall "+ height + " Fat "+width);
            boolean enabled = driver.findElement(By.id("isDisabled")).isEnabled();
            System.out.println(enabled);
            WebElement holdele=driver.findElement(By.xpath("//h2[normalize-space()='Button Hold!']"));
            Actions act=new Actions(driver);
            act.clickAndHold(holdele).build().perform();
            Thread.sleep(3000);
            driver.quit();
        }
    }
