package com.automation.utils;

import com.github.javafaker.Faker;

public class TestData {

    private static final Faker faker = new Faker();
    private static String generatedEmail;
    private static String generatedPassword;

    public static void generateSignUpData() {
        generatedEmail = faker.internet().emailAddress();
        generatedPassword = faker.internet().password(8,12);
    }

    public static String getGeneratedEmail() {
        return generatedEmail;
    }
    public static String getGeneratedPassword() {
        return generatedPassword;
    }
}
