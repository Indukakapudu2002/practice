import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        dragdrop(driver);
    }
    public static void dragdrop(WebDriver driver) throws InterruptedException {
        destination(driver);
        driver.findElement(By.xpath("//a[normalize-space()='AUI - 2']")).click();
        WebElement dragelement = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropelement = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions act = new Actions(driver);
        act.dragAndDrop(dragelement, dropelement).perform();
        Thread.sleep(3000);
        driver.close();
    }
        public static void destination(WebDriver driver)
        {
            driver.get("https://letcode.in");
            driver.manage().window().maximize();
            WebElement test=driver.findElement(By.xpath("//a[normalize-space()='Explore Workspace']"));
            test.click();
        }
}
