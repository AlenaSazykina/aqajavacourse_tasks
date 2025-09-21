package org.example.IUTest.SeleniumWD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPobedaTestV1 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void testGoogleSearchAndLanguageSwitch() {
        try {
            // Открыть сайт google.com
            driver.get("https://www.google.com");
            
            // Ввести в строку поиска "Сайт компании Победа"
            WebElement searchBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("q"))
            );
            searchBox.clear();
            searchBox.sendKeys("Сайт компании Победа");
            
            // Нажать Enter
            searchBox.submit();
            
            // Дождаться результатов поиска
            
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
            
            // Кликнуть на первую ссылку (по URL)
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
