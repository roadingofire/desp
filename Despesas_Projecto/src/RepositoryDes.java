
import java.util.ArrayList;

public class RepositoryDes {
    ArrayList<Despesa> despesas;
    
    public RepositoryDes() {
        despesas = new ArrayList<>();
    }
    
    public void addDespesa(Despesa desp) {
        despesas.add(desp);
    }
    
    public void remDespesa(Despesa desp) {
        for(int i=0; i<despesas.size(); i++) {
            if(desp.getDescricao().equals(despesas.get(i).getDescricao()) 
                    && desp.getValor()==despesas.get(i).getValor()) {
                despesas.remove(i);
                break;
            }           
        }
    }
}
