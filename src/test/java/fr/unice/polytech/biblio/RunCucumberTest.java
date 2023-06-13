package fr.unice.polytech.biblio;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}, features = "src/test/resources/features", publish = true)
public class RunCucumberTest { // will run all features found on the classpath
                               // in the same package as this class
}
