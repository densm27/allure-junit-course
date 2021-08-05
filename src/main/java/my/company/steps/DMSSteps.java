package my.company.steps;



import io.qameta.allure.Step;
import my.company.pages.DMSPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertTrue;

/**
 * Created by Maria on 06.05.2017.
 */
public class DMSSteps {

    @Step("выполнено нажатие на Отправить заявку")
    public void goToSendAppPage(){
        new DMSPage().sendAppBtn.click();
    }


    @Step("заголовок страницы равен {0}")
    public void checkPageTitle(String expectedTitle){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(),5);
        String actualTitle =wait.until(ExpectedConditions.visibilityOf(new DMSPage().title)).getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

}
