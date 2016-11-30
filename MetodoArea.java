import java.util.Scanner;
public class MetodoArea {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("Dime la base");
        int base = in.nextInt();
        double altura = Math.sqrt((3*base*base/4));
        double area = (base*altura)/2;
        System.out.printf("El area del triangulo es: %2.f", area);
        in.close();
        

    }
		public static int ResultadoArea(int area){
		return area;
	}
}

