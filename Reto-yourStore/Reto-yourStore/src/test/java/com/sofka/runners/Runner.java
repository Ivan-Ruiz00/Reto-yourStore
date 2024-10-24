package com.sofka.runners;
import com.sofka.utils.BeforeSuite;
import com.sofka.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;
@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.sofka.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/");
    }
}
