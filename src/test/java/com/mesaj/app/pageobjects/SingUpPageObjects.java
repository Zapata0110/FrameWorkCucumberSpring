package com.mesaj.app.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter //** Con este parametro automaticamente trae todos los valores geters de cada uno de los elementos **//
public class SingUpPageObjects extends PageBase{

    @Autowired
    //** Se Crea el constructor o dependencia, esta es la clase que recibe el parametro para poder usar uno de los objetos **//
    public SingUpPageObjects(WebDriver driver){
        super(driver);
    }

    // ** Mapeo de los objetos de la pagina **//

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastname;

    @FindBy (xpath = "//input[@type='email']" )
    private  WebElement emailadress;

    @FindBy (xpath = "//input[@type='tel']" )
    private WebElement phone;

    @FindBy (xpath = "//input[@value='Male']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement genderFemale;

    @FindBy (id = "countries")
    private WebElement country;

    @FindBy (id = "yearbox")
    private WebElement dateOfBirtYear;

    @FindBy (xpath ="//select[@ng-model='monthbox']" )
    private WebElement dateOfBirtMonth;

    @FindBy (id = "daybox")
    private WebElement dateOfBirtDay;

    @FindBy (id ="firstpassword" )
    private WebElement password;

    @FindBy (id = "secondpassword")
    private WebElement confirmPassword;

    @FindBy (id = "submitbtn")
    private WebElement submit;


}
