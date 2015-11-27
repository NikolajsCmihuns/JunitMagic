package lv.javaguru.junit.workshop.section2;

public class TaxCalculator {

    public double calculateTax(double income, int year) {
        double tax;

        if(year < 2011) {
            tax = 0.18;
        }
        else tax = 0.22;

        return income * tax;
    }

}
