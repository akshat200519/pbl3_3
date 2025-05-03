package com.example;

public class UserService {

    public void displayUserGreeting(String userId) {
        // Combined changes: Logging from feature, updated greeting from develop
        String user = findUserById(userId);
        System.out.println("INFO: Displaying greeting for user " + userId); // Kept logging
        System.out.println("Welcome back, " + user + "!"); // Kept updated greeting
    }
    
    private String findUserById(String userId) {
        // Dummy implementation
        return "User_" + userId;
    }

    // Main method for simple execution (optional)
    public static void main(String[] args) {
        UserService service = new UserService();
        service.displayUserGreeting("123");
    }
}