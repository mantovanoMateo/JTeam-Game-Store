package Model.Clases;

import java.io.Serializable;
import java.time.LocalDate;

public class Admin extends Usuario implements Serializable {

    public Admin() {
    }

    public Admin(String nombre, String apellido, String dni, String mail, String contrasena) {
        super(nombre, apellido, dni, mail, contrasena);
    }

    @Override
    public String toString() {
        return "Admin{" +
                '}';
    }

}
