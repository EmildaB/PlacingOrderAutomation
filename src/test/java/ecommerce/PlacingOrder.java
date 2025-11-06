package ecommerce;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class PlacingOrder extends BaseClass {

    @BeforeClass
    public void setup() {
        launchBrowser();
    }

    @Test
    public void placeOrderTest() throws InterruptedException {
        driver.get("https://omrbranch.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("email")).sendKeys("shirleysha67@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("9003276609@Es");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        WebElement categories = driver.findElement(By.xpath("//a[text()='CATEGORIES ']"));
        actions.moveToElement(categories).perform();

        WebElement grocery = driver.findElement(By.xpath("//a[text()='Grocery']"));
        actions.moveToElement(grocery).perform();

        WebElement fruitNuts = driver.findElement(By.xpath("//a[text()='Fruit & Nuts']"));
        js.executeScript("arguments[0].click()", fruitNuts);

        WebElement add = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
        js.executeScript("arguments[0].click()", add);
        Thread.sleep(2000);

        WebElement addToCart = driver.findElement(By.xpath("(//button[text()='Add'])[1]"));
        js.executeScript("arguments[0].click()", addToCart);
        Thread.sleep(2000);

        WebElement goToCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
        js.executeScript("arguments[0].click()", goToCart);
        Thread.sleep(2000);

        WebElement addAddress = driver.findElement(By.xpath("//img[@src='https://omrbranch.com/front/images/plus.png']"));
        js.executeScript("arguments[0].click()", addAddress);
        Thread.sleep(2000);

        new Select(driver.findElement(By.id("address_type"))).selectByIndex(2);
        driver.findElement(By.xpath("(//input[@placeholder='First name*'])[1]")).sendKeys("Emilda");
        driver.findElement(By.xpath("//input[@placeholder='Last name*']")).sendKeys("Shirley");
        driver.findElement(By.xpath("//input[@placeholder='Contact No*']")).sendKeys("9003276609");
        driver.findElement(By.xpath("//input[@placeholder='House No*']")).sendKeys("No 219");
        driver.findElement(By.xpath("//input[@placeholder='Address*']")).sendKeys("3rd street, sastrinagar");

        new Select(driver.findElement(By.name("country"))).selectByVisibleText("India");
        new Select(driver.findElement(By.name("state"))).selectByVisibleText("Bihar");
        new Select(driver.findElement(By.name("city"))).selectByVisibleText("Ara");
        driver.findElement(By.xpath("//input[@placeholder='Zip Code*']")).sendKeys("600039");

        WebElement saveBtn = driver.findElement(By.xpath("(//button[text()='Save'])[3]"));
        js.executeScript("arguments[0].click()", saveBtn);
        Thread.sleep(2000);

        new Select(driver.findElement(By.id("payment_type"))).selectByVisibleText(" Debit Card ");
        WebElement card = driver.findElement(By.xpath("//label[text()=' Master ']"));
        js.executeScript("arguments[0].click()", card);

        driver.findElement(By.name("card_no")).sendKeys("5555555555554444");
        new Select(driver.findElement(By.name("month"))).selectByVisibleText(" January ");
        new Select(driver.findElement(By.name("year"))).selectByVisibleText(" 2026 ");
        driver.findElement(By.name("cvv")).sendKeys("123");

        driver.findElement(By.id("placeOrder")).click();

        WebElement orderNo = driver.findElement(By.xpath("//p[@class='font18 color20 fontSemiBold mb-0'][1]"));
        System.out.println("Order Number: " + orderNo.getText());
        System.out.println("✅ Order placed successfully.");
        System.out.println("Test completed by Emilda B.");
    }

    @AfterClass
    public void teardown() {
        quitBrowser();
    }
}
