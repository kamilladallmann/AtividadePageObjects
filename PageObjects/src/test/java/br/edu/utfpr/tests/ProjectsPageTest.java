/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.tests;

import br.edu.utfpr.po.LoginPage;
import br.edu.utfpr.po.ProjectsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author kamil
 */
public class ProjectsPageTest {
    
    private WebDriver driver;
    
    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }
    
    @Before
    public void before() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("lang=en-US");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
    }
    
    @After
    public void after() {
        driver.close();
    }    
    
    @Test
    public void test01Projects(){
      
       driver.get("http://demo.redmine.org/login");
        
        LoginPage loginPage = new LoginPage(driver);        
        loginPage.setUsuario("kamilladallmann").setSenha("kamidiva").login();
        
        ProjectsPage projectsPage = new ProjectsPage(driver);
        projectsPage.novoProjeto().setNomeProjeto("").setIdentificador("teste1").setPagProjeto("Página atual").criarProjeto();
        
        assertEquals("Nome não pode ficar vazio", projectsPage.getMsgErro());
    }
    
}
