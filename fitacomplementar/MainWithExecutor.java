package fitacomplementar;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainWithExecutor {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        char[] fita = Read.getContent();
        
        final double TAM = fita.length * 0.10;
        
        int threads = (int) (fita.length / TAM);
        
        ExecutorService exec = Executors.newFixedThreadPool(threads);
                
        int inicio = 0;
        long tempoInicio = System.currentTimeMillis();
        for(int i = 0; i < threads; i++){
            exec.execute(new Tarefa(inicio, inicio + (int) TAM));
            inicio += TAM;
        }
        exec.shutdown();
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println("Tempo concorrente: " + (tempoFinal - tempoInicio) + " milisegundos");
    }
   
    public static class Tarefa implements Runnable {

       private final int posInicio;
       private final int posFinal;
            
        public Tarefa(int posicaoInicial, int posicaoFinal){
            this.posInicio = posicaoInicial;
            this.posFinal = posicaoFinal;
        }
        
        @Override
        public void run() {
            GerarFita gf = new GerarFita();
            gf.getFitaComplementar(this.posInicio, this.posFinal);
        }
      
    }
    
}



