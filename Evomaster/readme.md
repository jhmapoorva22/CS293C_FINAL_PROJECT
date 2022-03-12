- EvoMaster (www.evomaster.org) is the first (2016) open-source AI-driven tool that automatically generates system-level test cases for web/enterprise applications in a white-box setting.
- Evomaster provides installers for the main operating systems: Windows (.msi), OSX (.dmg) and Linux (.deb) and alslo provides an uber-fat JAR file. For the scope of this project, we mainly made use of the v1.4.0 jar file provided in the releases https://github.com/EMResearch/EvoMaster/releases
- For using EvoMaster for whitebox testing, we wrote a driver manually for RESTCountries API. 
- Once the RESTCountries application is started, it was hosted locally on the 8080 port and then we ran the driver written by us. We then ran the evomaster.jar file from the terminal by specifying the output path where the test cases will be generated. 
- This repo presents the testcases generated and the status codes returned by EvoMaster upon varying the "maxTime" parameter.

