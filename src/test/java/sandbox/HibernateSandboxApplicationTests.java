package sandbox;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * To use the H2 console set a breakpoint in the test for the THREAD not the VM
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class HibernateSandboxApplicationTests {
    @Autowired
    Database database;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testDb() {
        database.addRow("TestData");
        database.addRow("TestData");
        database.addRow("TestData");
        database.addRow("TestData");

        database.showEntry(1L);
    }

}
