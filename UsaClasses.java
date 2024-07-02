public class UsaClasses {

    public static void main(String[] args) {

        Pessoa p;
        p = new Pessoa();
        Pessoa p1 = new Pessoa();

        p.nome = "fulano";
        p.idade = 25;
        p.renda = 1000;
        p.cpf = "xxx.xxx.xxx-xx";
        p.nacimento = "dia x no mes x de 2000";
        p.altura = (float) 1.75;
        p.telefone = "(11) 90000-0000";
        p.endereço = "rua do faz de conta";
        p.cep = "xxxxx-xxx";
        p.profissão = "marginal";

        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Renda: " + p.renda);
        System.out.println("CPF é: " + p.cpf);
        System.out.println("Data de nacimento: " + p.nacimento);
        System.out.println("Altura: " + p.altura);
        System.out.println("Telefone: " + p.telefone);
        System.out.println("Endereço: " + p.endereço);
        System.out.println("CEP: " + p.cep);
        System.out.println("Profissão: " + p.profissão);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Renda: " + p1.renda);

    }
    
}