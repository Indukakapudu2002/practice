import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot
{
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        screenshot(driver);
    }
    public static void screenshot(WebDriver driver) throws InterruptedException, IOException {
        destination(driver);
        driver.findElement(By.xpath("//a[normalize-space()='Play it!']")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        Files.copy(file,new File("//Users/kinduvadana/documents/screenshot.png"));
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
