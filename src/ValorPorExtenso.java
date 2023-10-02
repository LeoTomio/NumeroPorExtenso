import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ValorPorExtenso {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Array com os nomes dos números de 0 a 19
        String[] numerosDe0A19 = {
                "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove",
                "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove"
        };

        // Array com os nomes das dezenas
        String[] dezenas = {
                "", "", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"
        };

        System.out.println("Digite um número entre 0 e 99: ");
        int numero = leitor.nextInt();

        if (numero >= 0  && numero < 99) {
            String numeroPorExtenso = "";

            if (numero < 20) {
                // Se o número for menor que 20, use o array de 0 a 19
                numeroPorExtenso = numerosDe0A19[numero];
            } else {
                // Para números maiores ou iguais a 20, divida-o em dezenas e unidades
                int dezena = numero / 10;
                int unidade = numero % 10;
                numeroPorExtenso = dezenas[dezena];
                if (unidade > 0) {
                    numeroPorExtenso += " e " + numerosDe0A19[unidade];
                }
            }

            System.out.println("Número por extenso: " + numeroPorExtenso);
        } else {
            System.out.println("Erro: Por favor, insira um número entre 0 e 99.");
        }

        leitor.close();
    }
}