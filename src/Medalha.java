import java.util.ArrayList;

public class Medalha {
    private int codigo;
    private int tipo;
    private boolean individual;
    private String modalidade;
    private ArrayList<Atleta> atletas;

    public Medalha(int codigo, int tipo, boolean individual, String modalidade){
        this.codigo = codigo;
        this.tipo = tipo;
        this.individual = individual;
        this.modalidade = modalidade;
        atletas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public int getTipo() {
        return tipo;
    }

    public boolean getIndividual(){ return individual; }

    public String getModalidade() {
        return modalidade;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void adicionaAtleta(Atleta atleta) { atletas.add(atleta); }

    public void consultaQuantidadeAtletas(Atleta atleta) { atletas.size(); }

    @Override
    public String toString() {
        return "Medalha{" +
                "codigo=" + codigo +
                ", tipo=" + tipo +
                ", individual=" + individual +
                ", modalidade='" + modalidade + '\''+
                '}';
    }
}