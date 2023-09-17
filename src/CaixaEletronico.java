public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.50;
        double valorSolicitado = 5;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
