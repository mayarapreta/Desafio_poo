package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo {
//é filha do conteudo

   private LocalDate data;

  @Override
  public double calcularXp(){
    return XP_PADRAO + 20d;
  }

  public Mentoria() {
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Mentoria{" +
            "titulo='" + getTitulo() + '\'' +
            ", descriçao='" + getDescrição() + '\'' +
            ", data=" + data +
            '}';
  }


}


