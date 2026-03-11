import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        boolean valido = false;

        Calculadora cal = new Calculadora();

        while(!valido){
            try{

                System.out.println("Por favor ingrese el primer numero:");
                num1 = entrada.nextDouble();

                System.out.println("Por favor ingrese el segundo numero:");
                num2 = entrada.nextDouble();

                System.out.println("Por favor ingrese el tercer numero:");
                num3 = entrada.nextDouble();

                valido = true;

            }catch(Exception e){

                System.out.println("Ingresaste un dato no valido. Intenta otra vez ingresando un número.");
                entrada.nextLine();

            }
        }

        // Para sumar
        double resultadoSuma = cal.sumar(num1, num2);
        double resultadoSuma2 = cal.sumar(resultadoSuma, num3);

        // Para restar
        double resultadoResta = cal.resta(num1, num2);
        double resultadoResta2 = cal.resta(resultadoResta, num3);

        // Para multiplicar
        double resultadoMult = cal.multiplicar(num1, num2);
        double resultadoMult2 = cal.multiplicar(resultadoMult, num3);

        // Para dividir
        double resultadoDiv = cal.dividir(num1, num2);
        double resultadoDiv2 = cal.dividir(resultadoDiv, num3);

        System.out.println("Resultado suma: " + resultadoSuma2);
        System.out.println("Resultado resta: " + resultadoResta2);
        System.out.println("Resultado multiplicacion: " + resultadoMult2);
        System.out.println("Resultado division: " + resultadoDiv2);

        entrada.close();
    }
}