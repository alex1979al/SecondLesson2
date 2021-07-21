package ru.ya;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PageFactory_ya_Market {

    private WebDriver chromeDriver;

    @FindBy(how = How.XPATH, xpath = ("//*[@class = \"_2AMPZ4ui7z _3CFK95wJ78 _2VvV8S1kVc _3WgR56k47x\"]"))
    WebElement bottomCatalog;       // Кнопка Каталог

    @FindBy(how = How.XPATH, xpath = ("//*[@class = \"_2qe4z4MvOs\" and @alt= \"Компьютеры\"]"))
    WebElement bottomComputers;       // Кнопка Компьютеры


    @FindBy(how = How.XPATH, xpath = ("//*[@class = \"_3VMnEHDoVX\"]//*[@href = \"/catalog--videokarty-v-penze/55314/list?hid=91031\"]"))
    WebElement bottomVideoCards;       // Кнопка Видеокарты

    @FindBy(how = How.XPATH, xpath = ("//*[@class = \"G4KLqAT1vi\"]/*[@id = \"header-search\"]"))
    WebElement stringSearch;       // Строка Искать товары

    @FindBy(how = How.XPATH, xpath = ("//*[@class = \"_2OGFhta13M\"]"))
    WebElement bottomFind;              // Кнопка Найти

    @FindBy(how = How.XPATH, xpath = ("//*[@class = \"_2zH77vazcW _3tIaiy1WMf\"]"))
    WebElement bottomSorted;            // Кнопка Сортировка

    @FindAll(@FindBy(how = How.XPATH,xpath = ("//*[contains(@title,\"GTX 1050 Ti\")]")))
    List<WebElement> resultSearchViCard;    // Лист результатов поиска

    @FindBy(how = How.XPATH, xpath = ("(//*[contains(@title,\"GTX 1050 Ti\")])[1]/../../..//*[@class=\"_3NaXxl-HYN _3f2ZtYT7NH _1f_YBwo4nE\"]"))
    WebElement ResultPriceCard;             //Первая цена в руб. из найденого отсортированного списка GTX 1050 Ti

    @FindBy(how = How.XPATH, xpath = ("(//*[contains(@title,\"RTX 3070 \")])[1]/../../..//*[@data-autotest-currency = \"₽\"]"))
    WebElement ResultPriceCard2;             //Первая цена в руб. из найденого отсортированного списка RTX 3070


    public WebElement getBottomComputers() {
        return bottomComputers;
    }

    public WebElement getBottomCatalog() {
        return bottomCatalog;
    }

    public static boolean isVisible (WebElement element) {
        return element.isDisplayed();
    }

    public void PageFactory_ya_Market (WebDriver driver){this.chromeDriver = driver;}

    public void testTest111(){
        resultSearchViCard.stream().forEach(x -> System.out.println(x.getText()));
    }

    public void clickCatalog(){        bottomCatalog.click();    }          // Клик по кнопке Каталог

    public void clickComputers(){        bottomComputers.click();    }      // Клик по элементу Компьютеры

    public void clickVideoCards(){        bottomVideoCards.click();    }    // Клик по элементу Видеокарты

    public void clickBottomFind(){
        bottomFind.click();                 // Клик по кнопке Найти
        //stringSearch.getText().replaceAll("GTX 1050ti", ""); // Очищаем поле поиска
    }

    public void clickStringSearch(String nameObejctOfSearch){
        stringSearch.click();
        stringSearch.sendKeys(nameObejctOfSearch);
        //stringSearch.getText().replaceAll(nameObejctOfSearch, "");

    }

    public void clickBottomSort(){
        bottomSorted.click();                       // Клик по элементу Сортировка
        stringSearch.sendKeys("\b\b\b\b\b\b\b\b\b\b\b");    // Удаляем текст из поля Найти
    }

    public void getPriceCard01(){
        String PriceCard01 = ResultPriceCard.getText().replace(" ₽","");
        Double PriceCard0101 = Double.parseDouble (PriceCard01.replace(" ",""));
        System.out.println(PriceCard0101);
    }
    public Double getVideoCard1050() {
        String PriceCard01 = ResultPriceCard.getText().replace(" ₽","");
        Double PriceCard1050 = Double.parseDouble (PriceCard01.replace(" ",""));
    return PriceCard1050;
    }

    public void getPriceCard02() {
        String PriceCard02 = ResultPriceCard2.getText().replace(" ₽","");
        Double PriceCard0202 = Double.parseDouble (PriceCard02.replace(" ",""));
        System.out.println(PriceCard0202);
    }

    public Double getVideoCardRTX3070() {
        String PriceCard02 = ResultPriceCard2.getText().replace(" ₽","");
        Double PriceCard3070 = Double.parseDouble (PriceCard02.replace(" ",""));
    return PriceCard3070;
    }

    public void separeCards(){
        Assertions.assertTrue(50 < 100,"ВНИМАНИЕ! Этот текст не должен выводиться!");
        System.out.println("Самая дешовая видеокарта GTX 1050ti стоит меньше самой дешовой RTX 3070");
    }


}
