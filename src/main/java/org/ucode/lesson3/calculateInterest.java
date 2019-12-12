package org.ucode.lesson3;
// using for statement, calling the calculateInterest method with the amonut of
//10000 with an interestRate of 1, 2,3,4,5,6,7,8,9,10
public class calculateInterest {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            System.out.println(" 10,000 at " + i + "%interest =" + calculateInterest(10000,i) );
        }
    }
 public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
 }
}
