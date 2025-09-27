package org.example.IUTest.SeleniumWD;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
    



public class Testv1GoogleSearchPobeda {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static final int MAX_RETRY_ATTEMPTS = 3;



    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testGoogleSearchAndLanguageSwitch() {
        int attempt = 0;
        boolean captchaHandled = false;
        
        while (!captchaHandled && attempt < MAX_RETRY_ATTEMPTS) {
            try {
                System.out.println("Попытка " + (attempt + 1) + " выполнения теста");
            // Открыть сайт google.com
            driver.get("https://www.google.com");
            
            if (isCaptchaPresent()) {
                    System.out.println("Обнаружена капча на странице Google");
                    handleGoogleCaptcha();
                    // После обработки капчи ждем немного времени
                    Thread.sleep(3000);
                }
            
            // Ввести в строку поиска "Сайт компании Победа"
            WebElement searchBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("q"))
            );
            searchBox.clear();
            searchBox.sendKeys("Сайт компании Победа");
            Thread.sleep(3000);
            
            // Нажать Enter
            searchBox.submit();
            
            Thread.sleep(6000);
            
            // Дождаться результатов поиска
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
            
            Thread.sleep(6000);

            // Кликнуть на первую ссылку (по URL)(Уточнить локатор)
            WebElement firstResult = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class='g']//a[contains(@href,'pobeda.aero')]")
                )
            );
            firstResult.click();
            
            // Дождаться загрузки страницы "Победа"
            wait.until(ExpectedConditions.urlContains("pobeda.aero"));
            
            // Дождаться появления текста "Полетели в Калининград"
            WebElement textElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//div[contains(text(), 'Полетели в Калининград') or contains(@class, 'flight-text')]")
                )
            );
            
            String actualText = textElement.getText();
            assertEquals("Полетели в Калининград", actualText);
            
            // Переключение языка
            // Найти элемент переключения языка (пример локатора)
            WebElement languageToggle = wait.until(
                ExpectedConditions.elementToBeClickable(By.className("language-toggle"))
            );
            languageToggle.click();
            
            // Выбрать английский язык
            WebElement englishOption = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'English')]"))
            );
            englishOption.click();
            
            // Проверить отображение текстов
            String[] expectedTexts = {"Ticket search", "Online check-in", "Manage my booking"};
            
            for (String expectedText : expectedTexts) {
                WebElement element = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[contains(text(), '" + expectedText + "')]")
                    )
                );
                assertNotNull("Текст '" + expectedText + "' не найден на странице", element);
            }
            
        } catch (Exception e) {
            fail("Ошибка теста: " + e.getMessage());
        }
    }
    }

        private boolean isCaptchaPresent() {
        try {
            // Ищем элементы характерные для капчи
            WebElement captchaElement = driver.findElement(By.xpath("//div[contains(@class, 'captcha')]"));
            return captchaElement != null && captchaElement.isDisplayed();
        } catch (NoSuchElementException e) {
            // Проверяем другие возможные элементы капчи
            try {
                driver.findElement(By.xpath("//iframe[contains(@src, 'recaptcha')]"));
                return true;
            } catch (NoSuchElementException ex) {
                try {
                    driver.findElement(By.xpath("//div[contains(@class, 'g-recaptcha')]"));
                    return true;
                } catch (NoSuchElementException exc) {
                    return false;
                }
            }
        }
    }

    private void handleGoogleCaptcha() throws InterruptedException {
        System.out.println("Попытка обработки капчи Google...");
        
        // Проверяем, есть ли iframe с reCAPTCHA
        try {
            WebElement recaptchaFrame = driver.findElement(By.xpath("//iframe[contains(@src, 'recaptcha')]"));
            
            if (recaptchaFrame != null && recaptchaFrame.isDisplayed()) {
                System.out.println("Найден iframe капчи Google");
                
                // Сначала пытаемся обработать капчу автоматически
                try {
                    // Попробуем кликнуть по кнопке "I'm not a robot"
                    WebElement checkbox = driver.findElement(By.xpath("//span[@class='recaptcha-checkbox']"));
                    if (checkbox != null) {
                        checkbox.click();
                        System.out.println("Кликнули на checkbox капчи");
                    }
                } catch (Exception e) {
                    System.out.println("Не удалось автоматически обработать капчу Google: " + e.getMessage());
                }
                
                // Ждем немного времени для обработки
                Thread.sleep(2000);
            }
        } catch (NoSuchElementException e) {
            System.out.println("iframe капчи Google не найден");
        }
        
        // Если капча все еще активна, ожидаем ручной ввод
        System.out.println("Пожалуйста, решите капчу вручную и продолжите выполнение теста...");
        Thread.sleep(10000); // Ждем 10 секунд для ручного решения капчи
    }
        
    }

