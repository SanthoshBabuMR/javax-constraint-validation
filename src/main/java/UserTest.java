import javax.validation.*;
import java.util.Set;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<User>> s = validator.validate(user);
        System.out.println("Output::");
        for(ConstraintViolation cv: s) {
            System.out.println(cv.getInvalidValue() + ": " +cv.getMessage());
        }
    }
}
