package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ClaseBase;

public class HomePage extends ClaseBase {

    //CENTRALIZAR LOCALIZADOR
    By localizadorBtnPhone = By.xpath("//a[contains(text(),'Laptops')]");
    By localizadorBtnLaptop = By.xpath("//*[@id='tbodyid']/div[6]/div/div/h4/a");
    By localizadorBtnAddToCart = By.xpath("//*[@id='tbodyid']/div[2]/div/a");
    By localizadorBtnMonitor = By.xpath("//a[contains(text(),'Monitors')]");

    //Método que realicen las acciones del sitio
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void irAbtnPhone(){
        esperarPorElementoAClickear(localizadorBtnPhone);
        click(esperarPorElementoAClickear(localizadorBtnPhone));
    }
    public void irAbtnLaptop(){
        esperarPorElementoAClickear(localizadorBtnLaptop);
        click(esperarPorElementoAClickear(localizadorBtnLaptop));
    }
    public void irAbtnMonitor(){
        esperarPorElementoAClickear(localizadorBtnMonitor);
        click(esperarPorElementoAClickear(localizadorBtnMonitor));
    }
    public void addToCart(){
        esperarPorElementoAClickear(localizadorBtnAddToCart);
        click(esperarPorElementoAClickear(localizadorBtnAddToCart));
    }

    public String getNombre() {
        esperarXSegundos(5000);
        return obtenerAtributoAriaLabel((localizadorBtnPhone));
    }

    public void aceptarAlerta(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}
