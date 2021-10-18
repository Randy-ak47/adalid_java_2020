/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class _02Empleado extends _01Personas{

    public int idEmpleado;
    public double sueldo;
    private static int contador;

    public _02Empleado() {
    }

    public _02Empleado(double sueldo, String nombre, int edad, char genero, String direccion) {
        super(nombre, edad, genero, direccion);
        this.idEmpleado = ++contador;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        _01Personas datos = new _01Personas();
        
        return datos.getNombre() + " " +datos.getEdad()+  " _02Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
   
    
}
