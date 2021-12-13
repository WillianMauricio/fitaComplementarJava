package fitacomplementar;

public class Main {

    public static void main(String[] args) {
        GerarFita gf = new GerarFita();
        long tempoInicio = System.currentTimeMillis();
        gf.getFitaComplementar(0, Read.getContent().length);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo Serial: " + (tempoFinal - tempoInicio) + " milisegundos");
    }
}
