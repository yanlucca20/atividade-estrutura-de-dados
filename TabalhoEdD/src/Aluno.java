public class Aluno {

    private String nome;
    private int ra;
    private int idade;
    private String sexo;
    private double media;
    private String resultado;

    public Aluno(String nome, int ra, int idade, String sexo, double media) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;

        definirResultado();
    }

    private void definirResultado() {
        if (media >= 6.0) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public double getMedia() {
        return media;
    }

    public String getResultado() {
        return resultado;
    }

    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.printf("Media: %.1f%n", media);
        System.out.println("Resultado: " + resultado);
    }
}