package com.comprehensive.assessment.controller;

public enum ErrorMessages {
	Doctor_already_exists_in_the_database("Doctor already exists in the database");
	   

    private  String ErrorMessages;

    ErrorMessages(String errorMessages) {
        this.ErrorMessages = errorMessages;
    }

    public String getErrorMessages() {
        return ErrorMessages;
    }

    public void setErrorMessages(String errorMessages) {
        ErrorMessages = errorMessages;
    }
}
