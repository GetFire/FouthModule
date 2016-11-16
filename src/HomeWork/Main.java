package HomeWork;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1001,"Ukraine",Curr.EUR,12,1222,3455555);
        Bank dbank= new USBank(1001,"USA",Curr.USD,25,20001,250000);
        User user= new User(1166,"Harry",1500.4,25,"Coca-Cola",2000,dbank);



    }
}
