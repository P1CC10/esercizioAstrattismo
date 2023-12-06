public class Triangolo extends Forme {
    private int latoA;
    private int latoB;
    public Triangolo(  int latoA, int latoB,String nome) {
        super(nome);
        this.latoA=latoA;
        this.latoB=latoB;
    }

    public int getLatoA() {
        return latoA;
    }

    public void setLatoA(int latoA) {
        this.latoA = latoA;
    }

    public int getLatoB() {
        return latoB;
    }

    public void setLatoB(int latoB) {
        this.latoB = latoB;
    }

    @Override
    public void calcolaArea(){
        System.out.println("L area del triangolo è =" + getLatoA()*getLatoB() /2);
    }
}
