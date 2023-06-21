package Model.Clases;

import Model.Interfaces.ComportamientoUser;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class UserBasico extends Cliente implements Serializable , ComportamientoUser {
    @JsonIgnore private Integer cantDePartidas = 0;

    public UserBasico() {
    }

    public UserBasico(String nombre, String apellido, String dni, String mail, String contrasena, Integer id, boolean activo, Double saldo, String nickName, ArrayList<Juego> comprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> extractoDeCuenta, Integer cantDePartidas) {
        super(nombre, apellido, dni, mail, contrasena, id, activo, saldo, nickName, comprados, mensajes, extractoDeCuenta);
        this.cantDePartidas = cantDePartidas;
    }

    public Integer getCantDePartidas() {
        return cantDePartidas;
    }

    public void setCantDePartidas(Integer cantDePartidas) {
        this.cantDePartidas = cantDePartidas;
    }

    public Boolean jugar(){
        Boolean jugar=true;
        if (cantDePartidas<5){
            cantDePartidas++;
        }else {
            JOptionPane.showMessageDialog(null,"Limite de partidas diarias superado, regrese mañana o hagase premium");
            jugar=false;
        }
        return jugar;
    }


}
