package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
  
public class Stream {
  
       /**
        * @param args
        * @throws
        */
       public static void main(String[] args) {
             try {
                    OutputStream esc = new FileOutputStream("/temp/texto.txt");
                    System.out.println("___________Word Pad Lite____________");
                    System.out.println("");
                    System.out.println("Digite o texto que desejar:");
                    @SuppressWarnings("resource")
					String st = new Scanner(System.in).nextLine();
                    System.out.println("_______________end___________________");
                    int i = st.length()-1;
                    int h=i; /*Implementada para fazer a inversão do texto no arquivo*/
                    i=0;
                    while ( i <= h) {
  
                           esc.write(st.charAt(i));
  
                           i++;
                    }
                    esc.close();/*Fechando o arquivo*/
             } catch (IOException e) {
                    e.printStackTrace(); 
             }
  
       }
}