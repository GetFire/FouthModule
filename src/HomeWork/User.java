package HomeWork;


public class User {
    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String  companyName;
    private int salary;
    private  Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }



    @Override
    public String toString(){
     return "name "+name+"\n"+"companyName "+companyName+"\n"+"balance "+balance+"\n"+"salary "+salary+"\n"+"Bank "+bank.getCurrency();
    }

   //public String toString(long id,String name,double balance, int monthsOfEmployment, String companyName,int salary,Bank bank){
   //   System.out.println("id "+id);
   //    System.out.println("name "+name);
   //    System.out.println("balance "+ balance);
   //    System.out.println("nmonthsOfEmployment "+monthsOfEmployment);
   //    System.out.println("companyName "+companyName);
   //    System.out.println("salary "+salary);
   //    System.out.println("bank "+bank.getBankCountry());
   //    return companyName;

    //}

    // Для примера
//--------------------------------------------------------------------------------------------------------------------------

 public static void main(String[] args) {
     Bank dbank= new USBank(1001,"USA",Curr.USD,25,20001,250000);
     User user= new User(1166,"Harry",1500.4,25,"Coca-Cola",2000,dbank);
     user.id=1000;
     user.name="Петя";
     System.out.println(user.toString());
     System.out.println(user.id);
 }
}
