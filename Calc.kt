import kotlin.math.pow

fun main() {
    println("Seja bem vind@ a minha calculadora:\nInsira as contas completas e espaçadas ex: '5 + 4'");

    while(true){
        val input = readln().split(" ");

        if(input[0] == "-->"){
            println("Saindo...");
            break;
        }

        val txt_size = input[0].length + input[1].length + input[2].length + 2;

        val n1 = input[0].toDouble();
        var oper = input[1];
        val n2 = input[2].toDouble();

        var res: Double;
        res = 0.0;
        when (oper){
            "+" -> res = n1 + n2;
            "-" -> res = n1 - n2;
            "*" -> res = n1 * n2;
            "/" -> res = n1 / n2;
            "^" -> res = n1.pow(n2);
        }

        print("\u001B[1A\u001B[${txt_size}C = $res\n");
    }
}