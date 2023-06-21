package Model.Clases;

import Model.Interfaces.ComportamientoUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Stack;

public class UsuarioPremium extends Cliente implements Serializable, ComportamientoUser {

    private String vencimientoDeSuscripcion;
    private ArrayList<Integer> valorados;

    public UsuarioPremium() {
        valorados=new ArrayList<>();
        vencimientoDeSuscripcion=LocalDate.now().plusDays(30).toString();
    }

    public UsuarioPremium(String nombre, String apellido, String dni, String mail,Integer id,Boolean activo, String contrasena, Double saldo, String nickName, ArrayList<Juego> comprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> extractoDeCuenta) {
        super(nombre,apellido,dni,mail,contrasena,id,activo,saldo,nickName,comprados,mensajes,extractoDeCuenta);
        valorados=new ArrayList<>();
        vencimientoDeSuscripcion=LocalDate.now().plusDays(30).toString();
    }

    public String getVencimientoDeSuscripcion() {
        return vencimientoDeSuscripcion;
    }

    public void setVencimientoDeSuscripcion(String vencimientoDeSuscripcion) {
        this.vencimientoDeSuscripcion = vencimientoDeSuscripcion;
    }

    public void pagarSuscripcion() {
        LocalDate fecha = LocalDate.parse(this.vencimientoDeSuscripcion);
        fecha.plusDays(30);
        this.vencimientoDeSuscripcion = fecha.toString();
    }

    public ArrayList<Integer> getValorados() {
        return valorados;
    }

    public void setValorados(ArrayList<Integer> valorados) {
        this.valorados = valorados;
    }

    @Override
    public Boolean jugar() {
        return true;
    }

}
