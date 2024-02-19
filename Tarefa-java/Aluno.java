public class Aluno{
    private String nome;
    private String fone;
    private String matéria;
    
    public Aluno(String nome, String fone, String matéria){
        this.nome = nome;
        this.fone = fone;
        this.matéria = matéria;
    }
    public String getTitulo(){
        return "Aluno: " + nome;
    }
    public String getMatéria(){
        return "Olá, estou estudando:" + matéria;
    }
    public static void main(String[] args) {
    Aluno aluno = new Aluno("Varlen", "85 998416052", "Geografia");
    System.out.println(aluno.getTitulo());
    System.out.println("nome: " + aluno.nome);
    System.out.println("Telefone" + aluno.fone);
    System.out.println();
    System.out.println("Olá, estou estudando" + aluno.getMatéria());
    }
}