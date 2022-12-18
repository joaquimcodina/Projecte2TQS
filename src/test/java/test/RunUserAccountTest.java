package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/useraccount.feature", glue="steps")
public class RunUserAccountTest extends AbstractTestNGCucumberTests {}
