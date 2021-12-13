package fitacomplementar;

public class GerarFita {
    
    static char[] fita = new char[Read.getContent().length];

    public synchronized void getFitaComplementar(int posInicio, int posFinal) {
        char[] dna = Read.getContent();

        try {
            for (int i = posInicio; i < posFinal; i++) {
                switch (Character.toUpperCase(dna[i])) {
                    case 'A' : 
                        this.fita[i] = 'T';
                        break;
                    case 'T' : 
                        this.fita[i] = 'A';
                        break;
                    case 'C' : 
                        this.fita[i] = 'G';
                        break;                
                    case 'G' :
                        this.fita[i] = 'C';
                        break;                
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {}
        
    }
}
