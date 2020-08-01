//using built in functions of java ex. Math

public class Funcitons {

    public static double employeeGrossSalary(double hoursPerWeek,
                                             double moneyPerHour,
                                             int vacationDays) {
        if(hoursPerWeek < 0) {
            return -1;
        }

        if(moneyPerHour < 0) {
            return -1;
        }
        double employeeTotal = hoursPerWeek * moneyPerHour;
        double unpaidTime = vacationDays * moneyPerHour * 8;
        return (employeeTotal * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        double result = Math.pow(2, 5);
        //System.out.println(result);

        double total = employeeGrossSalary(40, 15, 8);
        System.out.println(total);



    }
}
