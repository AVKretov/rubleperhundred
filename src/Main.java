public class Main {
    public static void main(String[] args) {

        int account = 100;
        int depositValue = 2456;

        int finalValue = depositValue > 1000 ? depositValue/100 + depositValue +account : depositValue + account;

        System.out.println("На вашем счету "+ finalValue + " рублей");

    }
}