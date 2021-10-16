/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

import java.util.Scanner;
import plantilla.Plantilla;



/**
 *
 * @author johns
 */
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador = 0;
        int i = 0;
        
        Plantilla[] plantilla = new Plantilla[23];
        
        do{
           System.out.println("===========================");
           System.out.println("Bienvenido Director Tecnico");
           System.out.println("===========================");
           
           System.out.println("1. Agregar Jugador");
           System.out.println("2. Buscar Jugador");
           System.out.println("3. Mostrar Jugadores convocados");
           System.out.println("4. Editar Jugadores");
           System.out.println("5. Salir");
           System.out.println("Digite una opcion");
           opcion = entrada.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("Registro de Jugadores: ");
                   System.out.println("");
                   
                   plantilla[contador] = new Plantilla();
                   plantilla[contador].setId(contador);
                   
                   System.out.println("Nombre: ");
                   plantilla[contador].setNombre( entrada.next() );
                   
                   System.out.println("Apellido: ");
                   plantilla[contador].setApellido( entrada.next() );
                   
                   System.out.println("Posicion");
                   plantilla[contador].setPosicion( entrada.next() );
                   
                   System.out.println("Dorsal");
                   plantilla[contador].setDorsal( entrada.nextInt());
                   
                   System.out.println("Equipo donde juega:");
                   plantilla[contador].setEquipo( entrada.next() );
                   
                   contador = contador + 1;
                   break;
                 
               case 2:
                    System.out.println("Numero del Jugador:");
                    int Dorsal = entrada.nextInt();
                    
                    for(i = 0; i < contador; i++){
                        if( Dorsal == plantilla[i].getDorsal() ){
                            System.out.println( plantilla[i].getNombre() );
                            System.out.println( plantilla[i].getApellido() );
                            System.out.println( plantilla[i].getPosicion() );
                            System.out.println( plantilla[i].getDorsal() );
                            System.out.println( plantilla[i].getEquipo() );
                        }else{
                            System.out.println("Jugar no Registrado");
                        }
                    }
                    
                    break;
                   
               case 3:
                   System.out.println("Plantilla de Jugadores convocados");
                   System.out.println("");
                   
                   for(i = 0; i < contador; i++){
                       System.out.println( plantilla[i].getNombre() );
                       System.out.println( plantilla[i].getPosicion());
                       System.out.println( plantilla[i].getDorsal() );
                      
                       System.out.println("_________________________");
                   }
                    break;
               case 4:
                   System.out.println("Dosal Jugador a modificar");
                   Dorsal = entrada.nextInt();
                   
                   System.out.println(Dorsal);
                   for(i = 0; i < contador; i++){
                       if( Dorsal == plantilla[i].getDorsal() ){
                           
                           System.out.println("Nombre: ");
                           plantilla[i].setNombre( entrada.next() );
                           
                           System.out.println("Apelllido: ");
                           plantilla[i].setApellido( entrada.next() );
                           
                           System.out.println("Posicion: ");
                           plantilla[i].setPosicion( entrada.next() );
                           
                           System.out.println("Dorsal: ");
                           plantilla[i].setDorsal( entrada.nextInt() );
                           
                           System.out.println("Equipo del Jugador: ");
                           plantilla[i].setEquipo( entrada.next() );
                           
                       }else {
                           System.out.println("Jugador no encontrado, Verifique los datos");
                       }
                   }
                    break;
                    
               case 5:
                   System.exit(0);
                    break;
                
                   
               default:
                   break;
            }
        }while(opcion != 5);
       
       
    }
    
}
