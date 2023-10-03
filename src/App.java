import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      List<String> grupoMasculino = new ArrayList<String>();
      List<String> grupoFeminino = new ArrayList<String>();
      Boolean repetir = true;

      while(repetir == true){
        System.out.println("Digite o nome:");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        System.out.println("Digite o sexo masculino ou feminino:");
        String sexo = s.nextLine();

        if(sexo.equals("masculino")){
          grupoMasculino.add(nome);
        }else if(sexo.equals("feminino")){
          grupoFeminino.add(nome);
        } else{
        System.out.println("Você nao digitou corretamente o sexo.");
        break;
        }

        System.out.println("Deseja inserir mais pessoas? Digite 'sim' para continuar e 'nao' para cancelar");
         String resposta = s.nextLine();

         if(resposta.equals("sim")){
          repetir = true;
         }else if(resposta.equals("nao")){
          System.out.println("Lista dos nomes do grupo masculino:");
          System.out.println(grupoMasculino);
          System.out.println("Lista dos nomes do grupo feminino:");
          System.out.println(grupoFeminino);
          repetir = false;
         }else{
           System.out.println("Você não digitou corretamente a respota sim ou nao.");
           break;
         }
      }
    }
}
