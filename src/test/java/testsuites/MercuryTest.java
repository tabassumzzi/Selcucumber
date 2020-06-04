package testsuites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features/mercury.feature",glue="steps",
plugin= {"html:target/cucumber-html-report"})

public class MercuryTest extends AbstractTestNGCucumberTests {

}
