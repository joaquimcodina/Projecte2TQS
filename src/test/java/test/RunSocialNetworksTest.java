package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/socialnetworks.feature", glue="steps")
public class RunSocialNetworksTest extends AbstractTestNGCucumberTests {}