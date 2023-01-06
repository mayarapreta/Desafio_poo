import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

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

 Conteudo conteudo = new Curso(); // isso é polimorfismo
      //  List<String> palavras = new ArrayList<>() tudo que tem aqui no conteudo, nem tudo tem no outro ;
        // também tem assim o polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
    mentoria.setDescrição("descrição mentoria java");
     mentoria.setData(LocalDate.now());

     /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devMayara = new Dev();
        devMayara.setNome("Mayara");
        devMayara.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Mayara:" + devMayara.getConteudoInscritos());
        devMayara.progredir();
        devMayara.progredir();
        System.out.println("-");
        System.out.println("Conteudo Concluidos Mayara:" + devMayara.getConteudosConcluidos());
        System.out.println("Conteudo Concluidos Mayara:" + devMayara.getConteudosConcluidos());
        System.out.println("XP:" + devMayara.calcuarTotalxp());
        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos João:"+ devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudo Cncluidos joão:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcuarTotalxp());

    }
    }
