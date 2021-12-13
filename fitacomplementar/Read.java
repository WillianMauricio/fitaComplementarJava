package fitacomplementar;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read {
    
    private static char[] content;
    
    private static final String filename = "src/Dengue.txt";
    
    public static char[] getContent() {
        if (Read.content == null) {
            try {
                Read.content = Read.readContent();
            } catch (IOException ex) { }
        }
        return Read.content;
    }
    
    private static char[] readContent() throws IOException {
        return new String(Files.readAllBytes(Paths.get(Read.filename)), StandardCharsets.UTF_8).toCharArray();
    }
       
    
}
    

