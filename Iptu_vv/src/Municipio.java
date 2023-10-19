import java.util.HashMap;
import java.util.Map;

/**
 * Representa um município e suas propriedades.
 */
public class Municipio {
    String Estado;
    double impostoTotal = 0.0;

    Map<String, Imovel> imoveis = new HashMap<>();

    /**
     * Construtor para a classe Municipio.
     *
     * @param estado O estado associado ao município.
     */
    public Municipio(String estado) {
        imoveis = new HashMap<>();
        this.Estado = estado;
    }

    /**
     * Adiciona um Imovel (propriedade) aos registros do município.
     *
     * @param imovel O objeto Imovel a ser adicionado.
     */
    public void adicionarImovel(Imovel imovel) {
        imoveis.put(imovel.getMatricula(), imovel);
    }

    /**
     * Obtém o estado associado ao município.
     *
     * @return O nome do estado.
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * Calcula a multa por pagamento em atraso para uma propriedade (Imovel) específica.
     *
     * @param imovel O Imovel para o qual calcular a multa.
     * @return O valor da multa calculada.
     */
    public double calcularMulta(Imovel imovel) {
        imovel.mesesAtraso = imovel.getMesesAtraso();

        if (imovel.mesesAtraso >= 0 && imovel.mesesAtraso <= 5) {
            impostoTotal = imovel.getImposto() * 1.0 / 100.0;
        } else if (imovel.mesesAtraso >= 6 && imovel.mesesAtraso <= 8) {
            impostoTotal = imovel.getImposto() * 2.3 / 100.0;
        } else if (imovel.mesesAtraso >= 9 && imovel.mesesAtraso <= 10) {
            impostoTotal = imovel.getImposto() * 3.0 / 100.0;
        } else if (imovel.mesesAtraso >= 11 && imovel.mesesAtraso <= 12) {
            impostoTotal = imovel.getImposto() * 5.4 / 100.0;
        } else {
            impostoTotal = imovel.getImposto() * 10.0 / 100.0;
        }

        return impostoTotal;
    }
}
