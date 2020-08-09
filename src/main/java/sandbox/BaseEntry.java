package sandbox;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public abstract class BaseEntry<E> {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    public BaseEntry() {

    }

    public Long getId() {
        return id;
    }

    public abstract E getDataContent();

    public abstract void setDataContent(E dataContent);

    @Override
    public String toString() {
        return "BaseEntry{" +
                "id=" + id +
                '}';
    }
}
