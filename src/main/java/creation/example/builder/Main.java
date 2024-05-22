package creation.example.builder;

public class Main {
    public static void main(String[] args) {

        //Coffee coffeelatte = new Coffee();//PRIVAT => NU PUTEM ACCESA DAR ASTA AM VRUT
        Coffee latte = new Coffee.CoffeeBuilder().setCoffeeType("Latte")
                            .setSugar(true).build();
        //putem apela metodele una dupa cealalta deoarece avem get set in metoda si apelam urmatoarea metoda pe obiect

        System.out.println(latte);

    }
}
