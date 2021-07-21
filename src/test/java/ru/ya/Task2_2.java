package ru.ya;


import io.qameta.allure.Feature;
import Steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class Task2_2 extends WebDriverSettings  {

    private static Steps steps;

    @BeforeEach
    private void beforeEach() {

        steps = new Steps(chromeDriver);
    }

    @Feature("Тест ЯндексМаркета через Steps")
    @Test
    @DisplayName("Находим видеокарты и сравниваем через Steps")
    public void searchAndCompareCards(){
        steps.goToURL("https://market.yandex.ru/");

        PageFactory_ya_Market peremen = PageFactory.initElements(chromeDriver, PageFactory_ya_Market.class);
        steps.clickInElement(peremen);
        steps.clickInComputers(peremen);
        steps.clickInVideoCards(peremen);
        steps.clickInStringFind("GTX 1050ti",peremen);
        steps.clickInButtonFind(peremen);
        steps.clickSorted(peremen);
        steps.printFirstVideoCard(peremen);     //Получили самую низкую цену на видеокарту GTX 1050ti и печатаем в консоль
        Double FirstPrice1050Ti = peremen.getVideoCard1050();
        steps.clickInStringFind("RTX 3070",peremen);
        steps.clickInButtonFind(peremen);
        steps.clickSorted(peremen);
        steps.printFirstVideoCard2(peremen);    //Получили самую низкую цену на видеокарту RTX 3070 и печатаем в консоль
        Double FirstPrice3070 = peremen.getVideoCardRTX3070();
        Assertions.assertTrue(FirstPrice1050Ti < FirstPrice3070,"ВНИМАНИЕ!!! FirstPrice1050Ti дороже FirstPrice3070.");
    }

}
