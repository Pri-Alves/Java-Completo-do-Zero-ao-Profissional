package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2)); //r: á

        String s = "Boa tarde";
        System.out.println(s.concat("!!!")); //r: Boa tarde!!
        System.out.println(s + "!!!"); //r: Boa tarde!!
        System.out.println(s.startsWith("Boa")); //r: true
        System.out.println(s.startsWith("boa")); //r: false
        System.out.println(s.toLowerCase().startsWith("boa")); //r: true
        System.out.println(s.length()); //r: 9
        System.out.println(s.endsWith("tarde")); //r: true
        System.out.println(s.endsWith("Tarde")); //r: false
        System.out.println(s.toUpperCase().endsWith("TARDE")); //r: true
        System.out.println(s.equalsIgnoreCase("boa tarde")); //r: true

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nidade: " + idade + "\nSalario: " + salario + "\n\n");
        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f de salário.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f de salário.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase Qualquer".contains("Qual")); //R: true
        System.out.println("Frase Qualquer".indexOf("Qual")); // r: 6
        System.out.println("Frase Qualquer".substring(6)); //Qualquer
        System.out.println("Frase Qualquer".substring(6, 10)); // Qual
    }
}
