
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
public class _00Principal {
     public static void main(String[] args) {
        
        _03Cliente c1 = new _03Cliente(new Date(),true,"diego",99, 'H',"C/Mercedez");
         System.out.println(c1);
        
        /*
        super(nombre, edad, genero, direccion);
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.vip = vip;
        
        */
        _02Empleado e1 = new _02Empleado(2000,"pepa",66,'M',"Calle Otra dircción");
         System.out.println(e1);
         
         /*
         
          public _02Empleado(double sueldo, String nombre, int edad, char genero, String direccion) {
        super(nombre, edad, genero, direccion);
        this.idEmpleado = ++contador;
        this.sueldo = sueldo;
    }
         
         */
     }
}
