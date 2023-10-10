import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Ex1 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\TecDevNoite\\Documents\\exemplo.txt");
        Scanner sca = null;
        try {
            sca = new Scanner(file);
            while (sca.hasNextLine()) {
                System.out.println(sca.nextLine());
            }
        }
            catch(IOException e){
                System.out.println(e.getMessage());

            }
            finally{
                System.out.println("Eu passei aqui ...");
                if (sca != null) {
                    sca.close();
                    System.out.println("Fechei");


                }
            }

        }
    }