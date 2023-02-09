package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingUpPageServices {

    @Autowired
    private SingUpPageObjects singUpPageObjects;
    @Autowired
    private WebDriver driver;
    @Autowired
    WebDriverWait wait;
    public void go(String url){
        this.driver.get(url);
    }
    //** Metodo con el que llamamos la url de la pagina donde vamos a navegar **//
    //** Paso el parametro que me trae el constructor "Driver" y se lo asigno a cada variable mapeada
    //** Propiedad sendKeys(lastname) para texto, click() para seleccion **//
    public void writeFirstName(String firstname){
        this.wait.until(ExpectedConditions.visibilityOf(this.singUpPageObjects.getFirstNameTextbox())); // Esta linea valida el tiempo de espera para el primer elemento que se busca en la pagina
        this.singUpPageObjects.getFirstNameTextbox().sendKeys(firstname);
    }
    public void writeLastName(String lastname){
        this.singUpPageObjects.getLastname().sendKeys(lastname);
    }
    public void writeEmail(String email){
        this.singUpPageObjects.getEmailadress().sendKeys(email);
    }
    public void writePhone(String phone) {
        this.singUpPageObjects.getPhone().sendKeys(phone);
    }
    public void selectMale(){
        this.singUpPageObjects.getGenderMale().click();
    }
    public void selectFemale(){
        this.singUpPageObjects.getGenderFemale().click();
    }
    public void selectCounty(String country){ //** Cuando se selecionan listas
        new Select(this.singUpPageObjects.getCountry()).selectByValue(country);
    }
    public void selectDateOfBirtYear(String year){
        new Select(this.singUpPageObjects.getDateOfBirtYear()).selectByValue(year);
    }
    public void selectDateOfBirtMonth(String month){
        new Select(this.singUpPageObjects.getDateOfBirtMonth()).selectByValue(month);
    }
    public void selectDateOfBirtDay(String day){
        new Select(this.singUpPageObjects.getDateOfBirtDay()).selectByValue(day);
    }
    public void writePassword(String password){
        this.singUpPageObjects.getPassword().sendKeys(password);
    }
    public void writeConfirmPassword(String confirpassword){
        this.singUpPageObjects.getConfirmPassword().sendKeys(confirpassword);
    }
    public void clickSubmit(){
        this.singUpPageObjects.getSubmit().click();
    }
}
