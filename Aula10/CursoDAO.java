package Aula10;

public interface CursoDAO {
    public Curso create(String nome);

    public Curso findByName(String nome);

    public void update(long id, String nome);

    public void delete(long id);
}
