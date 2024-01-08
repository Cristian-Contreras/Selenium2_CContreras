package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ClaseBase;

public class AboutUSPage extends ClaseBase {

    //Centralizar Localizadores
    By localizadorBtnAboutUs = By.xpath("//*[@id='navbarExample']/ul/li[3]/a");

    //Funciones

    public AboutUSPage(WebDriver driver) {
        super(driver);
    }

    public void irAbtnAboutUS(){
        esperarPorElementoAClickear(localizadorBtnAboutUs);
        click(esperarPorElementoAClickear(localizadorBtnAboutUs));
    }

}
