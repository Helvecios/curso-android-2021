package vecios.sartori.appminhaideia.model;

//classe pojo (uma classe simples apenas com seus atributos, getters and setters)
public class Cliente {

    //atributos
    //tipos de dados: primitivos e não primitivos
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private boolean sexo;

    //costrutor padrão (cópia de um formulário)
    //public Cliente(){}

    //construtor com atributos

    public Cliente(String nome, String email, String telefone, int idade, boolean sexo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
    }

    //métodos de acesso (getts e setts) - ação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}
