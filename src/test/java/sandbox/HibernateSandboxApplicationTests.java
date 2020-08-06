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
        database.addStringRow("TestData1", "Description1");
        database.addStringRow("TestData2", "Description2");
        database.addStringRow("TestData3", "Description3");

        database.showStringEntry(1L);
        database.showStringEntry(2L);
        database.showStringEntry(3L);
    }

}
