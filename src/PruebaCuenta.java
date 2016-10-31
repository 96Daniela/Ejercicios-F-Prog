
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela Paladines
 */
public class PruebaCuenta {
    
    public static void main( String[] args ) 
   {
      Cuenta cuenta1 = new Cuenta( 50.00 ); // crea objeto Cuenta
      Cuenta cuenta2 = new Cuenta( -7.53 ); // crea objeto Cuenta
    
      // muestra el saldo inicial de cada objeto
      System.out.printf( "Saldo de cuenta1: $%.2f\n", 
         cuenta1.obtenerSaldo() );
      System.out.printf( "Saldo de cuenta2: $%.2f\n\n", 
         cuenta2.obtenerSaldo() );
      
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );
      double montoDeposito; // deposita el monto escrito por el usuario

      System.out.print( "Escriba el monto a depositar para cuenta1: " ); // indicador
      montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
      System.out.printf( "\nsumando %.2f al saldo de cuenta1\n\n", 
         montoDeposito );
      cuenta1.abonar( montoDeposito ); // suma al saldo de cuenta1

      // muestra los saldos
      System.out.printf( "Saldo de cuenta1: $%.2f\n", 
         cuenta1.obtenerSaldo() );
      System.out.printf( "Saldo de cuenta2: $%.2f\n\n", 
         cuenta2.obtenerSaldo() );

      System.out.print( "Escriba el monto a depositar para cuenta2: " ); // indicador
      montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
      System.out.printf( "\nsumando %.2f al saldo de cuenta2\n\n", 
         montoDeposito );
      cuenta2.abonar( montoDeposito ); // suma al saldo de cuenta2

      // muestra los saldos
      System.out.printf( "Saldo de cuenta1: $%.2f\n", 
         cuenta1.obtenerSaldo() );
      System.out.printf( "Saldo de cuenta2: $%.2f\n", 
         cuenta2.obtenerSaldo() );
      System.out.print( "Escriba el monto a depositar para cuenta2: " ); // indicador
      montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
      System.out.printf( "\nsumando %.2f al saldo de cuenta2\n\n", 
         montoDeposito );
      cuenta2.abonar( montoDeposito ); // suma al saldo de cuenta2

       System.out.println("");
      //retira saldos
       System.out.print( "Escriba el monto a retirar para cuenta2: " ); // indicador
      double retiroSaldo = entrada.nextDouble(); // obtiene entrada del usuario
      System.out.printf( "\nrestando %.2f al saldo de cuenta2\n\n", 
         retiroSaldo);
      System.out.println(cuenta2.retiro(retiroSaldo));
      // muestra los saldos
      System.out.printf( "--Saldo de cuenta2: $%.2f\n\n", 
         cuenta2.obtenerSaldo() );
      
   } // fin de main
}
