package my.company.tests;

import io.qameta.allure.junit4.DisplayName;
import my.company.steps.*;
import org.junit.Test;


import java.util.HashMap;

/**
 * Created by 777 on 07.05.2017.
 */
public class ExampleTest extends BaseSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    HealthInsuranceSteps healthInsuranceSteps = new HealthInsuranceSteps();
    DMSSteps dmsSteps = new DMSSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();

    HashMap<String, String> testData = new HashMap<>();


    @DisplayName("Заявка на ДМС")
    @Test
    public void Test(){
        testData.put("Имя","Иван");
        testData.put("Фамилия","Иванов");
        testData.put("Отчество","Иванович");
        testData.put("Регион","Москва");
        testData.put("Телефон","9191111112");
        testData.put("Эл. почта","teststststs");
        testData.put("Комментарии","Autotest");

        mainPageSteps.openMenu();
        mainPageSteps.selectMenuItem("Здоровье");
        healthInsuranceSteps.checkPageTitle("Страхование здоровья");
        healthInsuranceSteps.goToDMSPage();
        dmsSteps.checkPageTitle("добровольное медицинское страхование");
        dmsSteps.goToSendAppPage();
        sendAppSteps.checkPageTitle("Заявка на добровольное медицинское страхование");

        sendAppSteps.fillFields(testData);

        testData.put("Телефон","+7 (919) 111-11-12");
        sendAppSteps.checkFillFields(testData);
        sendAppSteps.checkErrorMessageField("Эл. почта", "Введите адрес электронной почты");
    }
}
