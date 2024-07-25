
public class AboutMe {
    public static void main(String[] args) {
        if (args.length > 0) {
            String nome = args[0];
            int idade = Integer.valueOf(args[1]);
            double altura = Double.valueOf(args[2]);
    
    
            System.out.println("Meu nome é " + nome);
            System.out.println("Minha idade é " + idade + " anos");
            System.out.println("E minha altura é " + altura);
        }
        else {
            System.out.println("Nenhum argumento fornecido!");
        }
    }
}
