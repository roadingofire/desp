
import java.util.Scanner;

public class Menu {
       
    public Menu() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("1 - Registar uma Despesa");
        if(s1.nextInt()==1) {
            RegDespesaUI reg = new RegDespesaUI();
        }
    }
}
