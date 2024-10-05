package org.iesvdm.Test;

import org.iesvdm.ejercicios.onlineShopping.enums.UserState;
import org.iesvdm.ejercicios.onlineShopping.model.WebUser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WebUserTest {

    @Test
    void activate_newUser() {
        WebUser user = new WebUser("user1", "password1");
        user.activate();
        assertEquals(UserState.ACTIVE, user.getState());
    }

    @Test
    void activate_alreadyActiveUser() {
        WebUser user = new WebUser("user1", "password1");
        user.setState(UserState.ACTIVE);
        user.activate();
        assertEquals(UserState.ACTIVE, user.getState());
    }

    @Test
    void checkPassword_correctPassword() {
        WebUser user = new WebUser("user1", "password1");
        assertTrue(user.checkPassword("password1"));
    }

    @Test
    void checkPassword_incorrectPassword() {
        WebUser user = new WebUser("user1", "password1");
        assertFalse(user.checkPassword("wrongpassword"));
    }

    @Test
    void setLogin_id_updatesLoginId() {
        WebUser user = new WebUser("user1", "password1");
        user.setLogin_id("newUser1");
        assertEquals("newUser1", user.getLogin_id());
    }

    @Test
    void setPassword_updatesPassword() {
        WebUser user = new WebUser("user1", "password1");
        user.setPassword("newPassword1");
        assertTrue(user.checkPassword("newPassword1"));
    }

    @Test
    void setState_updatesState() {
        WebUser user = new WebUser("user1", "password1");
        user.setState(UserState.ACTIVE);
        assertEquals(UserState.ACTIVE, user.getState());
    }
}