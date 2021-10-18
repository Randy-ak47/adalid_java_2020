
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class _03Cliente extends _01Personas{
    public int idCliente;
    public Date fecha;
    public boolean vip;
    private static int contador;

 

    public _03Cliente(Date fecha, boolean vip, String nombre, int edad, char genero, String direccion) {
        super(nombre, edad, genero, direccion);
        this.idCliente = ++contador;
        this.fecha = fecha;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString() + " _03Cliente{" + "idCliente=" + idCliente + ", fecha=" + fecha + ", vip=" + vip + '}';
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    

}
