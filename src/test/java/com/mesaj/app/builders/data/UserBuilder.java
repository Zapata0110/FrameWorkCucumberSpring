package com.mesaj.app.builders.data;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.models.User;

public class UserBuilder {

private User user;
private UserBuilder(){ // Video 17 Explicacion
    user = User.builder().build();}
public static UserBuilder anUser(){
    return new UserBuilder();
}

    public UserBuilder but(){
        return whitDefaultInfo();
    }
    public UserBuilder whitDefaultInfo(){
    this.user = User.builder()
            .firstName("Edgar")
            .lastName("Zapata")
            .email("prueba@prueba.com")
            .phone("7456784594")
            .gender(Gender.female)
            //.country("colombia")
            .birthDay("10")
            .birthaMonth("June")
            .birthYear("1990")
            .password("Prueba123*")
            .passwordConfirmation("Prueba123*").build();
    return this;
    }

    public UserBuilder whitoutEmail(){
        user.setEmail("");
        return this;
    }
    public UserBuilder whitoutBirthDay(){
        user.setBirthDay("");
        return this;
    }

    public User build(){
        return this.user;
    }

}
