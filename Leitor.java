import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Leitor {
    public static void main(String[] args) {
        new Leitor().ler();
    }

    private void ler() {
        List<List<String>> regs = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\leona\\Desktop\\java\\livros.csv"));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] lins = linha.split(";");
                regs.add(Arrays.asList(lins));
                System.out.println(lins[0] + "-" + lins[1] + "-" + lins[2]);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado ou erro ao ler o arquivo: " + e.getMessage());
        }
    }
}



































//import java.io.*;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Arrays;
///

//public class Leitor {

////    public static void main(String[] args) {
       // new Leitor().ler();
  //  }
   // private void ler() {
    //    List<List<String>> regs = new ArrayList<>();
    //    try (BufferedReader br = new BufferedReader(new FileReader("livros.csv"))) {
     //       String linha;
      //      while ((linha =br.readLine())!= null) {
      //* */          String [] lins = linha.split(";");
       //         regs.add(Arrays.asList(lins));
        //        System.out.println(lins[0] + "-" + lins[1] + "-" + lins[2]);
        //    }
        //}catch (IOException e) {
         //   System.out.println("Erro de leitura:" + e.getMessage());

     
      //  }
       // }
    //}
