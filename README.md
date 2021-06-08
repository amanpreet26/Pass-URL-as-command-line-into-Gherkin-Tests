# Pass-URL-as-command-line-into-Gherkin-Tests
Instead of using hard coded URL use command line to pass URL to run tests. Selenium-webdriver|Junit|Cucumber

Right click on the project select run as configuration.
Select Java Application, Press the new configuration button to create new Java Application Configuration.
1. Give any name to your Java Applocation say "CommandLineRunner".
2. Browse to your Project location in the Project field.
3. Mention the name of you Runner class along with the package name say "stepdefs.Runner" [stepdefs= package name, Runner= JAVA runner class] in the Main class field.
4. Go to the Arguments tab.
5. Mention the name of the URL say "https://www.google.com" that you want to pass in **Program arguments** field.
6. Click on Apply and Run.
7. Run the test cases again by running the application Java Application as "CommandLineRunner".
