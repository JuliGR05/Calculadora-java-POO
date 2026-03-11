//Calculadora POO JGR

public class Calculadora {

    public double sumar(double a, double b){
        return a + b;
    }

    public double resta(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b){
        double resultado = 0;

        try{
            resultado = a / b;
        }catch(Exception e){
            System.out.println("No se puede dividir por cero");
        }

        return resultado;
    }
}