package sandbox;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public abstract class BaseEntry {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    public BaseEntry() {

    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BaseEntry{" +
                "id=" + id +
                '}';
    }
}
