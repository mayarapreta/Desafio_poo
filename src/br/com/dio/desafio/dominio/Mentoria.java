package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

  public Mentoria() {
  }

  private   String titulo;
    private String descriçao;
    private LocalDate data;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescriçao() {
    return descriçao;
  }

  public void setDescriçao(String descriçao) {
    this.descriçao = descriçao;
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
            "titulo='" + titulo + '\'' +
            ", descriçao='" + descriçao + '\'' +
            ", data=" + data +
            '}';
  }
}


