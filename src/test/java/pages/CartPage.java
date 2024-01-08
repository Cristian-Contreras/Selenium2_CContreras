package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ClaseBase;

public class CartPage extends ClaseBase {
    //Centralizar los By
    By localizadorBtnCart = By.xpath("//*[@id='cartur']");
    By etCarro = By.xpath("//*[@id='tbodyid']/tr/td[2]");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    //Acciones

    public void irAbtnCarro(){
        esperarPorElementoAClickear(localizadorBtnCart);
        click(esperarPorElementoAClickear(localizadorBtnCart));
    }

    public void obtenerEtiquetaCarro(){
        String etiquetacarro = obtenerAtributoAriaLabel(etCarro);
    }

    public String obtenerMensajeErrorLogin(){
        return "";
    }
}
