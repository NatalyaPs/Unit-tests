package seminars.five;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/*Задание №4
 Напишите автоматизированный тест, который выполнит следующие шаги:
 1. Открывает главную страницу Google.
 2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
 3. В результатах поиска ищет ссылку на официальный сайт Selenium
 (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
 результатов поиска.
 */
// см  СКРИНШОТЫ С РАЗНЫМИ ВАРИАНТАМИ
public class SeleniumTest {
    @Test
    void findSeleniumTest() {
        //WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q")); // можно искать один эл-т,можно список. можно By.xpath-самый уникальный. Можно искать по тегу, по имени, By.class и т.д. - главное - уникальное значение
        searchBox.sendKeys("Selenium");
        searchBox.submit(); // нажать на энтер

        List<WebElement> searchUrls = driver.findElements(By.cssSelector("div")); // By.xpath

        boolean isFound = false;
        for (WebElement elem : searchUrls) {
            if (elem.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }
        assertTrue(isFound);
        driver.quit(); // освобождаем ресурсы
    }

    /*Задание №5  (в селениумТесте)
    Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на
    сайте https://www.saucedemo.com/.
    Данные для входа - логин: "standard_user", пароль: "secret_sauce".
    Проверить, что авторизация прошла успешно и отображаются товары.
    Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода
    данных в поля формы, и submit() для отправки формы. После этого, проверьте, что на странице
    отображаются продукты (productsLabel.getText() = "Products").*/
    @Test
    void sauceDemoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                //"D:/repo/Unit/chromedriver-win64/chromedriver.exe");
        "C:/.../019_Unit-tests/examples/sem_5_unit-tests-5_kod_seminara/libs/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


        WebElement loginBox = driver.findElement(By.name("user-name"));
        loginBox.sendKeys("standard_user");

        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("secret_sauce");

        WebElement button = driver.findElement(By.id("login-button"));
        button.click();

        WebElement product = driver.findElement(By.className("title"));

        assertTrue(product.getText().contains("Products"));

        Thread.sleep(10000);
        driver.quit();
    }
}

//xPath - обязательно к прочтению
//pageablePattern
