import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.bootcamp.desafio.dominio.Bootcamp;
import br.com.bootcamp.desafio.dominio.Curso;
import br.com.bootcamp.desafio.dominio.Dev;
import br.com.bootcamp.desafio.dominio.Mentoria;

public class App {

    private static boolean conectado;
    private static Integer opcao;
    private static Integer iteradorNovoCurso = 1;
    private static Integer iteradorNovaMentoria = 1;
    private static Scanner sc = new Scanner(System.in);
    private static List<Dev> devs = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Mentoria> mentorias = new ArrayList<>();
    private static List<Bootcamp> bootcamps = new ArrayList<>();
    private static Dev devLogado;

    public static void main(String[] args) throws InterruptedException {

        conectado = true;

        while (conectado) {

            System.out.println("======= MENU =======");
            System.out.println("EScolha a opção desejada: ");
            System.out.println("Opção 1: Adicionar novo Dev");
            System.out.println("Opção 2: Adicionar novo curso");
            System.out.println("Opção 3: Adicionar nova mentoria");
            System.out.println("Opção 4: Adicionar novo bootcamp");
            System.out.println("Opção 5: Progredir no bootcamp");
            System.out.println("Opção 6: Listar Devs");
            System.out.println("Opção 7: Listar Cursos");
            System.out.println("Opção 8: Listar Mentorias");
            System.out.println("Opção 9: Listar Bootcamps");
            System.out.println("Opção 10: Trocar usuário");
            System.out.println("Opção 11: Consultar login");
            System.out.println("Opção 12: Inscrição em bootcamp");
            System.out.println("Opção 0: Encerrar programa");
            System.out.print("Escolha a opção desejada: ");
            String nextIntString = sc.nextLine();
            opcao = Integer.parseInt(nextIntString);

            switch (opcao) {
                case 1:
                    novoDev();
                    break;
                case 2:
                    novoCurso();
                    break;
                case 3:
                    novaMentoria();
                    break;
                case 4:
                    novoBootcamp();
                    break;
                case 5:
                    avancarNoBootcamp();
                    break;
                case 6:
                    listarDevs();
                    break;
                case 7:
                    listarCursos();
                    break;
                case 8:
                    listarMentorias();
                    break;
                case 9:
                    listarBootcamps();
                    break;
                case 10:
                    trocarUsuario();
                    System.out.println();
                    break;
                case 11:
                    consultarLogin();
                    System.out.println();
                    break;
                case 12:
                    inscricaoBootcamp();
                    break;
                case 0:
                    System.out.print("Desconectando");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.println(".");
                    conectado = false;
                    System.out.println("Programa encerrado com sucesso!");
                    System.out.println();
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println();
                    break;
            }
        }
    }

    public static void novoDev() {
        System.out.println();
        System.out.println("======= CADASTRAR NOVO DEV =======");
        System.out.print("Informe o nome: ");
        String dev = sc.nextLine();
        dev = "dev" + dev;
        Dev novoDev = new Dev(dev);
        novoDev.setNome(dev);
        devs.add(novoDev);
        devLogado = novoDev;
        System.out.println("O novo dev " + novoDev.getNome() + " está logado.");
        System.out.println();
    }

    public static void novoCurso() {
        System.out.println();
        System.out.println("======= CADASTRAR NOVO CURSO =======");
        System.out.print("Informe o nome do curso: ");
        String nome = sc.nextLine();
        System.out.print("Descrição do curso: ");
        String descricao = sc.nextLine();
        System.out.print("Carga horária: ");
        String cargaHoraria = sc.nextLine();
        int cargaHorariaInt = Integer.parseInt(cargaHoraria);
        String iterador = iteradorNovoCurso.toString();
        String novoCurso = "curso" + iterador;
        Curso curso = new Curso(novoCurso);
        curso.setTitulo(nome);
        curso.setDescricao(descricao);
        curso.setCargaHoraria(cargaHorariaInt);
        cursos.add(curso);
        iteradorNovoCurso++;
        System.out.println("Curso registrado com sucesso.");
        System.out.println();
    }

    public static void novaMentoria() {
        System.out.println();
        System.out.println("======= CADASTRAR NOVA MENTORIA =======");
        System.out.print("Titulo da mentoria: ");
        String titulo = sc.nextLine();
        System.out.print("Descrição da mentoria: ");
        String descricao = sc.nextLine();
        String iterador = iteradorNovaMentoria.toString();
        String novaMentoria = "mentoria" + iterador;
        Mentoria mentoria = new Mentoria(novaMentoria);
        mentoria.setTitulo(titulo);
        mentoria.setDescricao(descricao);
        mentoria.setData(LocalDate.now());
        mentorias.add(mentoria);
        iteradorNovaMentoria++;
        System.out.println("Mentoria registrada com sucesso.");
        System.out.println();
    }

