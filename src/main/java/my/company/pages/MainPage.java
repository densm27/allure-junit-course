package my.company.pages;



import my.company.steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/**
 * Created by Maria on 29.04.2017.
 */
public class MainPage {


    @FindBy(xpath = "//ol[contains(@class,'rgs-menu pull-left')]//a[@data-toggle='dropdown']")
    public WebElement menuButton;

    @FindBy(xpath = "//ol[contains(@class,'rgs-menu pull-left')]//form")
    WebElement menuItems;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//a[normalize-space(.)='"+itemName+"'][@class='hidden-xs']")).click();
    }
}


