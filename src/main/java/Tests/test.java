package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {
        // Configura la ruta del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juanf\\Documents\\DecimoSemestre-Documentos-ICESI\\calidad-sw\\InstallationProject\\Project\\SeleniumTestProject\\src\\main\\resources\\drivers\\chromedriver.exe");

        // Inicializa el navegador
        WebDriver driver = new ChromeDriver();

        // Abre Facebook
        driver.get("http://www.facebook.com");

        // Maximiza la ventana del navegador
        driver.manage().window().maximize();

        // Espera 3 segundos para observar la página abierta (opcional pero útil para evitar errores de cierre)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cierra completamente el navegador
        driver.quit();
    }
}
