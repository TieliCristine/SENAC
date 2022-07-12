package entidade;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private boolean adimplente;
    private ArrayList<String> conta = new ArrayList<>();

    public Pessoa(){
        super();
    }
    public Pessoa(String nome, boolean adimplente, ArrayList<String> conta) {
        this.nome = nome;
        this.adimplente = adimplente;
        this.conta = conta;
    }
}
