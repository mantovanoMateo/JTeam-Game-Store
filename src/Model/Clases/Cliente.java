package Model.Clases;

import Model.Enums.EJuegos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente extends Usuario{

    private Double saldo;
    private String nickName;
    private ArrayList<Juego> comprados;
    private ArrayList<Mensaje> mensajes;
    private ArrayList<MovimientoEconomico> extractoDeCuenta;

    public Cliente() {
        this.comprados = new ArrayList<>();
        this.mensajes = new ArrayList<>();
        this.extractoDeCuenta = new ArrayList<>();
        this.saldo=0.0;
    }

    public Cliente(String nombre, String apellido, String dni, String mail, String contrasena, Integer id, boolean activo, Double saldo, String nickName, ArrayList<Juego> comprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> extractoDeCuenta) {
        super(nombre, apellido, dni, mail, contrasena, id, activo);
        this.saldo = saldo;
        this.nickName = nickName;
        this.comprados = comprados;
        this.mensajes = mensajes;
        this.extractoDeCuenta = extractoDeCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNickName() {
        return nickName;
    }

    public ArrayList<Juego> getComprados() {
        return comprados;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public ArrayList<MovimientoEconomico> getExtractoDeCuenta() {
        return extractoDeCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setComprados(ArrayList<Juego> comprados) {
        this.comprados = comprados;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public void setExtractoDeCuenta(ArrayList<MovimientoEconomico> extractoDeCuenta) {
        this.extractoDeCuenta = extractoDeCuenta;
    }

    public void CargarSaldo(Double aCargar) {
        this.saldo+=aCargar;
    }

    public void agregarMovimientoEconomico(MovimientoEconomico nuevo){
        this.extractoDeCuenta.add(nuevo);
    }
    
    public Juego buscarPorNombre(String nombre){
        Juego busco=null;
        Boolean encuentra=false;
        int i=0;
        
        while(i<this.comprados.size() && encuentra == false){
            if(this.comprados.get(i).getNombre().equals(nombre)){
            encuentra=true;
            busco=comprados.get(i);
            }else{
                i++;
            }
        }
        return busco;
    }
    
        public String categoriaFavorita() {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> categoria = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();
        String cat="";

        if(comprados.size()==0){
            cat= EJuegos.AVENTURA.getCategoria();
        }else{
            for (Juego j : comprados) {
                if (map.containsKey(j.getCategoria())) {
                    map.put(j.getCategoria(), map.get(j.getCategoria()) + 1);
                } else {
                    map.put(j.getCategoria(), 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                categoria.add(entry.getKey());
                cantidad.add(entry.getValue());
            }
            Integer posMayor = 0;

            for (Integer i = 1; i < cantidad.size(); i++) {
                if (cantidad.get(i) > cantidad.get(posMayor)) {
                    posMayor = i;
                }
            }

            cat=categoria.get(posMayor);
        }

        return cat;
    }

    public void comprar(Pedido nuevo) {
        for (Juego juego : nuevo.getJuegos()) {
            this.getComprados().add(juego);
        }
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "saldo=" + saldo +
                ", nickName='" + nickName + '\'' +
                ", comprados=" + comprados +
                ", mensajes=" + mensajes +
                ", extractoDeCuenta=" + extractoDeCuenta +
                '}';
    }

}
