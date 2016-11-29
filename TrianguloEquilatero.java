import java.util.Scanner;
public class TrianguloEquilatero
{  public static void main(String[] arg)
    {
  System.out.println("Dame un numero");
  Scanner in = new Scanner(System.in);
  int lado = in.nextInt();
  in.close();
  //System.out.printf("El número dado es %d", lado);
  int perimetro = mostrarPerimetro(lado);
  System.out.printf("El perimetro es %d", perimetro);
    }

    public static int mostrarPerimetro (int lado)
    {
        int perimetro;
        perimetro = 3*lado;
        return perimetro;
    }
}