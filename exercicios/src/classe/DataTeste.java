package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 25;
        d1.mes = 12;
        d1.ano = 2021;

        var d2 = new Data();
        d2.dia = 01;
        d2.mes = 01;
        d2.ano = 2022;

        System.out.printf("Natal é no dia %d de %d de %d e o ano novo no dia %d de %d de %d", d1.dia, d1.mes, d1.ano, d2.dia, d2.mes, d2.ano);
    }
}
