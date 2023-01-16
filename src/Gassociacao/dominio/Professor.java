package Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("------------");
        System.out.println("Professor "+ this.nome);
        if (this.seminarios == null) return;
        System.out.println("--- SEMINARIOS CADASTRADOS ----");
        for (Seminario seminario : seminarios) {
            System.out.println("nome: "+ seminario.getTitulo());
            System.out.println("Local: " +seminario.getLocal().getEndereco() );
            System.out.println("--- Alunos ---");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno "+aluno.getNome()+" Idade: "+aluno.getIdade());
            }


        }


    }



    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
