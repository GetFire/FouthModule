package HomeWork;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank(1001,"Ukraine",Curr.EUR,12,1222,3455555);
        int commission=usBank.getCommission(950);
        System.out.println("Commission = "+commission);


    }
}
