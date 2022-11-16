public class PiscinaTotal {
    public static void main(String[] args) {
        double dimensao1 = 10;
        double dimensao2 = 20;
        double dimensao3 = 1.8;
        double resultado = dimensao1 * dimensao2 * dimensao3;

        System.out.println("As dimensões da piscina são " + dimensao1 + "m" + " x " + dimensao2 + "m" + " x " + dimensao3 + "m");
        System.out.println("Essa piscina comporta " + resultado + " litros de água.");

        // EXTRA

        double dimensao4 = 10;
        double dimensao5 = 20;
        double dimensoes = dimensao4 * dimensao5;
        double profundidadeI = 1.2;
        double profundidadeF = 1.8;

        double profundidadeM = (profundidadeI + profundidadeF) / 2;

        double resultadoF = dimensoes * profundidadeM;
        System.out.println(resultadoF);

    }
}
