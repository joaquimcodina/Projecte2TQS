package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/menu.feature", glue="steps")
public class RunMenuTest extends AbstractTestNGCucumberTests {}
