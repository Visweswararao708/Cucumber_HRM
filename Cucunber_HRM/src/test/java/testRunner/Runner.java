package testRunner;

import javax.swing.AbstractAction;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true,tags = ("@positiveData"),glue = {"stepDefinations"})
public class Runner extends AbstractTestNGCucumberTests {

}