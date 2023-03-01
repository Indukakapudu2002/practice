import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class input
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://letcode.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Explore Workspace']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Edit']")).click();
        //input 1
        driver.findElement(By.id("fullName")).sendKeys("indu");
        Thread.sleep(3000);
        //input 2
        driver.findElement(By.id("join")).sendKeys(" appending my text", Keys.TAB);
        Thread.sleep(3000);
        //input 3
        System.out.println(driver.switchTo().activeElement().getAttribute("value"));
        Thread.sleep(3000);
        //input 4
        driver.findElement(By.id("clearMe")).clear();
        Thread.sleep(3000);
        //input5
        System.out.println(driver.findElement(By.id("noEdit")).isEnabled());
        //input6
        System.out.println(driver.findElement(By.id("dontwrite")).getAttribute("readonly"));
        driver.quit();
    }
}
