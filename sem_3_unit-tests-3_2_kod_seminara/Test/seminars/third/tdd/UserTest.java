package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.coverage.SomeService;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    private User user;

    @BeforeEach
    void setUp() { user = new User(); }

    @Test
    void testAuthenticatePositive() {
        assertThat(user.authenticate("admin", "admin")).isTrue();
    }

    @Test
    void testAuthenticateNegative() {
        assertThat(user.authenticate("name", "password")).isFalse();
    }

    @Test
    void testAddUser() {
        assertThat()
    }

}