    public static void novoBootcamp() {
        System.out.println();
        System.out.println("======= CADASTRAR NOVO BOOTCAMP =======");
        Bootcamp bootcamp = new Bootcamp();
        System.out.print("Titulo do bootcamp: ");
        String titulo = sc.nextLine();
        System.out.print("Descrição do bootcamp: ");
        String descricao = sc.nextLine();
        bootcamp.setNome(titulo);
        bootcamp.setDescricao(descricao);

        String adicionarNovoCurso = "s";
        while (adicionarNovoCurso.equals("s")) {
            listarCursos();
            System.out.print("Digite o nome do curso a ser inserido: ");
            String nomeCurso = sc.nextLine();
            for (Curso curso : cursos) {
                if (nomeCurso.equals(curso.getTitulo())) {
                    bootcamp.getConteudos().add(curso);
                }
            }
            System.out.println("Deseja adicionar outro curso no bootcamp? s/n");
            adicionarNovoCurso = sc.nextLine().toLowerCase();
        }

        String adicionarMentoriaNoBootcamp = "n";
        System.out.println("Deseja adicionar uma mentoria no bootcamp? s/n");
        adicionarMentoriaNoBootcamp = sc.nextLine().toLowerCase();
        if (adicionarMentoriaNoBootcamp.equals("s")) {
            listarMentorias();
            System.out.print("Digite o título da mentoria a ser inserida: ");
            String tituloMentoria = sc.nextLine();
            for (Mentoria mentoria : mentorias) {
                if (tituloMentoria.equals(mentoria.getTitulo())) {
                    bootcamp.getConteudos().add(mentoria);
                }
            }
        }
        bootcamps.add(bootcamp);

        System.out.println("Bootcamp registrado com sucesso.");
        System.out.println();
    }

    public static void avancarNoBootcamp() {
        System.out.println();
        System.out.println("======= AVANÇAR BOOTCAMP =======");
        devLogado.progredir();
        System.out.println("Conteudos Inscritos" + devLogado.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devLogado.getConteudosConcluidos());
        System.out.println("XP:" + devLogado.calcularTotalXp());
        System.out.println();
    }

    public static void listarDevs() {
        System.out.println();
        System.out.println("======= DEVS CADASTRADOS =======");
        int indice = 1;
        if (devs.isEmpty()) {
            System.out.println("Nenhum dev cadastrado.");
        } else {
            for (Dev dev : devs) {
                System.out.println(indice + ". " + dev.getNome());
                indice++;
            }
        }
        System.out.println();
    }

    public static void listarCursos() {
        System.out.println();
        System.out.println("======= CURSOS CADASTRADOS =======");
        int indice = 1;
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        } else {
            for (Curso curso : cursos) {
                System.out.println(
                        indice + ". " + curso.getTitulo() + " - " + curso.getDescricao() + " - "
                                + curso.getCargaHoraria());
                indice++;
            }
        }
        System.out.println();
    }

    public static void listarMentorias() {
        System.out.println();
        System.out.println("======= MENTORIAS CADASTRADAS =======");
        int indice = 1;
        if (mentorias.isEmpty()) {
            System.out.println("Nenhuma mentoria cadastrada.");
        } else {
            for (Mentoria mentoria : mentorias) {
                System.out.println(
                        indice + ". " + mentoria.getTitulo() + " - " + mentoria.getDescricao() + " - "
                                + mentoria.getData());
                indice++;
            }
        }
        System.out.println();
    }

    public static void listarBootcamps() {
        System.out.println();
        System.out.println("======= BOOTCAMPS CADASTRADOS =======");
        int indice = 1;
        if (bootcamps.isEmpty()) {
            System.out.println("Nenhum bootcamp cadastrado.");
        } else {
            for (Bootcamp bootcamp : bootcamps) {
                System.out.println(
                        indice + ". " + bootcamp.getNome()
                                + " - " + bootcamp.getDescricao()
                                + " - " + bootcamp.getConteudos());
                System.out.println("  Inicio: " + bootcamp.getDataInicial() + "- Final: " + bootcamp.getDataFinal());
                indice++;
            }
        }
        System.out.println();
    }

    public static void trocarUsuario() {
        System.out.println();
        System.out.println("======= TROCAR USUÁRIO =======");
        listarDevs();
        System.out.println("Informe o nome de usuario: ");
        String nomeUsuario = sc.nextLine();
        for (Dev dev : devs) {
            if (nomeUsuario.equals(dev.getNome())) {
                devLogado = dev;
                System.out.println("Login do dev " + devLogado.getNome() + " realizado com sucesso.");
            }
        }
        System.out.println();
    }

    public static void consultarLogin() {
        System.out.println();
        System.out.println("======= CONSULTAR LOGIN =======");
        System.out.println("O sistema está logado com o dev " + devLogado.getNome());
        System.out.println();
    }

    public static void inscricaoBootcamp() {
        System.out.println();
        System.out.println("======= INSCRIÇÃO BOOTCAMP =======");
        listarBootcamps();
        System.out.print("Em qual bootcamp deseja se cadastrar? ");
        String bootcamp = sc.nextLine();
        for (Bootcamp bcamp : bootcamps) {
            if (bootcamp.equals(bcamp.getNome())) {
                devLogado.inscreverBootcamp(bcamp);
                System.out.println(devLogado.getNome() + " inscrito com sucesso no bootcamp " + bcamp.getNome());
            }
        }
        System.out.println();
    }
}