package Aula10;

public class Curso {
    //Atributos
    private long id;
    private String nome;
    //Construtores
    public Curso() {
        this.id = 0;
        this.nome = "";
    }
    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    //Gets e Sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //
    public void imprimeCusto(){
        System.out.println("Id Curso: " + this.id);
        System.out.println("Nome Curso: " + this.nome);
    }
}
