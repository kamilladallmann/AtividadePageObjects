/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author kamil
 */
public class ProjectsPage extends BasePage{
    
    public ProjectsPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/a[1]") WebElement btnNovoProjeto;

    @FindBy(id = "project_name") WebElement insertNomeProjeto;

    @FindBy(id = "project_identifier") WebElement insertIdentificador;
    
    @FindBy(id = "project_homepage") WebElement insertPagProjeto;

    @FindBy(xpath = "//*[@id=\"new_project\"]/input[3]") WebElement btnCriar;

    @FindBy(css = "#errorExplanation > ul > li") WebElement msgErroVazio;
    
    public ProjectsPage novoProjeto() {
        btnNovoProjeto.click();
        return this;
    }

    public ProjectsPage setNomeProjeto(String nomeProjeto) {
        insertNomeProjeto.sendKeys(nomeProjeto);
        return this;
    }

    public ProjectsPage setIdentificador(String identif) {
        insertIdentificador.sendKeys(identif);
        return this;
    }
    
    public ProjectsPage setPagProjeto(String pagProjeto) {
        insertPagProjeto.sendKeys(pagProjeto);
        return this;
    }

    public ProjectsPage criarProjeto() {
        btnCriar.click();
        return this;
    }

    public String getMsgErro() {
        return msgErroVazio.getText().trim();
    }
}
