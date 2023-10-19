
/**
 * Classe que contém o método principal para demonstrar o cálculo de multa de um imóvel em um município.
 */
public class Main {
    public static void main(String[] args) {

        // Cria um objeto de Município com o estado "Espirito Santo".
        Municipio municipio = new Municipio("Espirito Santo");

        // Cria um objeto de Imóvel com nome "João", imposto de R$ 900, 14 meses de atraso e matrícula "10vv".
        Imovel imovel1 = new Imovel("João", 900, 14, "10vv");

        // Adiciona o imóvel ao município.
        municipio.adicionarImovel(imovel1);

        // Calcula a multa do imóvel.
        double multa = municipio.calcularMulta(imovel1);

        // Exibe informações sobre o imóvel e a multa.
        System.out.println("O munícipe " + imovel1.getNome() + " do estado " + municipio.getEstado() + " tem o imposto de R$" + imovel1.getImposto() + " com " + imovel1.getMesesAtraso() + " meses de atraso!!");
        System.out.println("O valor da multa é: R$" + municipio.impostoTotal);
    }
}
