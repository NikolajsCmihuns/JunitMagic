package lv.javaguru.junit.workshop.section3.taxcalculator;

public class TaxCalculator {

    private CurrentYearProvider currentYearProvider;


    public TaxCalculator(CurrentYearProvider currentYearProvider) {
        this.currentYearProvider = currentYearProvider;
    }

    public double calculateTax(double income) {
        // Rule 1: if current year < 2010 then tax = 18%
        // Rule 2: if current year = 2010 then tax = 22%
        // Rule 3: if current year > 2010 then tax = 21%

        // Provide implementation after writing tests!
        return 0;
    }

}
