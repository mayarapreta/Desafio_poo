package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    public Curso() {
    }

    private int cargahhoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahhoraria;
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
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", cargahhoraria=" + cargahhoraria +
                '}';
    }


}
