package sandbox;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EntryA extends BaseEntry<String> {
    @Column(nullable = false, length = 255)
    private String dataContent;

    public EntryA() {

    }

    public EntryA(String dataContent) {
        super();
        this.dataContent = dataContent;
    }

    public String getDataContent() {
        return dataContent;
    }

    public void setDataContent(String dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public String toString() {
        return super.toString() +
                "EntryA{" +
                "dataContent='" + dataContent + '\'' +
                '}';
    }
}
