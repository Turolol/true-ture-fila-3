import java.util.Scanner;
/**
 * Write a description of class Github here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taquilla
{ 

    public static void main(String[]args){
        Taquilla taquilla=new Taquilla();
        Apuesta dinero=new Apuesta();
        Scanner sc = new Scanner(System.in);

        boolean b=false;
        while(!b){
            System.out.println("Bienvenido a las carreras de Dongers.");
            System.out.println("Que desea hacer.");
            System.out.println("1 : Empezar nueva carrera");
            System.out.println("2 : Ingresar dinero");
            System.out.println("3 : Mostrar dinero");
            System.out.println("4 : Salida");

            int n=sc.nextInt();

            switch(n)
            {
                case 1: dinero.setApuestaMin(20.0);
                if(dinero.getDinero()<dinero.getApuestaMin()
                taquilla.menu2();
                break;
                case 2:
                taquilla.ingresar();
                break;
                case 3:
                taquilla.mostrar();
                break;
                case 4:
                sc.close();
                break;          
                default:

            }
        }

        
        
    }

    public void menu2()
    {   comprobar();
        System.out.println("");
        System.out.println("");
        System.out.println("1 : Comprobar apuesta");
        System.out.println("2 : Ingresar dinero");
        System.out.println("3 : Mostrar dinero");
        System.out.println("4 : Salida");
        sc=new Scanner(System.in);
        int n=sc.nextInt();
    }

    public void comprobar()
    {

    } 
}
