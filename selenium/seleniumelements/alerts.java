import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        simplealerts(driver);
        confirmalerts(driver);
        promptalert(driver);
        modernalerts(driver);
    }
    public static void simplealerts(WebDriver driver) throws InterruptedException {
        destination(driver);
        driver.findElement(By.id("accept")).click();
        Alert simplealert=driver.switchTo().alert();
        System.out.println(simplealert.getText());
        Thread.sleep(3000);
        simplealert.accept();
        Thread.sleep(3000);
        driver.close();
    }
    public static void confirmalerts(WebDriver driver) throws InterruptedException {
        destination(driver);
        driver.findElement(By.id("confirm")).click();
        Alert confirmationAlert=driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        Thread.sleep(3000);
        confirmationAlert.dismiss();
        Thread.sleep(3000);
        driver.close();
    }
    public static void promptalert(WebDriver driver) throws InterruptedException {
        destination(driver);
        driver.findElement(By.id("prompt")).click();
        Alert promptalert=driver.switchTo().alert();
        System.out.println(promptalert.getText());
        promptalert.sendKeys("indu");
        promptalert.accept();
        Thread.sleep(3000);
        driver.close();
    }
    public static void destination(WebDriver driver)
    {
        driver.get("https://news.ycombinator.com/");
        driver.manage().window().maximize();
        WebElement test=driver.findElement(By.xpath("//a[normalize-space()='Explore Workspace']"));
        test.click();
        driver.findElement(By.xpath("//a[normalize-space()='Dialog']")).click();
    }
    public static void modernalerts(WebDriver driver) throws InterruptedException {
        destination(driver);
        driver.findElement(By.id("modern")).click();
        Alert modernalert=driver.switchTo().alert();
        System.out.println(modernalert.getText());
        Thread.sleep(3000);
        modernalert.accept();
        //driver.findElement(By.id("close")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
