/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import static org.openqa.selenium.By.xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author kamil
 */
public class MyAccountPage extends BasePage{
    
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//*[@id=\"my_account_form\"]/div[1]/input") WebElement btnSalvar;
    
    @FindBy(xpath = "//*[@id=\"sidebar\"]/p[3]/a") WebElement btnRedefineChaveAcesso; 
    
    @FindBy(id = "flash_notice") WebElement msgReconfiguradoSucesso;
    
     public MyAccountPage salvarAlteracoes() {
        btnSalvar.click();
        return this;
    }
     
     public MyAccountPage redefinirChave(){
         btnRedefineChaveAcesso.click();
         return this;
     }
     
     public String getMsgSucesso(){
         return msgReconfiguradoSucesso.getText().trim();
     }
    
}
