//272828
import java.util.Scanner;
public class Car {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double car_price, downpayment, loan_period, rate, total_interest, monthly_repayment; //decleration

        System.out.printf("%35s", "Welcome ^-^" +"\n");   //user friendly
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");

        System.out.print("\t\t\tPlease enter Car Price (RM) : ");
        car_price = sc.nextDouble();
        while(car_price<30000) {        // condition
            System.out.print("\n\t\t\tOops!!! Please try again "+"\n");
            System.out.print("\t\t\tPlease enter Car Price (RM) : ");
            car_price = sc.nextDouble();
        }

        System.out.print("\t\t\tPlease enter Down Payment (RM) : ");
        downpayment = sc.nextDouble();
        while(downpayment<0) {
            System.out.print("\n\t\t\tOops!!! Please try again "+"\n");
            System.out.print("\t\t\tPlease enter Down Payment (RM) : ");
            downpayment = sc.nextDouble();
        }

        System.out.print("\t\t\tPlease enter Loan Period (Years) : ");
        loan_period = sc.nextDouble();
        while(loan_period<5 || loan_period>9) {
            System.out.print("\n\t\t\tOops!!! Please try again "+"\n");
            System.out.print("\t\t\tPlease enter Loan Period (Years) : ");
            loan_period = sc.nextDouble();
        }

        System.out.print("\t\t\tPlease enter Interest Rate (%) : ");
        rate = sc.nextDouble();
        while(rate<3 || rate>7) {
            System.out.print("\n\t\t\tOops!!! Please try again "+"\n");
            System.out.print("\t\t\tPlease enter Interest Rate (%) : ");
            rate = sc.nextDouble();
        }

        total_interest = (car_price-downpayment)*loan_period*(rate/100);
        monthly_repayment = (car_price-downpayment+total_interest)/(loan_period*12);
        System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.print("\n" +"\t\t\t\t  Monthly Repayment");  //output
        System.out.printf("\n"+"\t\t\t\t\tRM %,.2f", +monthly_repayment); //output

        int years;  double principal ,interest ,balance;  //decleration
        int i=0;  //initialize
        System.out.printf("\n\n%6S%19s%19s%19s", "YEARS", "PRINCIPAL", "INTEREST", "BALANCE");

        while(i<loan_period){
            years=i+1;
            principal = monthly_repayment*12*(years);
            interest = (car_price-downpayment)*(rate/100)*years;
            balance = (monthly_repayment*loan_period*12)-principal;
            System.out.printf("\n%4d%,21.2f%,19.2f%,19.2f", years, principal , interest , balance);
            i=i+1;
        }
        System.out.print("\n\n----------------------------------------------------------------");
        System.out.printf("\n %32s", "Thank You ^-^");
    }
}

