package com.Subscriber.model;

import javax.validation.constraints.Size;

public class SignUp {
    private String userName;
    @Size(min =  10,max =10,message = "Phone No. must have 10 digit")
    private String phoneNo;
    private String emailId;
    private String password;


}
