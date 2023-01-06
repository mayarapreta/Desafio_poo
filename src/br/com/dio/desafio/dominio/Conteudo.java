package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //isso é herança. para evita a repediçoes dee codigo. nao é mentoria pq nap tem data
    protected static final double XP_PADRAO = 10d;
    private  String titulo;
    private  String descrição;
    public  abstract  double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
