package sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sandbox.dao.VariableInfo;

import javax.persistence.EntityManager;

@Component
public class Database {
    private static final Logger log = LoggerFactory.getLogger(Database.class);
    @Autowired
    EntityManager entityManager;

    @Transactional
    public void addRow(String name) {
        VariableInfo variableInfo = new VariableInfo();
        variableInfo.setVariableName(name);
        entityManager.persist(variableInfo);
        entityManager.flush();
    }

    public void showEntry(Long entryId) {
        VariableInfo entry = entityManager.find(VariableInfo.class, entryId);
        log.info("Entity={}", entry.toString());
    }
}
