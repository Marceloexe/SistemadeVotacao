package atv_avaliativa;
import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, nulo = 0, branco = 0;  
        Scanner leitor = new Scanner(System.in);
        int voto  = -1;
        while (voto !=0) {
            System.out.println("========================================");
            System.out.println("= Ola, bem vindo ao sitema de votacao! =");
            System.out.println("========================================");
            System.out.println("= 1 para candidato 1                   =");
            System.out.println("= 2 para candidato 2                   =");
            System.out.println("= 3 para candidato 3                   =");
            System.out.println("= 4 para nulo                          =");
            System.out.println("= 5 para branco                        =");
            System.out.println("= 0 para sair                          =");
            System.out.println("========================================");
            
            System.out.println("Digite para quem deseja votar: ");
            voto = leitor.nextInt();
            
            while (voto < 0 || voto > 5) {
                System.out.println("Opcao invalida! Digite um numero entre 1 e 5 (ou 0 para sair).");
                System.out.print("Digite para quem deseja votar: ");
                voto = leitor.nextInt();
            }
            
            if (voto == 0) {
                System.out.println("Encerrando a votacao e saindo do sistema...");
                // break;
            }
            
            if (voto == 1) {
                System.out.println("Voce votou no candidato 1!");
                candidato1++;
            } 
            else if (voto == 2) {
                System.out.println("Voce votou no candidato 2!");
                candidato2++;    
            } 
            else if (voto == 3) {
                System.out.println("Voce votou no candidato 3!");
                candidato3++;    
            }
            else if (voto == 4) {
                System.out.println("Voce votou nulo!");
                nulo++;    
            }
            else if (voto == 5) {
                System.out.println("Voce votou em branco!");
                branco++;    
            }
            
            System.out.println("Voto validado e registrado com sucesso!\n");
            
        }
        
        int total = candidato1 + candidato2 + candidato3 + nulo + branco;
        
        System.out.println("\n======= RESULTADO DA VOTACAO =======");
        System.out.println("Candidato 1: " + candidato1 + " voto(s)");
        System.out.println("Candidato 2: " + candidato2 + " voto(s)");
        System.out.println("Candidato 3: " + candidato3 + " voto(s)");
        System.out.println("Votos Nulos: " + nulo + " voto(s)");
        System.out.println("Votos em Branco: " + branco + " voto(s)");
        System.out.println("Total de votos: " + total + "voto(s)" );
        System.out.println("====================================");
        
        leitor.close();
    }
} 