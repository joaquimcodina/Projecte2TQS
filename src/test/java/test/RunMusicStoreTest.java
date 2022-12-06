package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/musicstore.feature", glue="steps")
public class RunMusicStoreTest extends AbstractTestNGCucumberTests {}