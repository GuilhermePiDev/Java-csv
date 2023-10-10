import java.io.*;

public class Ex4 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\TecDevNoite\\Documents\\exemplo3.txt";
        String nomes[] = new String[] {"Gui","Davi", "Anthony"};

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(filePath, true))){

            for(String line : nomes){
                buffer.write(line);
                buffer.newLine();
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        String teste = "Guilherme,2,5";
        String [] dados = teste.split(",");

        for (int i = 0; i < dados.length ; i++) {
            System.out.println(dados[i] );

        }
    }
    }


