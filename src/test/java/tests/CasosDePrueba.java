package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AboutUSPage;
import pages.CartPage;
import pages.HomePage;
import utils.DataDriven;
import utils.PropertiesManager;

import java.util.ArrayList;

public class CasosDePrueba {

    //Atributos
    private WebDriver driver; //null
    private HomePage homePage;
    private CartPage cartPage; //null
    private AboutUSPage aboutUSPage;
    private String browser = PropertiesManager.obtenerProperty("browser");
    private String propertyDriver = PropertiesManager.obtenerProperty("propertyDriver");
    private String rutaDriver = PropertiesManager.obtenerProperty("rutaDriver");
    private String url = PropertiesManager.obtenerProperty("url");
    private ArrayList<String> datosPrueba; //null



    @BeforeEach
    public void preCondiciones(){

        datosPrueba = new ArrayList<String>(); //arreglo tamaño 0
        homePage = new HomePage(driver);
        homePage.conexionDriver(browser,rutaDriver,propertyDriver);
        homePage.manejoEsperasElementosWeb(10);
        cartPage = new CartPage(homePage.getDriver());
        aboutUSPage = new AboutUSPage(homePage.getDriver());
        homePage.cargarURL(url);
        homePage.maximizarBrowser();

    }


    @Test
    public void CP001_agregar_al_carro_laptop_macBookPro()  {
        homePage.irAbtnPhone();
        homePage.irAbtnLaptop();
        homePage.addToCart();
        homePage.aceptarAlerta();
        cartPage.irAbtnCarro();
        datosPrueba = DataDriven.prepararData("CP001_agregar_al_carro_laptop_macBookPro");
        String etiquetaCarro = driver.findElement(By.xpath("//*[@id='tbodyid']/tr/td[2]")).getText(); //*[@id="tbodyid"]/tr/td[2]
        Assertions.assertEquals(datosPrueba.get(1),etiquetaCarro);

    }

    @Test
    public void CP002_agregar_al_carro_appleMonitor24() {
        homePage.irAbtnPhone();
        homePage.irAbtnMonitor();
        homePage.aceptarAlerta();
        homePage.addToCart();
        cartPage.irAbtnCarro();
        datosPrueba = DataDriven.prepararData("CP002_agregar_al_carro_appleMonitor24");
        String etiquetacarro = driver.findElement(By.xpath("//*[@id='tbodyid']/tr/td[2]")).getText();
        Assertions.assertEquals(datosPrueba.get(1),etiquetacarro);

    }

    @Test
    public void CP003_agregar_al_carro_2monitores_diferentes() throws InterruptedException {
        homePage.irAbtnPhone();
        homePage.irAbtnMonitor();
        homePage.addToCart();

        Thread.sleep(2000);

        By localizadorBtnMonitor = By.xpath("//a[contains(text(),'Monitors')]");

        WebElement btnMonitor = driver.findElement(localizadorBtnMonitor);
        Thread.sleep(2000);
        btnMonitor.click();
        Thread.sleep(2000);

        By localizadorBtnMonitors = By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a");
        WebElement btnMonitors = driver.findElement(localizadorBtnMonitors);
        Thread.sleep(2000);
        btnMonitors.click();
        Thread.sleep(2000);

        By localizadorBtnAddToCart = By.xpath("//*[@id='tbodyid']/div[2]/div/a");
        WebElement btnAddToCart = driver.findElement(localizadorBtnAddToCart);
        Thread.sleep(2000);
        btnAddToCart.click();
        Thread.sleep(2000);

        Alert alert2 = driver.switchTo().alert(); // switch to alert
        Thread.sleep(5000);
        alert2.accept();


        By localizadorBtnHome = By.xpath("//*[@id='navbarExample']/ul/li[1]/a");//*[@id="navbarExample"]/ul/li[1]/a
        WebElement btnHome = driver.findElement(localizadorBtnHome);
        Thread.sleep(2000);
        btnHome.click();
        Thread.sleep(2000);

        By localizadorBtnMonitors2 = By.xpath("//a[contains(text(),'Monitors')]");
        WebElement btnMonitors2 = driver.findElement(localizadorBtnMonitors2);
        Thread.sleep(2000);
        btnMonitors2.click();
        Thread.sleep(2000);

        By localizadorBtnAddToCart2 = By.xpath("//a[contains(text(),'ASUS Full HD')]");
        WebElement btnAddToCart2 = driver.findElement(localizadorBtnAddToCart2);
        Thread.sleep(2000);
        btnAddToCart2.click();
        Thread.sleep(2000);

        By localizadorBtnAddToCart3 = By.xpath("//a[contains(text(),'Add to cart')]");
        WebElement btnAddToCart3 = driver.findElement(localizadorBtnAddToCart3);
        Thread.sleep(2000);
        btnAddToCart3.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert(); // switch to alert
        Thread.sleep(5000);
        alert.accept();

        By localizadorBtnCart = By.xpath("//*[@id='cartur']");
        WebElement btnCart = driver.findElement(localizadorBtnCart);
        Thread.sleep(2000);
        btnCart.click();
        Thread.sleep(5000);

        String etiquetacarro1 = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[2]")).getText();
        String etiquetacarro2 = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[2]/td[2]")).getText();
        String etiquetacarro = etiquetacarro1+etiquetacarro2;
        datosPrueba = DataDriven.prepararData("CP003_agregar_al_carro_2monitores_diferentes");
        Assertions.assertEquals(datosPrueba,etiquetacarro);

    }

