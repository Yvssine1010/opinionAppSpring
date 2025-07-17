package tech.yassine.sa_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;


// Cette classe est une entité JPA : elle sera automatiquement reliée à une table en base de données.
// Grâce à l'ORM (comme Hibernate), chaque objet de cette classe correspond à une ligne dans la table.
@Entity
@Table(name = "CLIENT")
public class Client {
    @Id//signifie que cette var est cle primaire
    @GeneratedValue(strategy = GenerationType.AUTO)//les val de cle primaire sont generer auto par la bd
    private int id;
    private String email;
    public Client() {
    }

    public Client(int id, String email) {
        this.id = id;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
