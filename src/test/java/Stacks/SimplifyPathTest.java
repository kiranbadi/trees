package Stacks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {

    private SimplifyPath simplifyPath;

    @BeforeEach
    void setUp() {
        simplifyPath = new SimplifyPath();
    }

    @AfterEach
    void tearDown() {
        simplifyPath = null;
    }

    @Test
    void simplifyPath() {
        Assertions.assertEquals("/home", simplifyPath.simplifyPath("/home/"));
        Assertions.assertEquals("/home/foo", simplifyPath.simplifyPath("/home//foo/"));
        Assertions.assertEquals("/home/user/Pictures", simplifyPath.simplifyPath("/home/user/Documents/../Pictures"));
        Assertions.assertEquals("/", simplifyPath.simplifyPath("/../"));
        Assertions.assertEquals("/.../b/d", simplifyPath.simplifyPath("/.../a/../b/c/../d/./"));
    }
}