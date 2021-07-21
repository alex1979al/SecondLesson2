package Steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.ya.PageFactory_ya_Market;

import java.util.List;

public class Steps {
    private WebDriver chromeDriver;

    public Steps(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }


    @Step("Перейти по ссылке {url}")
    public void goToURL(String url) {
        chromeDriver.get(url);
    }

    @Step("Кликнуть по элементу Каталог")
    public void clickInElement(PageFactory_ya_Market driver){
        driver.clickCatalog();
    }

    @Step("Кликнуть по элементу Компьютеры")
    public void clickInComputers(PageFactory_ya_Market driver){
        driver.clickComputers();
    }

    @Step("Кликнуть по элементу Видеокарты")
    public void clickInVideoCards(PageFactory_ya_Market driver){
        driver.clickVideoCards();
    }

    @Step("Кликнуть по строке поиска и ввести то, что ищем")
    public void clickInStringFind (String elementOfSearch, PageFactory_ya_Market driver){
        driver.clickStringSearch(elementOfSearch);
    }

    @Step("Кликнуть по кнопке Найти")
    public void clickInButtonFind (PageFactory_ya_Market driver){
        driver.clickBottomFind();
    }

    @Step("Кликнуть по кнопке Сортировка")
    public void clickSorted (PageFactory_ya_Market driver){
        driver.clickBottomSort();
    }

    @Step("вывод лист-списка видеокард")
    public void printResultFindCard (PageFactory_ya_Market driver){
        driver.testTest111();
    }

    @Step("вывод цены Карты GTX 1050ti")
    public void printFirstVideoCard (PageFactory_ya_Market driver){        driver.getPriceCard01();    }

    @Step("вывод цены Карты GTX 1050ti")
    public void printFirstVideoCard2(PageFactory_ya_Market driver){        driver.getPriceCard02();    }


}
