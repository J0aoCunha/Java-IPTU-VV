# Sistema de Cálculo de Imposto Municipal

Este é um sistema simples de cálculo de imposto municipal em Java. Ele permite que você registre imóveis em um município e calcule multas com base nos meses de atraso no pagamento de impostos.

## Classes

### Imovel

A classe `Imovel` representa um imóvel e possui os seguintes atributos:

- `Nome`: Nome do proprietário do imóvel.
- `Imposto`: Valor do imposto do imóvel.
- `mesesAtraso`: Número de meses em atraso no pagamento do imposto.
- `Matricula`: Número de matrícula do imóvel.

Ela possui métodos para acessar esses atributos.

### Municipio

A classe `Municipio` representa um município e permite:

- Registrar imóveis associados a esse município.
- Calcular a multa com base nos meses de atraso do imposto.

Ela também mantém o valor total de impostos para esse município.

## Exemplo de Uso

No arquivo `Main`, você pode ver um exemplo de uso do sistema. Ele cria um município chamado "Espirito Santo", adiciona um imóvel chamado "joao" com um imposto de 900 reais e 14 meses de atraso. Em seguida, calcula a multa para este imóvel e exibe os resultados.

```java
Municipio municipio = new Municipio("Espirito santo");
Imovel imovel1 = new Imovel("joao", 900, 14, "10vv");

municipio.adicionarImovel(imovel1);
double multa = municipio.calcularMulta(imovel1);

System.out.println("O munícipe " + imovel1.getNome() + " do estado " + municipio.getEstado() + " tem o imposto de " + imovel1.getImposto() + " com " + imovel1.getMesesAtraso() + " de atraso!!");
System.out.println("O valor da multa é: " + "R$" + municipio.impostoTotal);
