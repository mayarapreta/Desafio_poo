import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

          Curso curso1 = new Curso();
     curso1.setTitulo("curso java");
curso1.setDescrição("descrisao curso java");
curso1.setCargahhoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
curso2.setTitulo("curso js");
curso2.setDescrição("descrição curso js");
curso2.setCargahhoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
    mentoria.setDescriçao("descrição mentoria java");
     mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

    }
    }
