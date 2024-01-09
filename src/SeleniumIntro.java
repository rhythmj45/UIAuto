import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/rhythmj45/Downloads/chromedriver_mac_arm64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.print(driver.getTitle());
		driver.close();	}
// adding comments to learn git commits
	
}
