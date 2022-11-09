public class QuantidadePessoasCinema {
    public static void main(String[] args) {
        int fileira = 10;
        int cadeira = 8;
        int reserva = 10;
        int porcentagem = 100;
        int totalLugares = fileira * cadeira;
        int resultado = (totalLugares * reserva) / porcentagem;

        System.out.println("A sala de cinema tem " + fileira + " fileiras e " + cadeira + " cadeiras em cada." + "\n" + "A capacidade dessa sala é de " + totalLugares + " pessoas, sendo que " + reserva + " lugares são reservados para PCDs.");
        System.out.println("Lugares totais reservados " + resultado);
    }
}
