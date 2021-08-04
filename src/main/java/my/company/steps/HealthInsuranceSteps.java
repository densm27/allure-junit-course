package my.company.steps;

import io.qameta.allure.Step;
import my.company.pages.HealthInsurancePage;
import static org.junit.Assert.assertTrue;

/**
 * Created by Maria on 06.05.2017.
 */
public class HealthInsuranceSteps {

    @Step("выполнено нажатие на ДМС")
    public void goToDMSPage(){
        new HealthInsurancePage().dmsLink.click();
    }


    @Step("заголовок страницы равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new HealthInsurancePage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

}
