package ejemploprueba1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CP {

    //Atributos
    WebDriver driver;
    JavascriptExecutor js;



    @BeforeEach
    public void preCondiciones(){

        String rutaProyecto = System.getProperty("user.dir"); //no es de la prueba

        String rutaDriver = rutaProyecto + "\\src\\test\\resources\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", rutaDriver);
        driver = new ChromeDriver();

        js = (JavascriptExecutor) driver;

        driver.get("https://www.demoblaze.com/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

    }


    @AfterEach
    public void postCondiciones(){
    driver.quit();


    }

    @Test
    public void cp001AgregarAlCarroLaptopMacBookPro() throws InterruptedException {

        Thread.sleep(2000);

        //By localizadorBtnPhone = By.xpath("//a[@onclick=\'byCat('phone')']");
        By localizadorBtnPhone = By.xpath("//a[contains(text(),'Laptops')]");

        //Elemento Web (Botón, txt, dropDownList, label, link, etc)
        WebElement btnPhone = driver.findElement(localizadorBtnPhone);
        Thread.sleep(2000);
        btnPhone.click();
        Thread.sleep(2000);

        By localizadorBtnLaptop = By.xpath("//*[@id='tbodyid']/div[6]/div/div/h4/a");
        WebElement btnLaptop = driver.findElement(localizadorBtnLaptop);
        Thread.sleep(2000);
        btnLaptop.click();
        Thread.sleep(2000);

        By localizadorBtnAddToCart = By.xpath("//*[@id='tbodyid']/div[2]/div/a");
        WebElement btnAddToCart = driver.findElement(localizadorBtnAddToCart);
        Thread.sleep(2000);
        btnAddToCart.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert(); // switch to alert
        //String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        //System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();

        By localizadorBtnCart = By.xpath("//*[@id='cartur']");
        WebElement btnCart = driver.findElement(localizadorBtnCart);
        Thread.sleep(2000);
        btnCart.click();
        Thread.sleep(5000);

        String etiquetacarro = driver.findElement(By.xpath("//*[@id='tbodyid']/tr/td[2]")).getText(); //*[@id="tbodyid"]/tr/td[2]

        Assertions.assertEquals("MacBook Pro",etiquetacarro);

    }

    @Test
    public void cp002AgregarAlCarroAppleMonitor24() throws InterruptedException {

        Thread.sleep(2000);

        //By localizadorBtnPhone = By.xpath("//a[@onclick=\'byCat('phone')']");
        By localizadorBtnMonitor = By.xpath("//a[contains(text(),'Monitors')]");

        //Elemento Web (Botón, txt, dropDownList, label, link, etc)
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

        Alert alert = driver.switchTo().alert(); // switch to alert
        //String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        //System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();

        By localizadorBtnCart = By.xpath("//*[@id='cartur']");
        WebElement btnCart = driver.findElement(localizadorBtnCart);
        Thread.sleep(2000);
        btnCart.click();
        Thread.sleep(5000);

        String etiquetacarro = driver.findElement(By.xpath("//*[@id='tbodyid']/tr/td[2]")).getText();

        Assertions.assertEquals("Apple monitor 24",etiquetacarro);

    }

    @Test
    public void cp003AgregarAlCarro2MonitoresDiferentes() throws InterruptedException {


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
        //String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        //System.out.println(alertMessage); // Print Alert Message
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
        Assertions.assertEquals("ASUS Full HDApple monitor 24",etiquetacarro);

    }

    @Test
    public void cp004VaciarCarro() throws InterruptedException {


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
        //String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        //System.out.println(alertMessage); // Print Alert Message
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
        Assertions.assertEquals("",total);
    }

    @Test
    public void cp005SeleccionarAboutUs() throws InterruptedException {


        Thread.sleep(2000);

        By localizadorBtnAboutUs = By.xpath("//*[@id='navbarExample']/ul/li[3]/a");
        WebElement btnAboutUs = driver.findElement(localizadorBtnAboutUs);
        Thread.sleep(2000);
        btnAboutUs.click();
        Thread.sleep(2000);

        String texto = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/h5")).getText();
        Assertions.assertEquals("About us",texto);
    }

}
