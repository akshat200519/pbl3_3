package com.example;

public class UserService {

    public void displayUserGreeting(String userId) {
        // Updated greeting logic on develop branch
        String user = findUserById(userId);
        System.out.println("Welcome back, " + user + "!"); // Changed "Hello" to "Welcome back"
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