    @Test
    public void CP004_vaciar_carro() throws InterruptedException {


        Thread.sleep(2000);

        By localizadorBtnMonitor = By.xpath("//a[contains(text(),'Monitors')]");

        WebElement btnMonitor = driver.findElement(localizadorBtnMonitor);
        Thread.sleep(2000);
        btnMonitor.click();
        Thread.sleep(2000);

        By localizadorBtnMonitors = By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a");
        WebElement btnMonitors = driver.findElement(localizadorBtnMonitors);
        Thread.sleep(2000);
        btnMonitors.click();
        Thread.sleep(2000);

        By localizadorBtnAddToCart = By.xpath("//*[@id='tbodyid']/div[2]/div/a");
        WebElement btnAddToCart = driver.findElement(localizadorBtnAddToCart);
        Thread.sleep(2000);
        btnAddToCart.click();
        Thread.sleep(2000);

        Alert alert2 = driver.switchTo().alert(); // switch to alert
        Thread.sleep(5000);
        alert2.accept();


        By localizadorBtnHome = By.xpath("//*[@id='navbarExample']/ul/li[1]/a");//*[@id="navbarExample"]/ul/li[1]/a
        WebElement btnHome = driver.findElement(localizadorBtnHome);
        Thread.sleep(2000);
        btnHome.click();
        Thread.sleep(2000);

        By localizadorBtnMonitors2 = By.xpath("//a[contains(text(),'Monitors')]");
        WebElement btnMonitors2 = driver.findElement(localizadorBtnMonitors2);
        Thread.sleep(2000);
        btnMonitors2.click();
        Thread.sleep(2000);

        By localizadorBtnAddToCart2 = By.xpath("//a[contains(text(),'ASUS Full HD')]");
        WebElement btnAddToCart2 = driver.findElement(localizadorBtnAddToCart2);
        Thread.sleep(2000);
        btnAddToCart2.click();
        Thread.sleep(2000);

        By localizadorBtnAddToCart3 = By.xpath("//a[contains(text(),'Add to cart')]");
        WebElement btnAddToCart3 = driver.findElement(localizadorBtnAddToCart3);
        Thread.sleep(2000);
        btnAddToCart3.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert(); // switch to alert
        Thread.sleep(5000);
        alert.accept();

        By localizadorBtnCart = By.xpath("//*[@id='cartur']");
        WebElement btnCart = driver.findElement(localizadorBtnCart);
        Thread.sleep(2000);
        btnCart.click();
        Thread.sleep(5000);

        String etiquetacarro3 = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[2]")).getText();
        boolean b = "ASUS Full HD"==etiquetacarro3;
        if (b = true) {
            By localizadorBtnDelete = By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/a");
            WebElement btnDelete = driver.findElement(localizadorBtnDelete);
            Thread.sleep(2000);
            btnDelete.click();
            Thread.sleep(5000);
        }

        String etiquetacarro4 = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[2]")).getText();
        boolean c = "Apple monitor 24"==etiquetacarro4;
        if (c = true) {
            By localizadorBtnDelete = By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/a");
            WebElement btnDelete = driver.findElement(localizadorBtnDelete);
            Thread.sleep(2000);
            btnDelete.click();
            Thread.sleep(5000);
        }

        String total = driver.findElement(By.xpath("//h3[contains(text(),'')]")).getText();
        datosPrueba = DataDriven.prepararData("CP004_vaciar_carro");
        Assertions.assertEquals(datosPrueba,total);
    }

    @Test
    public void CP005_seleccionar_aboutUs() throws InterruptedException {

        homePage.irAbtnPhone();
        aboutUSPage.irAbtnAboutUS();
        String texto = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/h5")).getText();
        datosPrueba = DataDriven.prepararData("CP005_seleccionar_aboutUs");
        Assertions.assertEquals(datosPrueba,texto);
    }

    @AfterEach
    public void posEjecucion(){
        homePage.cerrarBrowser();
    }

}
