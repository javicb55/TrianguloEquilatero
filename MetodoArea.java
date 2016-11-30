import java.util.Scanner;
public class MetodoArea {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("Dime el lado");
        int lado = in.nextInt();
        double area = calcularArea(lado);
        System.out.printf("El area del triangulo es: %.2f ", area);
        in.close();
    }
		public static double calcularArea(double lado){
		return Math.sqrt(3)/4*lado*lado;
	}
}

