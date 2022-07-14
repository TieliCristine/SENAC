package entidade;

import java.util.Calendar;
import java.util.Date;

public class PessoaV {
    //Atributos
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private double alturaEmMetros;
    private char sexo;

    //Construtores
    public PessoaV() {

    }

    public PessoaV(String nomeDaPessoa, String cpf) {
        this.nome = nomeDaPessoa;
        this.cpf = cpf;
    }

    public PessoaV(String cpf, String name, Date dataNascimento, double alturaEmMetros, char sexo) {
        super();
        this.cpf = cpf;
        this.nome = name;
        this.dataNascimento = dataNascimento;
        this.alturaEmMetros = alturaEmMetros;
        this.sexo = sexo;
    }

    //Métodos
    public int calcularIdade(int anoAtual) {
        int idade = 0;

        //Assumir dd/MM/yyyy

        Calendar cal = Calendar.getInstance();
        cal.setTime(this.dataNascimento);

        int anoNascimento = cal.get(Calendar.YEAR);
        idade = anoAtual - anoNascimento;

        return idade;
    }

    //Métodos getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAlturaEmMetros() {
        return alturaEmMetros;
    }

    public void setAlturaEmMetros(double alturaEmMetros) {
        this.alturaEmMetros = alturaEmMetros;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
