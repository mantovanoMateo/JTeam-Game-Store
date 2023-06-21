package Model.Clases;

import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    private static int id=0;
    private Integer idPedido;
    private ArrayList<Juego> juegos;
    private Double valorTotal;
    private Cliente cliente;


    public Pedido() {
        this.idPedido=id;
        id++;
        this.juegos=new ArrayList<>();
        this.valorTotal=0.0;
    }

    public Pedido(Integer idPedido, Double valorTotal,Cliente cliente) {
        this.idPedido = idPedido;
        this.juegos=new ArrayList<>();
        this.cliente=cliente;
        this.valorTotal = valorTotal;
    }

    public static int getId() {
        return id;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public static void setId(int id) {
        Pedido.id = id;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        //hay que generarlo nuevamente igual por que hay datos que no tenemos
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", valorTotal=" + valorTotal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido pedido)) return false;
        return Objects.equals(idPedido, pedido.idPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPedido);
    }
}
