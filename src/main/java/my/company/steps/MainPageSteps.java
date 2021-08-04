package my.company.steps;



import io.qameta.allure.Step;
import my.company.pages.MainPage;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainPageSteps {



    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }

    @Step("открыто меню сайта")
    public void openMenu(){
        new MainPage().menuButton.click();
    }

}
