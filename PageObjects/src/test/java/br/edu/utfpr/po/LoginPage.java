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
public class LoginPage extends BasePage{
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(id = "username") WebElement insertUsuario;
    
    @FindBy(id = "password") WebElement insertSenha;
    
    @FindBy(name = "login") WebElement btnLogin;
    
    @FindBy(id = "flash_error") WebElement errorMsgInvalido;
    
    @FindBy(id = "loggedas") WebElement usuarioLogado;
    
    public LoginPage setUsuario(String usuario){
        insertUsuario.clear();
        insertUsuario.sendKeys(usuario);
        return this;
    }
     
    public LoginPage setSenha(String senha){
        insertSenha.clear();
        insertSenha.sendKeys(senha);
        return this;
    }
    
    public LoginPage login(){
        btnLogin.click();
        return this;
    }
    
    public String getMsgInvalido(){
        return errorMsgInvalido.getText().trim();
    }
    
    public String getUsuarioLogado(){
        return usuarioLogado.getText().trim();
    }
    
}
