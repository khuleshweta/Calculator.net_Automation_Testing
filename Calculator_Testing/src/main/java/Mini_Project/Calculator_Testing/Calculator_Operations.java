package Mini_Project.Calculator_Testing;

import org.openqa.selenium.By;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class Calculator_Operations {

    public static void main(String[] args) throws InterruptedException {

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        // Open Website
        driver.get("https://www.calculator.net/scientific-calculator.html");

        // Maximize Browser
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // ================= ADDITION =================
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='+']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        System.out.println("2 + 3 =  " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= SUBTRACTION =================
        driver.findElement(By.xpath("//span[text()='9']")).click();
        driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        System.out.println("9 - 4 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= MULTIPLICATION =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='×']")).click();
        driver.findElement(By.xpath("//span[text()='6']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        System.out.println("5 × 6 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= DIVISION =================
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        System.out.println("8 / 2 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= SIN =================
        driver.findElement(By.xpath("//span[text()='sin']")).click();
        driver.findElement(By.xpath("//span[text()='9']")).click();
        driver.findElement(By.xpath("//span[text()='0']")).click();
        System.out.println("sin(90) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= COS =================
        driver.findElement(By.xpath("//span[text()='cos']")).click();
        driver.findElement(By.xpath("//span[text()='0']")).click();
        System.out.println("cos(0) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= TAN =================
        driver.findElement(By.xpath("//span[text()='tan']")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        System.out.println("tan(45) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= SIN INVERSE =================
        driver.findElement(By.xpath("//span[contains(.,'sin')]")).click();
        driver.findElement(By.xpath("//span[text()='1']")).click();
        System.out.println("sin⁻¹(1) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= COS INVERSE =================
        driver.findElement(By.xpath("//span[contains(.,'cos')]")).click();
        driver.findElement(By.xpath("//span[text()='1']")).click();
        System.out.println("cos⁻¹(1) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= TAN INVERSE =================
        driver.findElement(By.xpath("//span[contains(.,'tan')]")).click();
        driver.findElement(By.xpath("//span[text()='1']")).click();
        System.out.println("tan⁻¹(1) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= PI =================
        driver.findElement(By.xpath("//span[text()='π']")).click();
        System.out.println("π = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= e =================
        driver.findElement(By.xpath("//span[text()='e']")).click();
        System.out.println("e = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= x^y =================
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[contains(.,'x')]//sup[text()='y']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        System.out.println("2^3 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= x³ =================
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[contains(.,'x')]//sup[text()='3']")).click();
        System.out.println("2³ = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= x² =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[contains(.,'x')]//sup[text()='2']")).click();
        System.out.println("5² = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= y√x =================
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[contains(.,'√x')]//sup[text()='y']")).click();
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        System.out.println("²√8 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= e² =================
        driver.findElement(By.xpath("//span[contains(.,'e')]//sup[text()='x']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        System.out.println("e² = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= 10² =================
        driver.findElement(By.xpath("//span[contains(.,'10')]//sup[text()='x']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        System.out.println("10² = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= 3√2 =================
        driver.findElement(By.xpath("//span[contains(text(),'√x')]//sup[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        System.out.println("3√2 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= √9 =================
        driver.findElement(By.xpath("//span[contains(text(),'√x')]")).click();
        driver.findElement(By.xpath("//span[text()='9']")).click();
        System.out.println("√9 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= ln(5) =================
        driver.findElement(By.xpath("//span[text()='ln']")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        System.out.println("ln(5) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= log(10) =================
        driver.findElement(By.xpath("//span[text()='log']")).click();
        driver.findElement(By.xpath("//span[text()='1']")).click();
        driver.findElement(By.xpath("//span[text()='0']")).click();
        System.out.println("log(10) = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= BRACKETS =================
        driver.findElement(By.xpath("//span[text()='(']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='+']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()=')']")).click();
        driver.findElement(By.xpath("//span[text()='×']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        System.out.println("(2+3)×2 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= 1/x =================
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='1/x']")).click();
        System.out.println("1/4 = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= PERCENTAGE =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='0']")).click();
        driver.findElement(By.xpath("//span[text()='%']")).click();
        System.out.println("50% = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= FACTORIAL =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='n!']")).click();
        System.out.println("5! = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

     // ================= DEG =================
        driver.findElement(By.id("scirdsettingd")).click();
        System.out.println("Deg Button Clicked");

        // ================= RAD =================
        driver.findElement(By.id("scirdsettingr")).click();
        System.out.println("Rad Button Clicked");

        // ================= BACK =================
        driver.findElement(By.xpath("//span[text()='1']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='Back']")).click();
        System.out.println("Back Result = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= ANS =================
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='+']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        driver.findElement(By.xpath("//span[text()='Ans']")).click();
        System.out.println("Ans Result = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= M+ =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='M+']")).click();
        System.out.println("M+ Working");
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= MR =================
        driver.findElement(By.xpath("//span[text()='MR']")).click();
        System.out.println("MR Result = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= M- =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='M-']")).click();
        System.out.println("M- Working");
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= DECIMAL =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='.']")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        System.out.println("Decimal = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= EXP =================
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='EXP']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        System.out.println("EXP Result = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= PLUS/MINUS =================
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='±']")).click();
        System.out.println("± Result = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= RND =================
        driver.findElement(By.xpath("//span[text()='RND']")).click();
        System.out.println("RND Result = " + driver.findElement(By.id("sciOutPut")).getText());
        driver.findElement(By.xpath("//span[text()='AC']")).click();

        // ================= IMPORTANT FIX: RESET PAGE =================
        driver.get("https://www.calculator.net/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

        Thread.sleep(2000);

        // ================= GET ALL LINKS =================
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='hl']//a"));

        System.out.println("Total Links Found: " + links.size());

        // ================= CLICK EACH LINK =================
        for (int i = 0; i < links.size(); i++) {

            // re-fetch elements to avoid stale element error
            links = driver.findElements(By.xpath("//ul[@class='hl']//a"));

            WebElement link = links.get(i);

            String name = link.getText();
            System.out.println("Clicking: " + name);

            try {
                link.click();

                wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

                Thread.sleep(1500);

                // go back to homepage again
                driver.get("https://www.calculator.net/");

                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("FAILED: " + name);
            }
        }

     // ================= FOOTER LINK TEST =================

     // Open homepage
     driver.get("https://www.calculator.net/");

     Thread.sleep(2000);

     // Get all footer links
     List<WebElement> footerLinks = driver.findElements(
             By.xpath("//div[@id='footernav']//a"));

     System.out.println("Total Footer Links: " + footerLinks.size());

     // Click each footer link
     for (int i = 0; i < footerLinks.size(); i++) {

         // Re-fetch elements every loop
         footerLinks = driver.findElements(
                 By.xpath("//div[@id='footernav']//a"));

         WebElement link = footerLinks.get(i);

         String linkName = link.getText();

         System.out.println("Clicking Footer Link: " + linkName);

         try {

             link.click();

             Thread.sleep(2000);

             System.out.println(linkName + " --> OPENED SUCCESSFULLY");

             // Go back to homepage
             driver.get("https://www.calculator.net/");

             Thread.sleep(2000);

         } catch (Exception e) {

             System.out.println(linkName + " --> FAILED TO OPEN");
         }
     }
        driver.quit();
    }
}