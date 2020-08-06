package sandbox.dao;

import javax.persistence.*;

@Entity
public class VariableInfo {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String variableName;

    @Enumerated(EnumType.STRING)
    private Types type;

    public Long getId() {
        return id;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VariableInfo{" +
                "id=" + id +
                ", variableName='" + variableName + '\'' +
                ", type=" + type +
                '}';
    }
}
