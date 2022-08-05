import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Arquivo {
    public static String Reader(String path){
        String content = "";
        try {
            FileReader file = new FileReader(path);
            BufferedReader fileReader = new BufferedReader(file);
            String line = "";
            try {
                line = fileReader.readLine();
                while(line != null){
                    content += line;
                    line = fileReader.readLine();
                }
                file.close();
            } catch (IOException e) {
                content = "Erro: Não foi possível ler o arquivo.";
            }
        } catch (FileNotFoundException e) {
            content = "Erro: Arquivo não encontrado.";
        }
        if(content.contains("Erro")){
            return "";
        }
        else{
            return content;
        }
    }    
    public static Boolean Writer(String path, String text){
        try {
            FileWriter file = new FileWriter(path);
            PrintWriter fileWriter = new PrintWriter(file);
            fileWriter.println(text);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }

    }
}
