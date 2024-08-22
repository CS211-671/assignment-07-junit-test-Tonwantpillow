package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList group1 = new UserList();
        group1.addUser("Tonnam", "12345");
        group1.addUser("TonnamLek", "5678");
        group1.addUser("TonnamYai", "44444");
        // TODO: find one of them
        // TODO: assert that UserList found User
        assertEquals("TonnamLek", group1.findUserByUsername("TonnamLek").getUsername());
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList group1 = new UserList();
        group1.addUser("Tonnam", "12345");
        group1.addUser("TonnamLek", "5678");
        group1.addUser("TonnamYai", "44444");

        // TODO: change password of one user
        boolean actual = group1.changePassword("TonnamLek", "5678", "9999");


        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}