public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 10;

        if (nota < 6) {
            System.out.println("Reprovado");
        } else if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Em recuperacao");
        }
    }
}
