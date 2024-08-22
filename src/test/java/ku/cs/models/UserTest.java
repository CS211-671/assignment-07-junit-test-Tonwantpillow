package ku.cs.models;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    public void testSetPassword(){
        User user = new User("user01", "12455");
        user.setPassword("123");
        assertEquals(true, user.validatePassword("123"));
    }

    @Test
    public void testValidatePassword(){
        User user = new User("user01", "1234");
        assertEquals(true, user.validatePassword("1234"));
    }

    @Test
    public void testIsUsername(){
        User user = new User("user01", "1234");
        boolean actual = user.isUsername("user01");
        assertTrue(actual);
    }
}