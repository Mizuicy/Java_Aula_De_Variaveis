public class CinemaPessoa {
    public static void main(String[] args) {
        int fileiras = 10;
        int cadeiras = 8;
        int resultado = fileiras * cadeiras;
        int reservado = 10;
        int totalReservado = (resultado * reservado) / 100;

        System.out.println("A sala de cinema tem " + fileiras + " fileiras e " + cadeiras + " cadeiras em cada.");
        System.out.println("A capacidade dessa sala é de " + resultado + " pessoas.");

        System.out.println("Total reservado é " + totalReservado);

    }
}
