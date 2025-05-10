package Exerc1;

public class Funcionario extends Usuario{
    private String cargo;


    public Funcionario(String nome, String id ,String cargo) {
        super(nome, id);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
