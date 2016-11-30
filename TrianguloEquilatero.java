import java.util.Scanner;
public class TrianguloEquilatero
{  public static void main(String[] arg)
    {
  System.out.println("Dame el lado");
  Scanner in = new Scanner(System.in);
  double lado = in.nextInt();
  in.close();
  double area = calcularArea(lado);
    
  double perimetro = mostrarPerimetro(lado);
  System.out.printf("El perimetro es del triangulo rectángulo de lado %.2f tiene de perimetro %.2f y su area %.2f es:",lado, perimetro,area);
    }

    public static double mostrarPerimetro (double lado)
    {
        double perimetro;
        perimetro = 3*lado;
        return perimetro;
    }

    public static double calcularArea(double lado)
    {
		return Math.sqrt(3)/4*lado*lado;
	}
}
//Antes de Push haz un Pull