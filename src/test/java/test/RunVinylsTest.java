package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/vinyls.feature", glue="steps")
public class RunVinylsTest extends AbstractTestNGCucumberTests {}