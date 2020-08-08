package sandbox;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EntryB extends BaseEntry<byte[]> {
    @Column(nullable = false, length = 255)
    private byte[] dataContent;

    public EntryB() {

    }

    public EntryB(byte[] dataContent) {
        super();
        this.dataContent = dataContent;
    }

    public byte[] getDataContent() {
        return dataContent;
    }

    public void setDataContent(byte[] dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public String toString() {
        return super.toString() +
                "EntryB{" +
                "dataContent=" + dataContent +
                '}';
    }
}
