package br.com.lfchaim.cucumbertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","rerun:target/rerun.txt"}, features = "src/test/resource")
public class RunCukesTest {

}
