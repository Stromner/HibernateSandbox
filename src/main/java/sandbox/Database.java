package sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sandbox.dao.Types;
import sandbox.dao.UTf8Variable;
import sandbox.dao.VariableInfo;

import javax.persistence.EntityManager;

@Component
public class Database {
    private static final Logger log = LoggerFactory.getLogger(Database.class);
    @Autowired
    EntityManager entityManager;

    @Transactional
    public void addStringRow(String name, String dataContent) {
        VariableInfo base = new VariableInfo();
        base.setVariableName(name);
        base.setType(Types.STRING);

        UTf8Variable sBase = new UTf8Variable();
        sBase.setDataContent(dataContent);
        sBase.setVariableInfo(base);

        entityManager.persist(base);
        entityManager.persist(sBase);
        entityManager.flush();
    }

    public void showStringEntry(Long entryId) {
        VariableInfo entry = entityManager.find(VariableInfo.class, entryId);
        UTf8Variable sEntry = entityManager.find(UTf8Variable.class, entryId);
        log.info("Entity={}", entry.toString());
        log.info("String description={}", sEntry.toString());
    }
}
