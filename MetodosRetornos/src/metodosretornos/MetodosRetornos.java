

package metodosretornos;

import java.util.Scanner;


 // @author Joel

public class MetodosRetornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          float num1= 0.0f, num2 = 0.0f;
        int operacion;
        String respuesta;
        
        respuesta = "s";

        while (respuesta.toLowerCase().equals("s")) {

            operacion = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicaci$B!)(Bn");
            System.out.println("4.- Divisi$B!)(Bn");
            System.out.print("Ingrese la operaci$B!)(Bn que desea realizar: ");

            operacion = scan.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("La suma es :" +suma(num1, num2));
                        break;
                case 2: 
                    System.out.println("La Resta es :" + resta(num1, num2));
                        break;
                case 3: //resultado = operandoUno * operandoDos;
                    System.out.println("La Multiplicaci$B!)(Bn es :" + multi(num1, num2));
                        break;
                case 4: //resultado = operandoUno / operandoDos;
                    System.out.println("La Divisi$B!)(Bn es :" + division(num1, num2));
                        break;
                default:System.out.println("Opci$B!)(Bn ingresada no es v$B!)(Blida."); 
                        break;
            }
            
            System.out.print("Desea realizar otra operacion? (s/n) ");
            respuesta = scan.next();
        }
    }
    
    // Agregar nuevos m$B!)(Btodos aqu$B!)(B
    public static float suma(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno + operandoDos;
       
        return  resultado;
        
        
        
    }
    //--------------------Resta-----------------------------
    public static float resta(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno - operandoDos;
       
        return  resultado; 
    }
    
    
    //-------------------Multiplicaci$B!)(Bn------------------------------
    public static float multi(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno * operandoDos;
       
        return  resultado; 
    }
    
    //-------------------division----------------------------
    public static float division(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno / operandoDos;
       
        return  resultado; 
    }
    }


