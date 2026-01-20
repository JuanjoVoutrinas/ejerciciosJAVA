package programacion;

import java.util.Random;

public class App 
{
    public static void main( String[] args )   {
       ControladorDNI controlador = new ControladorDNI();
       String test = controlador.generarAleatorioDNI();
       System.out.println(test);
    }
}
