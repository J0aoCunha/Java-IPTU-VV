import java.util.HashMap;
import java.util.Map;

public class Municipio {
    String Estado;
    double impostoTotal = 0.0;

    Map<String,Imovel> imoveis = new HashMap<>();
    public Municipio(String estado) {
        imoveis = new HashMap<>();
        this.Estado = estado;
    }

    public void adicionarImovel(Imovel imovel){

        imoveis.put(imovel.getMatricula(), imovel);

    }

    public String getEstado() {
            return Estado;
    }

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

