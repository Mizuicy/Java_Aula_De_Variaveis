public class RealDolar {
    public static void main(String[] args) {
        double valor = 10.0;
        double dolar = 0.19 * valor;
        double euro = 0.19 * valor;
        double libras = 0.16 * valor;
        double pesos = 30.45 * valor;
        double coroas = 4.60 * valor;

        System.out.println("valor recebido " + valor + "reais");
        System.out.println(" - " + dolar + " dólares");
        System.out.println(" - " + euro + " euros");
        System.out.println(" - " + libras + " libras");
        System.out.println(" - " + pesos + " pesos");
        System.out.println(" - " + coroas + " coroas");
    }
}
