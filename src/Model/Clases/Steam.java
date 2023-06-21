package Model.Clases;

import Model.Enums.EJuegos;

import java.io.Serializable;
import java.util.*;

public class Steam implements Serializable {
    private ArrayList<Juego> juegos;
    private HashMap<String, UsuarioPremium> usuariosPremium;
    private HashMap<String, UserBasico> usersBasicos;
    private LinkedList<Admin> usuariosAdmins;
    private ArrayList<Pedido> pedidos;

    public Steam() {
        juegos = new ArrayList<>();
        usuariosPremium = new HashMap<>();
        usersBasicos=new HashMap<>();
        usuariosAdmins = new LinkedList<>();
        pedidos = new ArrayList<>();
    }

    //region Manejo de Juegos
    public void agregarJuego(Juego nuevo) {
        juegos.add(nuevo);
    }

    public ArrayList<Juego> listarTodosLosJuegos() {
        return this.juegos;
    }

    public ArrayList<Juego> listarJuegosPorCategoria(EJuegos categoria) {
        ArrayList<Juego> juegosDeCategoria = new ArrayList<>();
        for (Juego juego : juegos) {
            if (juego.getCategoria().equals(categoria.getCategoria())) {
                juegosDeCategoria.add(juego);
            }
        }
        return juegosDeCategoria;
    }

    public ArrayList<Juego> listarTop5() {
        Collections.sort(this.juegos);
        ArrayList<Juego> top5=new ArrayList<>();
        for(int i=0; i<5;i++){
            top5.add(this.juegos.get(i));
        }
        return top5;
    }

    public Boolean darDeBajaJuego(Integer id) {
        Boolean eliminado = false;
        Integer i = 0;
        while (eliminado == false && i < this.juegos.size()) {
            if (this.juegos.get(i).getIdJuego() == id) {
                this.juegos.get(i).setActivo(false);
                eliminado = true;
            } else {
                i++;
            }
        }
        return eliminado;
    }
    
    public Juego retornaJuego(String nombre){
        Juego busco=null;
        Boolean encuentra=false;
        int i=0;
        
        while(i<this.juegos.size() && encuentra == false){
            if(this.juegos.get(i).getNombre().equals(nombre)){
            encuentra=true;
            busco=juegos.get(i);
            }else{
                i++;
            }
        }
        return busco;
    }

    public void reemplazaJuego(Juego juego){
        Boolean reemplazado = false;
        Integer i = 0;
        while (reemplazado == false && i < this.juegos.size()) {
            if (this.juegos.get(i).getIdJuego() == juego.getIdJuego()) {
                this.juegos.get(i).setCantValoraciones(juego.getCantValoraciones());
                this.juegos.get(i).setValoracion(juego.getValoracion());
                reemplazado = true;
            } else {
                i++;
            }
        }
    }

    //endregion

    //region Manejo de User

    public void agregarUsuario(UserBasico nuevo) {
        this.usersBasicos.put(nuevo.getDni(), nuevo);
    }
    public void agregarUsuarioPremimu(UsuarioPremium nuevo) {
        this.usuariosPremium.put(nuevo.getDni(), nuevo);
    }

    public Boolean darDeBajaUsuarioPremimum(String dni) {
        Boolean eliminado = false;
        UsuarioPremium aDesactivar=this.usuariosPremium.get(dni);
        aDesactivar.setActivo(false);
        this.usuariosPremium.put(dni,aDesactivar);

        return eliminado;
    }
    public Boolean darDeBajaUsuarioBasico(String dni) {
        Boolean eliminado = false;
        UserBasico aDesactivar=this.usersBasicos.get(dni);
        if(aDesactivar!=null) {
            aDesactivar.setActivo(false);
            this.usersBasicos.put(dni, aDesactivar);
        }
        return eliminado;
    }

    public Boolean darDeBajaUsuario(String dni){
        Boolean eliminado=false;
        eliminado=darDeBajaUsuarioBasico(dni);
        if(eliminado==false){
            eliminado=darDeBajaUsuarioPremimum(dni);
        }
        return eliminado;
    }

    public ArrayList<UserBasico> listarClientesBasicos() {
        ArrayList<UserBasico> listadoUsersBasicos = new ArrayList<>();
        for (Map.Entry<String, UserBasico> entry : usersBasicos.entrySet()) {
                listadoUsersBasicos.add((UserBasico) entry.getValue());
        }
        return listadoUsersBasicos;
    }


    public ArrayList<UsuarioPremium> listarClientesPremium() {
        ArrayList<UsuarioPremium> listadoUsuarioPremium = new ArrayList<>();
        for (Map.Entry<String, UsuarioPremium> entry : usuariosPremium.entrySet()) {
                listadoUsuarioPremium.add((UsuarioPremium) entry.getValue());
        }
        return listadoUsuarioPremium;
    }

