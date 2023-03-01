import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, ParseException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        implementation(driver);

    }
    public static void implementation(WebDriver driver) throws InterruptedException, IOException, ParseException {
        driver.get("https://news.ycombinator.com/");
        String s=driver.getTitle();
        System.out.println(s);
        if(s.equalsIgnoreCase("Hacker news")) {
            System.out.println("yes it is the right website");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[normalize-space()='login']")).click();
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("/Users/kinduvadana/Desktop/credentials.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("username");
            String pwd = (String) jsonObject.get("password");
            driver.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).sendKeys(name);
            driver.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys(pwd);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@value='login']")).click();
            Thread.sleep(3000);
        }
        else{
            System.out.println("This is wrong website");
        }
        driver.close();
    }

}



