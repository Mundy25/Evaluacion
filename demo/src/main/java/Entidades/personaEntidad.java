package Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class personaEntidad {

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String apellido;

    private Integer edad;

    public personaEntidad() {
    }


}
