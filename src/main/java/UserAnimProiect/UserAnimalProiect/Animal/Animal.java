package UserAnimProiect.UserAnimalProiect.Animal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    private String IdAnimal;
    private String name;
    private String type;


    public Animal(String idAnimal, String name, String type) {
        IdAnimal = idAnimal;
        this.name = name;
        this.type = type;
    }

    public Animal() {

    }

    public String getIdAnimal() {
        return IdAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        IdAnimal = idAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
