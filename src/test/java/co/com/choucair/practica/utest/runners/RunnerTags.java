package co.com.choucair.practica.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/utest.feature",
        tags = "@stories",
        glue = "co.com.choucair.practica.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
