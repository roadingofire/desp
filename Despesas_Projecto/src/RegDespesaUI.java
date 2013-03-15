
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class RegDespesaUI {
    private int temp_valor;
    private String temp_desc;
    private REgDespController rc;
    public RegDespesaUI() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Introduza o valor: ");
        temp_valor = s1.nextInt();
        System.out.println("Introduza a Descricao: ");
        temp_desc = s1.next();
        rc = new REgDespController(temp_valor, temp_desc);  
    }
    
    public REgDespController getController(){
        return rc;
    }
}
