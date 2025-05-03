package com.example;

public class UserService {

    public void displayUserGreeting(String userId) {
        // Initial greeting logic
        String user = findUserById(userId);
        System.out.println("Hello, " + user + "!");
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