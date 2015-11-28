package lv.javaguru.junit.workshop.section2_bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/taxCalculator.feature",
                 format = "html:target/cucumber-html-report")
public class TaxCalculatorAcceptanceTest {


}
