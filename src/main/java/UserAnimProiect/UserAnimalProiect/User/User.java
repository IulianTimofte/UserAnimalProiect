package UserAnimProiect.UserAnimalProiect.User;

import UserAnimProiect.UserAnimalProiect.Animal.Animal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String IdUser;
    private String FirstName;
    private String LastName;
    private String password;


    public User(String idUser, String firstName, String lastName, String password) {
        IdUser = idUser;
        FirstName = firstName;
        LastName = lastName;
        this.password = password;
    }




//private Animal animal;



    public User() {

    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String idUser) {
        IdUser = idUser;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
