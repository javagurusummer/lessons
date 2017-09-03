package lv.javaguru.lessons.lesson13.registration;

public class RegistrationValidator implements Validator<Registration> {

    @Override
    public void validate(Registration target) {
        Assert.notNull(target, "target");
        Assert.notEmpty(target.getName(), "name");
        Assert.notEmpty(target.getEmail(), "email");
        Assert.notEmpty(target.getPhone(), "phone");
    }
}
