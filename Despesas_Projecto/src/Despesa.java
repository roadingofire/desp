
public class Despesa {
    private int valor;
    private String descricao;
    
    public Despesa(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    
    public int getValor() {
        return valor;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;        
    }
    
    @Override
    public String toString() {
        return String.format("Valor: %d\nDescricao: %s\n", valor, descricao);
    }
}
