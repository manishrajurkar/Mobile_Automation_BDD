package com.testautomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        monochrome = true,
        plugin = {
                "pretty",
                "html:reports/cucumber",
                "json:reports/report.json",
                "junit:reports/Cucumber.xml",
                "junit:reports/Cucumber.html"
        },
        tags = "@sk",
        features = "src/test/resources/features",
        glue = {"com.testautomation.steps"})
public class CalculatorRunner {
}
