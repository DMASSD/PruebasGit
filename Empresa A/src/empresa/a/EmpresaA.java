package empresa.a;

import empleados.*;
import nominas.*;


public class EmpresaA {

    public static void main(String[] args) {

        Empleados mecanico = new Empleados();
        Nominas mecanicoNomina = new Nominas(); //Cambiar el consutructor, este comentario esta hecho desde GitHub jejeje
        
        
        System.out.println(mecanico.nombre);   
        System.out.println(mecanicoNomina.tiempoTrabajo);       
    }
    
}
