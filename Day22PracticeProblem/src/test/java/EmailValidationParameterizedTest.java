import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidationParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "sample1@example.com, true",  // Valid email
            "invalid_email, false",      // Invalid format
            "user@, false",              // Incomplete domain
            "user@example, false"        // Incomplete top-level domain
    })
    public void testEmailValidation(String email, boolean expected) {
        boolean isValid = UserEntryValidation.isValidEmail(email);
        assertEquals(expected, isValid);
    }
}