package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question06_UserTest {

    @Test
    void shouldLoginWithCorrectPassword() {

        Question06_User user =
                new Question06_User(
                        "john",
                        "secret"
                );

        assertTrue(
                user.login("secret")
        );
    }

    @Test
    void shouldRejectIncorrectPassword() {

        Question06_User user =
                new Question06_User(
                        "john",
                        "secret"
                );

        assertFalse(
                user.login("wrong")
        );
    }

    @Test
    void shouldChangePassword() {

        Question06_User user =
                new Question06_User(
                        "john",
                        "secret"
                );

        assertTrue(
                user.changePassword(
                        "secret",
                        "newpass"
                )
        );

        assertTrue(
                user.login("newpass")
        );
    }

    @Test
    void shouldNotChangePasswordWithWrongOldPassword() {

        Question06_User user =
                new Question06_User(
                        "john",
                        "secret"
                );

        assertFalse(
                user.changePassword(
                        "incorrect",
                        "newpass"
                )
        );

        assertTrue(
                user.login("secret")
        );
    }

    @Test
    void shouldNotAcceptEmptyPassword() {

        Question06_User user =
                new Question06_User(
                        "john",
                        "secret"
                );

        assertFalse(
                user.changePassword(
                        "secret",
                        ""
                )
        );
    }

    @Test
    void shouldReturnUsername() {

        Question06_User user =
                new Question06_User(
                        "john",
                        "secret"
                );

        assertEquals(
                "john",
                user.getUsername()
        );
    }
}