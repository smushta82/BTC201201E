package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/smushta/eclipse-workspace/"
		+ "BTC201201E_BDD_Project/Target.Feature"},
tags= {"@smoke"},glue="com.test",plugin= {"pretty","html:reports"})
public class Runner {

}
