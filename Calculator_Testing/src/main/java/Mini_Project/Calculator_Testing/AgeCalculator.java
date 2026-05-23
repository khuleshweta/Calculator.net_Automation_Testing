package Mini_Project.Calculator_Testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgeCalculator {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Open Website
		driver.get("https://www.calculator.net/age-calculator.html");

		// Maximize Window
		driver.manage().window().maximize();

		// Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// -----------------------------
		// Check Header Links
		// -----------------------------

		List<WebElement> headerLinks;

		for (int i = 0; i < 4; i++) {

			headerLinks = driver.findElements(By.xpath("//div[@class='topNavAbs']//a"));

			String linkName = headerLinks.get(i).getText();

			System.out.println("Checking Link : " + linkName);

			headerLinks.get(i).click();

			Thread.sleep(2000);

			System.out.println("Current URL : " + driver.getCurrentUrl());

			driver.navigate().back();

			Thread.sleep(2000);
	

			// Re-fetch Elements after Back
			headerLinks = driver.findElements(By.xpath("//div[@class='topNavAbs']//a"));
		}

		// -----------------------------
		// Age Calculator Functionality
		// -----------------------------

		// Open Age Calculator Again
		driver.get("https://www.calculator.net/age-calculator.html");

		// Select Month
		WebElement month = driver.findElement(By.id("today_Month_ID"));
		month.sendKeys("Jan");

		// Select Day
		WebElement day = driver.findElement(By.id("today_Day_ID"));
		day.sendKeys("01");

		// Enter Year
		WebElement year = driver.findElement(By.id("today_Year_ID"));

		year.click();
		year.sendKeys(Keys.CONTROL + "a");
		year.sendKeys(Keys.DELETE);
		year.sendKeys("1980");

		// Click Calculate
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();

		Thread.sleep(3000);

		// Print Result
		String result = driver.findElement(By.xpath("//p[@class='verybigtext']")).getText();

		System.out.println("Age Result : " + result);

		// -----------------------------
		// Check Important Elements
		// -----------------------------

		WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));

		if (calculateButton.isDisplayed()) {
			System.out.println("Calculate Button is Displayed");
		}

		WebElement monthDropdown = driver.findElement(By.id("today_Month_ID"));

		if (monthDropdown.isEnabled()) {
			System.out.println("Month Dropdown is Enabled");
		}

		WebElement dayDropdown = driver.findElement(By.id("today_Day_ID"));

		if (dayDropdown.isEnabled()) {
			System.out.println("Day Dropdown is Enabled");
		}

		WebElement yearTextbox = driver.findElement(By.id("today_Year_ID"));

		if (yearTextbox.isEnabled()) {
			System.out.println("Year Textbox is Enabled");
		}
		
		// ---------------- RELATED LINKS TESTING ----------------

				System.out.println("\n===== RELATED LINKS =====");

				List<WebElement> relatedLinks = driver.findElements(
						By.xpath("//fieldset//a"));

				System.out.println("Total Related Links : " + relatedLinks.size());

				for (int i = 0; i < relatedLinks.size(); i++) {

					// Re-find elements to avoid stale element exception
					relatedLinks = driver.findElements(By.xpath("//fieldset//a"));

					String linkName = relatedLinks.get(i).getText();

					System.out.println("\nChecking Related Link : " + linkName);

					relatedLinks.get(i).click();

					Thread.sleep(2000);

					System.out.println("Current URL : " + driver.getCurrentUrl());

					driver.navigate().back();

					Thread.sleep(2000);
				}


		
		// ---------------- FOOTER LINKS TESTING ----------------

				System.out.println("\n===== FOOTER LINKS =====");

				List<WebElement> footerLinks = driver.findElements(
						By.xpath("//div[@id='footernav']//a"));

				System.out.println("Total Footer Links : " + footerLinks.size());

				for (int i = 0; i < footerLinks.size(); i++) {

					// Re-find footer links
					footerLinks = driver.findElements(
							By.xpath("//div[@id='footernav']//a"));

					String footerName = footerLinks.get(i).getText();

					System.out.println("\nChecking Footer Link : " + footerName);

					footerLinks.get(i).click();

					Thread.sleep(2000);

					System.out.println("Current URL : " + driver.getCurrentUrl());

					driver.navigate().back();

					Thread.sleep(2000);
				}
				
				// ---------------- SIGN IN LINK TESTING ----------------

				System.out.println("\n===== SIGN IN LINK TESTING =====");

				// Find Sign In link
				WebElement signIn = driver.findElement(
						By.xpath("//div[@id='login']//a"));

				// Print link text
				System.out.println("Link Name : " + signIn.getText());

				// Click Sign In
				signIn.click();

				Thread.sleep(3000);
				driver.navigate().back();

				// Print current URL
				System.out.println("Current URL : " + driver.getCurrentUrl());

				// Verify Sign In page opened or not
				if(driver.getCurrentUrl().contains("sign-in")) {

					System.out.println("Sign In Page Opened Successfully");

				} else {

					System.out.println("Sign In Page Failed");

				}


	driver.quit();
	}
}