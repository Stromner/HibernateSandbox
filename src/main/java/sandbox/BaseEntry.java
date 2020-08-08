package sandbox;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
