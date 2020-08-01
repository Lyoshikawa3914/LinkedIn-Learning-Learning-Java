import java.util.Scanner;

    public class function_practice {
        public static double calcTotalMealPrice(double listedMealPrice,
                                              double tipRate,
                                              double taxRate) {
            double tip = tipRate * listedMealPrice;
            double tax = taxRate * listedMealPrice;
            double result = listedMealPrice + tip + tax;
            return result;

        }

        public static void main(String[] args)  {
            double groupTotalMealPrice = calcTotalMealPrice(100, .2,.08);
            System.out.println(groupTotalMealPrice);

            double individualMealPrice = groupTotalMealPrice / 5;
            System.out.println(individualMealPrice);
        }
}
