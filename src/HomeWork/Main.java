package HomeWork;

public class Main {
    public static void main(String[] args) {
        //USBank
        //--------------------------------------------------------------------------------
        Bank usBank1 = new USBank(1001, "Ukraine", Curr.USD, 12, 1222, 3455555);
        Bank usBank2 = new USBank(1002, "USA", Curr.USD, 25, 20001, 250000);


        //EUBank
        //--------------------------------------------------------------------------------

        Bank euBank1 = new EUBank(1003, "Montenegro", Curr.EUR, 36, 3365, 45000021);
        Bank euBank2 = new EUBank(1004, "Germany", Curr.EUR, 120, 5000, 999900000);


        //ChinaBank
        //--------------------------------------------------------------------------------

        Bank chBank1 = new ChinaBank(1005, "China", Curr.EUR, 5, 12000, 4500);
        Bank chBank2 = new ChinaBank(1006, "Singapore", Curr.USD, 68, 126, 1000000000);


        //Users
        //--------------------------------------------------------------------------------
        User user1 = new User(1166, "Harry", 1500.4, 25, "Coca-Cola", 2000, usBank1);
        User user2 = new User(6611, "Mark", 32000, 120, "Microsoft", 4000, usBank2);
        User user3 = new User(1661, "Jerry", 500, 1, "Amazon", 1200, euBank1);
        User user4 = new User(6116, "Bobby", 25000, 60, "DHL", 2500, euBank2);
        User user5 = new User(6161, "Melinda", 40000, 35, "Oracle", 5000, chBank1);
        User user6 = new User(1616, "Anna", 4703.5, 2, "UPS", 1500, chBank2);


    }
}
