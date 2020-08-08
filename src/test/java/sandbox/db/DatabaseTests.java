package sandbox.db;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.DirtiesContext;
import sandbox.EntryA;
import sandbox.IEntryRepository;

/**
 * To use the H2 console set a breakpoint in the test for the THREAD not the VM
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@PropertySource("classpath::application.properties")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class DatabaseTests {
    private static final Logger log = LoggerFactory.getLogger(DatabaseTests.class);
    @Autowired
    private IEntryRepository repository;

    @Test
    public void testDb() {
        EntryA entry = new EntryA("testData");
        repository.saveAndFlush(entry);

        EntryA result = (EntryA) repository.findById(1L).get();
        log.info(result.getDataContent());
    }
}
