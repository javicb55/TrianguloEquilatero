import java.util.Scanner;
public class MetodoArea {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
<<<<<<< HEAD
        System.out.println("Dime el lado");
        int lado = in.nextInt();
        double area = calcularArea(lado);
        System.out.printf("El area del triangulo es: %.2f ", area);
=======
        System.out.println("Dime la base");
        int base = in.nextInt();
        double altura = Math.sqrt((3*base*base/4));
        double area = (base*altura)/2;
        System.out.printf("El area del triangulo es: %2.f", area);
>>>>>>> 53186f84f88cac22465becaac89b398ea65ab553
        in.close();
    }
		public static double calcularArea(double lado){
		return Math.sqrt(3)/4*lado*lado;
	}
}

