import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Curso> cursos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int op;

        do {
            System.out.println("1 - Inserir Curso");
            System.out.println("2 - Inserir Turma em Curso");
            System.out.println("3 - Remover turma de um Curso");
            System.out.println("4 - Adicionar aluno na turma");
            System.out.println("5 - Adicionar Modalidade na Turma");
            System.out.println("6 - Imprimir 1 Curso");
            System.out.println("7 - Imprimir uma turma");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            op = leitor.nextInt();

            switch (op) {

                case 1: 
                    System.out.println("Digite o endereco do curso: ");
                    String endereco = leitor.next();
                    Curso curso = new Curso(endereco);
                    cursos.add(curso);
                    break;

                case 2:

                    if(cursos.size() == 0){
                        System.out.println("Nenhum curso cadastrado ");
                    }

                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println(i + " - " + cursos.get(i).getEndereco());
                    }
                    System.out.println("Escolha o curso: ");
                    int posicao = leitor.nextInt();
                    if (posicao >= 0 && posicao < cursos.size()) {
                        Turma turma = new Turma();
                        cursos.get(posicao).insereTurma(turma);
                        System.out.println("Turma inserida");
                    } else {
                        System.out.println("Posicao invalida");
                    }
                    break;

                case 3:
                    if(cursos.size() == 0){
                        System.out.println("Nenhum curso cadastrado ");
                    }
                    
                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println(i + " - " + cursos.get(i).getEndereco());
                    }
                    System.out.println("Escolha o curso: ");
                    int p = leitor.nextInt();

                    if(p < 0 || p >= cursos.size()){
                        System.out.println("Posicao invalida");
                        break;
                    }

                    Curso cursoEscolhido = cursos.get(p);

                    if (cursoEscolhido.getTurmas().size() == 0) {
                        System.out.println("Esse curso nao possui turmas cadastradas");
                        break;
                    }

                    System.out.println("Turmas do curso: ");
                    cursoEscolhido.imprimeCurso();

                    System.out.println("Escolha a turma: ");
                    int escolha = leitor.nextInt();

                    cursoEscolhido.excluiTurma(escolha);
                    System.out.println("Turma removida com sucesso!");
                    break;

                case 4:
                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println(i + " - " + cursos.get(i).getEndereco());
                    }

                    System.out.println("Escolha o curso: ");
                    int opCurso = leitor.nextInt();

                    if (opCurso >= 0 && opCurso < cursos.size()) {
                        Curso cEsc = cursos.get(opCurso);

                        for (int i = 0; i < cEsc.getTurmas().size(); i++) {
                            System.out.println(i + " - Turma " + i);
                        }

                        System.out.println("Escolha a turma: ");
                        int idTurma = leitor.nextInt();

                        if (idTurma >= 0 && idTurma < cEsc.getTurmas().size()) {
                            Turma turmaSelecionada = cEsc.getTurmas().get(idTurma);

                            int continuar;
                            do {
                                System.out.println("Preencher Aluno:");

                                System.out.println("Digite o nome do aluno: ");
                                String nome = leitor.next();

                                System.out.println("Digite a matricula: ");
                                int matricula = leitor.nextInt();

                                System.out.println("Digite o CPF: ");
                                String cpf = leitor.next();

                                Aluno aluno = new Aluno(matricula);
                                aluno.setNome(nome);
                                aluno.setCpf(cpf);

                                turmaSelecionada.insereAluno(aluno);

                                System.out.println("Aluno cadastrado:");
                                System.out.println(aluno.retornaAluno());

                                System.out.println("Deseja inserir outro aluno? 1-Sim | 0-Nao");
                                continuar = leitor.nextInt();

                            } while (continuar == 1);

                        } else {
                            System.out.println("Turma invalida!");
                        }

                    } else {
                        System.out.println("Curso invalido!");
                    }

                    break;

                case 5:
                    
                    System.out.println("Adicionando modalidade na turma");

                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println(i + " - " + cursos.get(i).getEndereco());
                    }

                    System.out.println("Escolha o curso: ");
                    int cursoIdx = leitor.nextInt();

                    if (cursoIdx < 0 || cursoIdx >= cursos.size()) {
                        System.out.println("Curso invalido!");
                        break;
                    }

                    Curso cursoSel = cursos.get(cursoIdx);

                    for (int i = 0; i < cursoSel.getTurmas().size(); i++) {
                        System.out.println("Turma " + i);
                    }

                    System.out.println("Escolha a turma: ");
                    int turmaIdx = leitor.nextInt();

                    if (turmaIdx < 0 || turmaIdx >= cursoSel.getTurmas().size()) {
                        System.out.println("Turma invalida!");
                        break;
                    }

                    Turma turmaSel = cursoSel.getTurmas().get(turmaIdx);

                    System.out.println("Qual e a modalidade?");
                    String descricao = leitor.next();

                    System.out.println("Quando inicia? ");
                    int hi = leitor.nextInt();

                    System.out.println("Quando finaliza? ");
                    int hf = leitor.nextInt();

                    System.out.println("Quantidade de vagas: ");
                    int vagas = leitor.nextInt();

                    System.out.println("Nome do professor: ");
                    String nomeProf = leitor.next();

                    System.out.println("Titulacao maxima: ");
                    String titulacao = leitor.next();

                    System.out.println("Graduacao: ");
                    String graduacao = leitor.next();

                    Professor pf = new Professor(nomeProf, titulacao, graduacao);
                    Modalidade mod = new Modalidade(descricao, hi, hf);
                    mod.setQuantVagas(vagas);
                    mod.setProfessor(pf);

                    turmaSel.insereModalidades(mod);

                    System.out.println("Modalidade adicionada com sucesso!");
                    System.out.println(mod.retornaModalidade());

                    break;

                case 6: 
                    System.out.println("Imprimindo um curso");

                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println(i + " - " + cursos.get(i).getEndereco());
                    }

                    System.out.println("Escolha o curso: ");
                    int opcao2 = leitor.nextInt();
                    Curso c = cursos.get(opcao2);
                    System.out.println("\n");

                    c.imprimeCurso();
                    break;

                case 7: 
                    System.out.println("Imprimir turma especifica");

                    if (cursos.size() == 0) {
                        System.out.println("Nenhum curso cadastrado ainda");
                        break;
                    }

                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println(i + " - " + cursos.get(i).getEndereco());
                    }

                    System.out.println("Escolha o curso: ");
                    int indiceCurso = leitor.nextInt();

                    if (indiceCurso < 0 || indiceCurso >= cursos.size()) {
                        System.out.println("Curso invalido!");
                        break;
                    }

                    Curso cursoSelecionado = cursos.get(indiceCurso);

                    if (cursoSelecionado.getTurmas().size() == 0) {
                        System.out.println("Esse curso ainda nao possui turmas cadastradas");
                        break;
                    }

                    for (int i = 0; i < cursoSelecionado.getTurmas().size(); i++) {
                        System.out.println("Turma " + i);
                    }

                    System.out.println("Escolha a turma: ");
                    int indiceTurma = leitor.nextInt();

                    if (indiceTurma < 0 || indiceTurma >= cursoSelecionado.getTurmas().size()) {
                        System.out.println("Turma invalida!");
                        break;
                    }

                    Turma turmaSelecionada2 = cursoSelecionado.getTurmas().get(indiceTurma);
                    turmaSelecionada2.imprimeTurma();
                    break;

                default:
                    break;
            }

        } while(op != 0);

    }

}
