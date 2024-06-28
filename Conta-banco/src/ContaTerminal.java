        import java.util.Locale;
        import java.util.Scanner;
    
        public class ContaTerminal 

            public static void main(String[] args) throws Exception {
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  
            System.out.println("Por favor, digite o número da Agência ?");
            String agência = scanner.next();
    
            System.out.println("Digite seu nome ?");
            String nome = scanner.next();

            System.out.println("Digite numero da conta ?");
            int conta = scanner.nextInt();
    
            System.out.println("Saldo da sua conta");
            double saldo = scanner.nextDouble();
    
            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, " + nome + " Obrigado por criar uma conta em nosso banco " +"sua agência é " + agência);
            System.out.println("conta " + conta);
            System.out.println(" e seu saldo " + saldo + " disponivel para saque ");
            scanner.close();
    }
}
