package com.site.Prac.employeeDetails.exception;  // Or whichever package you decide to place it in

public class UnauthorizedAccessException extends RuntimeException {
    public UnauthorizedAccessException(String unauthorized_access) {
        super("You are not authorized to perform this action.");
    }
}
