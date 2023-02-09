package com.mesaj.app.tasks;


import com.mesaj.app.enums.Gender;
import com.mesaj.app.models.User;
import com.mesaj.app.pageobjects.SingUpPageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSingUp {
    @Autowired
    private SingUpPageServices singUp;

    public void withInfo(User user){

        singUp.writeFirstName(user.getFirstName());
        singUp.writeLastName(user.getLastName());
        singUp.writeEmail(user.getEmail());
        singUp.writePhone(user.getPhone());

        if (user.getGender()== Gender.female){
            singUp.selectFemale();
        }else {
            singUp.selectMale();
        }

        //singUpPageServices.selectCounty("Japan");
        singUp.selectDateOfBirtYear(user.getBirthYear());
        singUp.selectDateOfBirtMonth(user.getBirthaMonth());
        singUp.selectDateOfBirtDay(user.getBirthDay());
        singUp.writePassword(user.getPassword());
        singUp.writeConfirmPassword(user.getPasswordConfirmation());

        //singUp.clickSubmit();

    }
}
