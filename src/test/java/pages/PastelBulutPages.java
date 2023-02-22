package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PastelBulutPages {

    @FindBy (xpath = "//div[@class='mhb-item mhb-button mhb-custom-gtY6im-7M']/a")
    public WebElement girisYapinButton;

    @FindBy (xpath = "(//input[@class='dx-texteditor-input'])[1]")
    public WebElement epostaGiris;

    @FindBy (xpath = "(//input[@class='dx-texteditor-input'])[2]")
    public WebElement parolaGiris;

    @FindBy (xpath = "(//div[@class='dx-button-content'])[1]")
    public WebElement girisButton;

    @FindBy (xpath = "//*[@class='dx-template-wrapper dx-item-content dx-list-item-content']")
    public WebElement kullanimPaketi;



    public PastelBulutPages() { PageFactory.initElements(Driver.getDriver(), this); }
}
