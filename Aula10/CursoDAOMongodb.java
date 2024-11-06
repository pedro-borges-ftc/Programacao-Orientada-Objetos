package Aula10;

public class CursoDAOMongodb implements CursoDAO{
    public Curso create(String nome){
        //aqui vou inserir um Curso
        System.out.println("Curso inserido com sucesso");
        return new Curso();
    }

    public Curso findByName(String nome){
        //aqui vou Buscar um Curso
        System.out.println("Curso encontrado com sucesso");
        return new Curso();
    }

    public void update(long id, String nome){
        //aqui vou alterar um Curso
        System.out.println("Curso alterado com sucesso");
    }

    public void delete(long id){
        //aqui vou remover um Curso
        System.out.println("Curso removido com sucesso");
    }
}
