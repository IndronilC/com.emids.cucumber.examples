package com.ebay.scenario.based.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
glue = {"com.ebay.scenario.based.steps"},
plugin = {"pretty", "html:testreport"},
dryRun = false,
strict = true,
tags = {"@eBayAdvanceSearchScenarios"})
public class TestRunner {
}
