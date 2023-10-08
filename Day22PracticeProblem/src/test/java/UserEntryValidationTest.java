import org.junit.Test;


import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class UserEntryValidationTest {
    @Test
    public void testValidFirstName_Happy() {
        String firstName = "John";
        assertTrue(UserEntryValidation.isValidFirstName(firstName));
    }

    @Test
    public void testInvalidFirstName_Sad() {
        String firstName = "J"; // Less than 3 characters
        assertFalse(UserEntryValidation.isValidFirstName(firstName));
    }
}