package com.lorraine.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
