public abstract class Forme {
    private String nome;

    public Forme(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public abstract void calcolaArea();
}
