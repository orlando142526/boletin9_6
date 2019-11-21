
package boletin9_6;
import java.util.Scanner;

public class Soldo {
    
 private int soldo1750;
    private float soldo1000;
    private float soldoTotal;
    private float soldo;
    Scanner sc = new Scanner(System.in);
    
    public float pedirSoldo(){
        System.out.print("Teclea o soldo: ");
        soldo = sc.nextFloat();
        return soldo;
    }
    
    public void Soldo(){
       do{
        soldo = pedirSoldo();
        if (soldo >= 1000 && soldo <= 1750)
           soldo1750++;
        else
             if (soldo!=0)
            soldo1000++;
        soldoTotal++;
        }while(soldo!=0);
      soldoTotal= soldoTotal - 1;
                System.out.println("Soldo entre 1000€ e 1750€ dos traballadores é "+soldo1750);
                System.out.println("Soldo menor de 1000 dos traballadores é "+soldo1000/soldoTotal*100+" %");
    }
}
