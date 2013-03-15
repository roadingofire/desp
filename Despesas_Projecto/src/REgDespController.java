/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class REgDespController {
    private Despesa d;
    
    public REgDespController(int valor, String desc){
        d = new Despesa(valor, desc);
        System.out.println("asdasd");
    }
    
    public Despesa getDespesa() {
        return d;
    }

}
