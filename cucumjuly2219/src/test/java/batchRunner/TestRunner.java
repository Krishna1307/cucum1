package batchRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber .class)
@CucumberOptions(features="MyDemo_DDC5",glue="Ddc2_mystepdefenitions",tags= {"@regression"},
plugin={"html:target/cucumber-htmlreport.html"})
public class TestRunner {

}
