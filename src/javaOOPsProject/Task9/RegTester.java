package javaOOPsProject.Task9;

public class RegTester {
    public static void main(String[] args) {

        Task9_Registration registration = new Task9_Registration();
        registration.setEmail("alexey.r@yahoo.com");
        registration.setUserName("AlexRNew");
        registration.setPassword("pass123456$");

        registration.Email();
        registration.userName();
        registration.password();


    }
}
