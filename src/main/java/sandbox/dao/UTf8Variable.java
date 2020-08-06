package sandbox.dao;

import javax.persistence.*;

@Entity
public class UTf8Variable {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn
    @MapsId
    private VariableInfo variableInfo;

    private String dataContent;

    public VariableInfo getVariableInfo() {
        return variableInfo;
    }

    public void setVariableInfo(VariableInfo variableInfo) {
        this.variableInfo = variableInfo;
    }

    public String getDataContent() {
        return dataContent;
    }

    public void setDataContent(String dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public String toString() {
        return "StringVariableInfo{" +
                "id=" + id +
                ", variableInfo=" + variableInfo +
                ", dataContent='" + dataContent + '\'' +
                '}';
    }
}
