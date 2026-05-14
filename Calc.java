//foi o gemin

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vind@ a minha calculadora:");
        System.out.println("Insira as contas completas e espaçadas (ex: '5 + 4') ou '--> ' para sair:");

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.equals("-->")) {
                break;
            }

            String[] partes = entrada.split(" ");

            if (partes.length < 3) {
                System.out.println("Erro: Formato inválido. Use 'n1 op n2'");
                continue;
            }

            try {
                double n1 = Double.parseDouble(partes[0]);
                String opt = partes[1];
                double n2 = Double.parseDouble(partes[2]);
                double res = 0;
                boolean erro = false;

                switch (opt) {
                    case "+": 
                        res = n1 + n2; 
                        break;
                    case "-": 
                        res = n1 - n2; 
                        break;
                    case "*": 
                        res = n1 * n2; 
                        break;
                    case "/": 
                        res = n1 / n2; 
                        break;
                    case "^": 
                        res = Math.pow(n1, n2);
                        break;
                    default:
                        erro = true;
                        break;
                }

                if (erro) {
                    System.out.println(" = ERROR");
                } else {
                    System.out.println(" = " + res);
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: Insira números válidos.");
            }
        }

        System.out.println("Saindo...");
        scanner.close();
    }
}