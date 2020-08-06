package sandbox.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VariableInfo {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String variableName;

    public Long getId() {
        return id;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return "VariableInfo{" +
                "id=" + id +
                ", variableName='" + variableName + '\'' +
                '}';
    }
}
