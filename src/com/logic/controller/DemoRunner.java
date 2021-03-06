package com.logic.controller;

/**
 * Will be replaced by an endpoint. 
 * Need the pattern strategy.
 *
 */
public class DemoRunner {

	public static void main(String[] args) {

		Patterns currentPattern = Patterns.VISITOR;
		try {
			PatternExampleRunner.PatternExampleRunnerHolder.getInstance()
			.runPatternExample(currentPattern);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		/*
		 * String exampleName = "Example JSON"; Demo example;
		 *
		 * switch (exampleName) { case "Example JSON": example = new
		 * ExampleJson(); example.run(); break;
		 *
		 * default: }
		 *
		 * System.out.println("Execution is completed.");
		 */
	}
}
