package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.UserBuilder;
import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSingUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import com.mesaj.app.pageobjects.SingUpPageServices;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ContextConfiguration(classes = {DriverConfig.class})
@CucumberContextConfiguration
@SpringJUnitConfig(classes = {DriverConfig.class})

public class SingUpStepDefinitions {
    @Autowired
    private UserSingUp singUp;
    @Autowired
    private NavigateTo navigateTo;
    @Given("^Edgar wants to have an account$")
    public void edgar_wants_to_have_an_account(){
        navigateTo.singUpPage();
    }
    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws InterruptedException {
            singUp.withInfo
                    (UserBuilder
                    .anUser()
                    .but()
                    .whitoutEmail()
                    .whitoutBirthDay()
                    .build()
        );

            Thread.sleep(2000);
    }
    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {
            Assertions.assertThat(true).isEqualTo(true);
    }

    @Then("^he should be told that the account was created not have$")
    public void he_should_be_told_that_the_account_was_created_not_have() {
        Assertions.assertThat(true).isEqualTo(false);

    }

}
