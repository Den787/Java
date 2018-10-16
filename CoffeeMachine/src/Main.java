import com.sun.source.util.SourcePositions;
import jdk.swing.interop.SwingInterOpUtils;

public class Main {

  /*  public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Кофе-машина");

        Integer moneyAmount = 1000;

        Integer lattePrice = 150;
        Integer cappucinoPrice = 140;
        Integer waterPrice = 20;
        Integer milkPrice = 50;

        boolean canBuyAnything = false;

        if(moneyAmount >= milkPrice) {
            System.out.println("Вы можете купить молоко");
            canBuyAnything = true;
        }

        if(moneyAmount >= lattePrice) {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }

        if(moneyAmount >= cappucinoPrice) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        if(moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if(!canBuyAnything) {
            System.out.println("Недостаточно средств!");
        }


    } */


    public static void main (String[] args) throws java.lang.Exception
    {
        int moneyAmount = 100;

        String drinks[] = { "капучино", "латте", "вода", "молоко" };
        Integer prices[] = {120, 140, 20, 101};
        boolean canBuyAnithing = false;


        //================================================
        System.out.println("Coffee-machine");

        for(int i=0; i<drinks.length; i++)
        {
           System.out.println(drinks[i] + " " + prices[i]);
           if(moneyAmount =>prices[i]) {
            System.out.println("Вы можете купить " + drinks[i]);
            canBuyAnithing = true;

        }
        }

        if (!canBuyAnithing) System.out.println("Недостаточно средств!");
    }




}
