
public class Main {
    public static void main(String[] args) {

        Municipio municipio = new Municipio("Espirito santo");
        Imovel imovel1 = new Imovel("joao", 900, 14, "10vv");

        municipio.adicionarImovel(imovel1);
        double multa = municipio.calcularMulta(imovel1);

        System.out.println("O municipe " + imovel1.getNome() + " do estado " + municipio.getEstado() + " tem o imposto de "+imovel1.getImposto()+ " com " +imovel1.getMesesAtraso()+ " de atraso!!");
        System.out.println("O valor da multa é: " + "R$" + municipio.impostoTotal);
    }
}