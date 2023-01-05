package br.com.dio.desafio.dominio;

public class Curso {

    public Curso() {
    }

    private String titulo;
    private String descrição;
    private int cargahhoraria;

    public  String getTitulo(){
        return  titulo;
    }
    public void  setTitulo(String titulo){
        this.titulo = titulo;
    }
public  String getDescrição(){
        return  descrição;
}
public  void setDescrição(String descrição){
        this.descrição = descrição;

}

public  int getCargahhoraria(){
      return  cargahhoraria;
}
public void  setCargahhoraria(int cargahhoraria){
        this.cargahhoraria = cargahhoraria;
}

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descrição='" + descrição + '\'' +
                ", cargahhoraria=" + cargahhoraria +
                '}';
    }
}
