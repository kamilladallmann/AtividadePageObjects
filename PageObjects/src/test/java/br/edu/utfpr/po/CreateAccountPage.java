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
public class CreateAccountPage extends BasePage {
    
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(id = "user_login") WebElement insertUser;    
    
    @FindBy(id = "user_password") WebElement insertPassword;    
    
    @FindBy(id = "user_password_confirmation") WebElement insertPasswordAgain;    
    
    @FindBy(id = "user_firstname") WebElement insertFirstName;    
    
    @FindBy(id = "user_lastname") WebElement insertLastName;
     
    @FindBy(id = "user_mail") WebElement insertEmail;
    
    @FindBy(id = "user_language") WebElement insertLanguage;
    
    @FindBy(xpath = "//*[@id=\"new_user\"]/input[3]") WebElement btnCreateAccount;
    
    @FindBy(css = "#errorExplanation > ul > li") WebElement errorMsg;
    
    public CreateAccountPage setUser(String user){
        insertUser.clear();
        insertUser.sendKeys(user);
        return this;
    }
    
    public CreateAccountPage setPassword(String password){
        insertPassword.clear();
        insertPassword.sendKeys(password);
        return this;
    }
    
    public CreateAccountPage setPasswordAgain(String passwordAgain){
        insertPasswordAgain.clear();
        insertPasswordAgain.sendKeys(passwordAgain);
        return this;
    }
    
    public CreateAccountPage setFirstName(String firstName){
        insertFirstName.clear();
        insertFirstName.sendKeys(firstName);
        return this;
    }
    
    public CreateAccountPage setLastName(String lastName){
        insertLastName.clear();
        insertLastName.sendKeys(lastName);
        return this;
    }
    
    public CreateAccountPage setEmail(String email){
        insertEmail.clear();
        insertEmail.sendKeys(email);
        return this;
    }
    
    public CreateAccountPage setLanguage(String language){
        insertLanguage.clear();
        insertLanguage.sendKeys(language);
        return this;
    }
    
    public CreateAccountPage create(){
        btnCreateAccount.click();
        return this;
    }
    
    public String getMsgError(){
        return errorMsg.getText().trim();
    } 
        
}
