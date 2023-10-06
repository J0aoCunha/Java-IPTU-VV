public class Imovel {
    String Nome;
    float Imposto;
    int mesesAtraso;
    String Matricula;


    public Imovel(String nome, float imposto,int mesesAtraso, String matricula) {
        this.Imposto = imposto;
        this.mesesAtraso = mesesAtraso;
        this.Matricula = matricula;
        this.Nome= nome;
    }


    public String getNome() {
        return Nome;
    }

    public float getImposto(){
        return Imposto;
    }

    public int getMesesAtraso(){
        return mesesAtraso;
    }

    public String getMatricula() {
        return Matricula;
    }
}
