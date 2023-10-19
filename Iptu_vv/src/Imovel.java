/**
 * Representa uma propriedade imobiliária.
 */
public class Imovel {
    String Nome;
    float Imposto;
    int mesesAtraso;
    String Matricula;

    /**
     * Construtor para a classe Imovel.
     *
     * @param nome          O nome da propriedade.
     * @param imposto       O valor do imposto associado à propriedade.
     * @param mesesAtraso   O número de meses em atraso no pagamento do imposto.
     * @param matricula     A matrícula da propriedade.
     */
    public Imovel(String nome, float imposto, int mesesAtraso, String matricula) {
        this.Imposto = imposto;
        this.mesesAtraso = mesesAtraso;
        this.Matricula = matricula;
        this.Nome = nome;
    }

    /**
     * Obtém o nome da propriedade.
     *
     * @return O nome da propriedade.
     */
    public String getNome() {
        return Nome;
    }

    /**
     * Obtém o valor do imposto associado à propriedade.
     *
     * @return O valor do imposto.
     */
    public float getImposto() {
        return Imposto;
    }

    /**
     * Obtém o número de meses em atraso no pagamento do imposto.
     *
     * @return O número de meses em atraso.
     */
    public int getMesesAtraso() {
        return mesesAtraso;
    }

    /**
     * Obtém a matrícula da propriedade.
     *
     * @return A matrícula da propriedade.
     */
    public String getMatricula() {
        return Matricula;
    }
}
