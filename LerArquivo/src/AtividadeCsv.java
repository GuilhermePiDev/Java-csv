import java.io.*;

public class AtividadeCsv {

        public static void main(String[] args) {
            String filePath = "C:\\Users\\TecDevNoite\\Documents\\dados.CSV";





            try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
                String line = buffer.readLine();

                String [] dados = filePath.split(",");
                for (int i = 0; i < dados.length; i++) {
                   new ClassCsv()
                    System.out.println(line);
                    line = buffer.readLine();
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }






            try(BufferedWriter buffer = new BufferedWriter(new FileWriter(filePath, true))){


            }catch(IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }




