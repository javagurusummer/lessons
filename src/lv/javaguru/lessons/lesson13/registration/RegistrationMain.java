package lv.javaguru.lessons.lesson13.registration;

public class RegistrationMain {

    public static void main(String[] args) {
        Validator<Registration> validator = new RegistrationValidator();
        Registration registration = new Registration();
        registration.setEmail("email@email.com");
        registration.setName("name");
        registration.setPhone("2323232323");
        validator.validate(registration);
    }
}
