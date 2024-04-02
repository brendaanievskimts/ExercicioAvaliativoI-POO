import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ACMESports {
    private Scanner entrada = new Scanner(System.in);
    private PrintStream saidaPadrao = System.out;
    private final String nomeArquivoEntrada = "dadosin.txt";
    private final String nomeArquivoSaida = "dadosout.txt";
    private Medalheiro medalheiro;
    private Plantel plantel;

    public ACMESports() {
        redirecionaES();
        medalheiro = new Medalheiro();
        plantel = new Plantel();
    }

    public void executar() {
        cadastrarAtleta(); //1
        cadastrarMedalha(); //2
        cadastrarMedalhaEAtletaCorrespondente(); //3
        dadosAtletaNumero(); //4
        dadosAtletaNome(); //5
        dadosMedalhaCod(); //6
        atletaPorPais(); //7
        atletasPorTipoMedalha(); //8
        atletasPorModalidade(); //9
        atletaComMaisMedalhas(); //10
    }

    private void cadastrarAtleta() {
        int numero;
        String nome;
        String pais;
        numero = Integer.parseInt(entrada.nextLine());

        while(numero != -1){
            nome = entrada.nextLine();
            pais = entrada.nextLine();
            Atleta atleta = new Atleta(numero,nome,pais);
            plantel.cadastraAtleta(atleta);
            System.out.println("1:" + numero + "," + nome + "," + pais);
            numero = Integer.parseInt(entrada.nextLine());
        }
    }

    private void cadastrarMedalha() {
        int codigo;
        int tipo;
        boolean individual;
        String modalidade;

        codigo = Integer.parseInt(entrada.nextLine());

        while (codigo != -1) {
            tipo = Integer.parseInt(entrada.nextLine());
            individual = Boolean.parseBoolean(String.valueOf(entrada.nextLine()));
            modalidade = entrada.nextLine();

            Medalha medalha = new Medalha(codigo, tipo, individual, modalidade);
            medalheiro.cadastraMedalha(medalha);
            System.out.println("2:" + codigo + "," + tipo + "," + individual + "," + modalidade);
            codigo = Integer.parseInt(entrada.nextLine());
        }
    }

    private void cadastrarMedalhaEAtletaCorrespondente(){
        int codigo = Integer.parseInt(entrada.nextLine());

        while(codigo != -1) {
            int numero = Integer.parseInt(entrada.nextLine());
            Medalha m = medalheiro.consultaMedalha(codigo);
            Atleta a = plantel.consultaAtletaNro(numero);

            if(a != null){
                a.adicionaMedalha(m);
                if( m != null){
                    m.adicionaAtleta(a);

                    System.out.println("3:" + m.getCodigo() + "," + a.getNumero());
                }
            }
            codigo = Integer.parseInt(entrada.nextLine());
        }
    }

    private void dadosAtletaNumero(){
        int numero = Integer.parseInt(entrada.nextLine());
        Atleta a = plantel.consultaAtletaNro(numero);
        if(a == null){
            System.out.println("4:Nenhum atleta encontrado." );
        } else{
            System.out.println("4:" + a.getNumero() + "," + a.getNome() + "," + a.getPais());
        }
    }

    private void dadosAtletaNome() {
        String nome = entrada.nextLine();
        Atleta atleta = plantel.consultaAtletaNome(nome);

        if (atleta == null || !atleta.getNome().equals(nome)) {
            System.out.println("5:Nenhum atleta encontrado.");
        } else {
            System.out.println("5:" + atleta.getNumero() + "," + atleta.getNome() + "," + atleta.getPais());
        }
    }

    private void dadosMedalhaCod(){
        int codigo = Integer.parseInt(entrada.nextLine());
        Medalha m = medalheiro.consultaMedalha(codigo);
        if(m == null){
            System.out.println("6:Nenhuma medalha encontrada." );
        } else {
            System.out.println("6:" + m.getCodigo() + "," + m.getTipo() + "," + m.getIndividual() + "," + m.getModalidade());
        }
    }

    private void atletaPorPais(){
        String pais = entrada.nextLine();
        Atleta atleta = plantel.consultaAtletaPais(pais);

        if(atleta == null){
            System.out.println("7:Pais nao encontrado.");
        } else {
            System.out.println("7:" + atleta.getNumero() + "," + atleta.getNome() + "," + atleta.getPais());
        }

    }

    private void atletasPorTipoMedalha(){
        int tipo = entrada.nextInt();
        entrada.nextLine();
        ArrayList<Atleta> atletas = medalheiro.atletaPorTipoMedalha(tipo);

        if (atletas == null || atletas.isEmpty()) {
            System.out.println("8:Nenhum atleta encontrado.");
        } else {
            for (Atleta atleta : atletas) {
                System.out.println("8:" + atleta.getNumero() + "," + atleta.getNome() + "," + atleta.getPais());
            }
        }

    }

    private void atletasPorModalidade(){
        String modalidade = entrada.nextLine();
        ArrayList<Medalha> medalhas = medalheiro.consultaMedalhas(modalidade);

        if (medalhas == null || medalhas.isEmpty()) {
            System.out.println("9:Modalidade não encontrada.");
        } else {
            for (Medalha medalha : medalhas) {
                for (Atleta atleta : medalha.getAtletas()) {
                    System.out.println("9:" + modalidade + "," + medalha.getTipo() + "," + atleta.getNumero() + "," + atleta.getNome() + "," + atleta.getPais());
                }
            }
        }
    }

    private void atletaComMaisMedalhas(){
        Atleta atleta = plantel.atletaComMaisMedalhas();

        if (atleta == null) {
            System.out.println("10:Nenhum atleta com medalha.");
        } else {
            System.out.println("10:" + atleta.getNumero() + "," + atleta.getNome() + "," + atleta.getPais() + "," + plantel.tipos(atleta));
        }
    }

    private void redirecionaES() {
        try {
            BufferedReader streamEntrada = new BufferedReader(new FileReader(nomeArquivoEntrada));
            entrada = new Scanner(streamEntrada);
            PrintStream streamSaida = new PrintStream(new File(nomeArquivoSaida), Charset.forName("UTF-8"));
            System.setOut(streamSaida);
        } catch (Exception e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH);
        entrada.useLocale(Locale.ENGLISH);
    }

    private void restauraES() {
        System.setOut(saidaPadrao);
        entrada = new Scanner(System.in);
    }
}