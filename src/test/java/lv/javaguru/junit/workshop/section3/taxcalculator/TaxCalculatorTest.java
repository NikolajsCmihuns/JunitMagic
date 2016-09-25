package lv.javaguru.junit.workshop.section3.taxcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class TaxCalculatorTest {


    private void checkTax(double income,
                          int year,
                          double taxRate,
                          double expectedTax ){
        TaxRateProvider taxRateProvider = mock(TaxRateProvider.class); // mocking interface
        doReturn(taxRate).when(taxRateProvider).getTaxRate(year); // programming interface behaviour
        TaxCalculator calculator = new TaxCalculator(taxRateProvider);
        double tax = calculator.calculateTax(income, year);
        assertEquals(tax, expectedTax, 0.001);
    }

    private TaxCalculator prepareTaxCalculatorWithMock(double taxRate, int year){
        TaxRateProvider taxRateProvider = mock(TaxRateProvider.class);
        doReturn(taxRate).when(taxRateProvider).getTaxRate(year);
        return new TaxCalculator(taxRateProvider);
    }


    @Test
    public void taxShouldBe18PercentWhenYearIs2009(){
        checkTax(100,2009,0.18, 18.0);
    }

    @Test
    public void taxShouldBe22PercentWhenYearIs2010(){
        checkTax(100,2010,0.22, 22.0);
    }

    @Test
    public void taxShouldBe21PercentWhenYearIs2010(){
        checkTax(100,2011,0.21, 21.0);
    }



























/*    public void whenTaxRateEqual0_25() {

        TaxRateProvider taxRateProvider = mock(TaxRateProvider.class);
        doReturn(0.25).when(taxRateProvider).getTaxRate();

        assertEquals(taxRateProvider.getTaxRate(), 0.25, 0.001);

        TaxCalculator taxCalculator = new TaxCalculator(taxRateProvider);

        double tax = taxCalculator.calculateTax(10000.0);
        assertEquals(tax, 2500.0, 0.001);*/

}