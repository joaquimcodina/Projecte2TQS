package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/addressbook.feature", glue="steps")
public class RunAddressBookTest extends AbstractTestNGCucumberTests {}