    public void modificarAPremium(UserBasico upGrade) {
        UsuarioPremium nuevoPremium = new UsuarioPremium(upGrade.getNombre(), upGrade.getApellido(), upGrade.getDni(), upGrade.getMail(),upGrade.getId(),upGrade.getActivo(), upGrade.getContrasena(), upGrade.getSaldo(), upGrade.getNickName(), upGrade.getComprados(), upGrade.getMensajes(), upGrade.getExtractoDeCuenta());
        this.usuariosPremium.put(upGrade.getDni(), nuevoPremium);
        this.usersBasicos.remove(upGrade.getDni());
    }

    public void modificarABasico(UsuarioPremium downGrade) {
        UserBasico nuevoBasico = new UserBasico(downGrade.getNombre(), downGrade.getApellido(), downGrade.getDni(), downGrade.getMail(), downGrade.getContrasena(),downGrade.getId(),downGrade.getActivo(), downGrade.getSaldo(), downGrade.getNickName(), downGrade.getComprados(), downGrade.getMensajes(), downGrade.getExtractoDeCuenta(),0);
        this.usersBasicos.put(nuevoBasico.getDni(), nuevoBasico);
        this.usuariosPremium.remove(downGrade.getDni());
    }

    public void agregarAdmin(Admin nuevo) {
        this.usuariosAdmins.add(nuevo);
    }

    public void eliminarAdmin(Admin bajado) {
        Boolean eliminado = false;
        Integer i = 0;
        while (eliminado == false && i < this.usuariosAdmins.size()) {
            if (this.usuariosAdmins.get(i).getDni().equals(bajado.getDni())) {
                this.usuariosAdmins.get(i).setActivo(false);
                eliminado = true;
            } else {
                i++;
            }
        }
    }

    public UsuarioPremium buscarClientePremiumPorNickname(String nickName) {
        UsuarioPremium buscado = null;

        for (Map.Entry<String,UsuarioPremium> entry : usuariosPremium.entrySet()){
            if(entry.getValue().getNickName().equals(nickName)){
                buscado=entry.getValue();
            }
        }
        return buscado;
    }

    public UserBasico buscarClienteBasicoPorNickname(String nickName) {
        UserBasico buscado = null;

        for (Map.Entry<String,UserBasico> entry : usersBasicos.entrySet()){
            if(entry.getValue().getNickName().equals(nickName)){
                buscado=entry.getValue();
            }
        }
        return buscado;
    }
    
    public Admin buscarAdminPorNombre(String nombre){
        Admin buscado = null;
        for (Admin admin : this.usuariosAdmins) {
            if (nombre.equals(admin.getNombre())) {
                buscado = admin;
            }
        }
        return buscado;
    }

    public ArrayList<Cliente> listarClientesDadosDeBaja() {
        ArrayList<Cliente> arrayList = new ArrayList<>();
        for (UserBasico userBasico : usersBasicos.values()) {
            if (!userBasico.getActivo()) {
                arrayList.add(userBasico);
            }
        }

        for (UsuarioPremium userPremium : usuariosPremium.values()) {
            if (!userPremium.getActivo()) {
                arrayList.add(userPremium);
            }
        }


        return arrayList;
    }
    
        public ArrayList<Juego> recomendacionJuego(Cliente cliente) {
        String catFav = cliente.categoriaFavorita();
        ArrayList<Juego> aRecomendar = new ArrayList<>();
        Integer i = 0, j = 0;
        while (i < 5 && j < juegos.size()) {
            if (!cliente.getComprados().contains(juegos.get(j)) && juegos.get(j).getCategoria().equals(catFav)) {
                aRecomendar.add(juegos.get(j));
                i++;
            }
            j++;
        }
        return aRecomendar;
    }
        
    //endregion

    //region Manejo de Pedidos
    public void agregarPedido(Pedido nuevo) {
        this.pedidos.add(nuevo);
    }

    //endregion


    //region Getters Y Setters Para Serializacion

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public LinkedList<Admin> getUsuariosAdmins() {
        return usuariosAdmins;
    }

    public void setUsuariosAdmins(LinkedList<Admin> usuariosAdmins) {
        this.usuariosAdmins = usuariosAdmins;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public HashMap<String, UserBasico> getUsersBasicos() {
        return usersBasicos;
    }

    public void setUsersBasicos(HashMap<String, UserBasico> usersBasicos) {
        this.usersBasicos = usersBasicos;
    }

    public HashMap<String, UsuarioPremium> getUsuariosPremium() {
        return usuariosPremium;
    }

    public void setUsuariosPremium(HashMap<String, UsuarioPremium> usuariosPremium) {
        this.usuariosPremium = usuariosPremium;
    }

    //endregion

    //region Gestion de Mensajes
    public void logisticaDeMensajes(Mensaje nuevo) {
        Cliente destino = buscarClienteBasicoPorNickname(nuevo.getNicknameReceptor());
        if(destino==null){
            destino=buscarClientePremiumPorNickname(nuevo.getNicknameReceptor());
        }
        destino.getMensajes().add(nuevo);
    }

    //endregion

}
