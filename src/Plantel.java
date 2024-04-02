import java.util.ArrayList;

public class Plantel {
    private ArrayList<Atleta> atleta;

    public Plantel(){
        atleta = new ArrayList<>();
    }

    public boolean cadastraAtleta(Atleta a) {
        for (Atleta at : atleta) {
            if (a.getNumero() == at.getNumero())
                return false;
        }
        atleta.add(a);
        return true;
    }

    public Atleta consultaAtletaNome(String nome) {
        if(!atleta.isEmpty()) {
            for(int i = 0; i < atleta.size(); i++){
                Atleta a = atleta.get(i);
                if(a.getNome().equals(nome))
                    return a;
            }
        }
        return null;
    }

    public Atleta consultaAtletaNro(int numero) {
        if(!atleta.isEmpty()) {
            for(int i = 0; i < atleta.size(); i++){
                Atleta a = atleta.get(i);
                if(a.getNumero() == numero)
                    return a;
            }
        }
        return null;
    }

    public Atleta consultaAtletaPais(String pais) {
        if(!atleta.isEmpty()) {
            for(int i = 0; i < atleta.size(); i++){
                Atleta a = atleta.get(i);
                if(a.getPais().equals(pais))
                    return a;
            }
        }
        return null;
    }

    public Atleta atletaComMaisMedalhas(){
        Atleta aMedalhas = null;

        if(!atleta.isEmpty()) {
            for(Atleta a : atleta){
                if(aMedalhas == null || a.consultaQuantidadeMedalhas() > aMedalhas.consultaQuantidadeMedalhas()){
                    aMedalhas = a;
                }
            }
            return aMedalhas;
        }
        return null;
    }

    public String tipos(Atleta atleta) {
        int ouro = 0;
        int prata = 0;
        int bronze = 0;

        for (Medalha medalha: atleta.getMedalhas() ){
            if(medalha.getTipo() == 1){
                ouro++;
            }
            if(medalha.getTipo() == 2){
                prata++;
            }
            if (medalha.getTipo() == 3){
                bronze++;
            }

        }
        return "Ouro:"+ouro + ",Prata:"+ prata + ",Bronze:"+ bronze ;
    }
}