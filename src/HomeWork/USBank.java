package HomeWork;
import java.util.Currency;

public class USBank extends Bank {

    Curr curr = Curr.USD;

public USBank(long id,String bankCountry, Currency currency, int numberOfEmployee, long rating, long totalCapital){
    super(id,bankCountry,currency,numberOfEmployee,rating,totalCapital);
}

    public int getMonthlyRate() {
        int monthlyRate = 0;
        switch (curr) {
            case USD:
                monthlyRate = 1;
                break;
            case EUR:
                monthlyRate = 2;
                break;
        }
        return monthlyRate;
    }

    public int getLimitOfWithdrawal() {
        int LimitOfWithdrawal = 1000;
        switch (curr) {
            case USD:
                LimitOfWithdrawal = 1000;
                break;
            case EUR:
                LimitOfWithdrawal = 1200;
                break;
        }

        return LimitOfWithdrawal;
    }

    public int getLimitOfFunding() {
        int LimitOfFunding;
        if (curr == Curr.EUR) {
            LimitOfFunding = 10000;
        } else {
            System.out.println("Лимит на пополнение отсутствует");
            LimitOfFunding = 1000000000;
        }
        return LimitOfFunding;
    }

    public int getCommission(int summ) {
        int getCommission = 0;
        switch (curr) {
            case USD:
                if (summ < 1000) {
                    getCommission = 5;
                } else if (summ >= 1000) {
                    getCommission = 7;
                }
                break;
            case EUR:
                if (summ < 1000) {
                    getCommission = 6;
                } else if (summ >= 1000) {
                    getCommission = 8;
                }
                break;
        }
        return getCommission;
    }

    public double moneyPaidMontlyForSalary() {
        return 0;
    }


}
