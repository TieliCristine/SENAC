package entidade;

public class Funcionario {

    private String nome;
    private double salario;
    private Endereco reside;

    public Funcionario(String nome, double salario, Endereco reside) {
        this.nome = nome;
        this.salario = salario;
        this.reside = reside;
    }

    public double calcularPagamento() {
        return this.getSalario() - this.calcularDesconto();
    }

    private double calcularDesconto() {
        //TODO usar uma constante para o desconto
        return this.getSalario() * 0.15;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getReside() { return reside; }
    public Endereco setEndereco(Endereco ruaLegal) { return reside; }
    }

