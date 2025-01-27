package com.solid;
/*
*  S- A class should have to only one reason to change i.e It should have
*  only one responsibility
* */
 class User {
    private String name;
    private String email;
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public void saveUser(){
        System.out.println("User saved to database.");
    }
    public void sendEmail(String email, String message){
        System.out.println("Email send to "+ email + " with message: "+ message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

/* Based On Solid principles it becomes */
class Users {
    private String name;
    private String email;

    public Users(String name, String email) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
    class UserRepository {
        public void saveUser(Users user){
            System.out.println("User "+ user.getName()+ " saved to database.");
        }
    }
    class EmailService {
        public void sendEmail(Users user, String message){
            System.out.println("Email sent to "+ user.getEmail()+ " with message: "+ message);
        }
    }

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        Users user = new Users("Ganesh", "contect.ganesh123@example.com");
        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(user);
        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "Welcome");
    }
}
