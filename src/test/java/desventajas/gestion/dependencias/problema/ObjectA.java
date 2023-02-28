package desventajas.gestion.dependencias.problema;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ObjectA {

    private String id;
    private String name;

    public ObjectA(String id, String name) {
        setId(id);
        setName(name);
    }
}
