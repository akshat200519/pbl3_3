package com.example;

public class UserService {

    public void displayUserGreeting(String userId) {
        // Feature branch change: Add logging
        String user = findUserById(userId);
        System.out.println("INFO: Displaying greeting for user " + userId); // Added logging
        System.out.println("Hello, " + user + "!"); // Kept original greeting
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