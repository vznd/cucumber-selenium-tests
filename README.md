# Cucumber Selenium Tests

[![Tests](https://github.com/vznd/cucumber-selenium-tests/actions/workflows/maven.yml/badge.svg)](https://github.com/vznd/cucumber-selenium-tests/actions/workflows/maven.yml)
[![CucumberReports: Tests](https://messages.cucumber.io/api/report-collections/6cfcad19-c232-49b3-995c-2e6da7e11c85/badge)](https://reports.cucumber.io/report-collections/6cfcad19-c232-49b3-995c-2e6da7e11c85)

This repository includes cucumber selenium tests examples using [wikipedia.org](https://www.wikipedia.org/).

## Run tests

To run tests on your local machine, you need to do the following steps:  
1. Create the `/tmp/driver/` folders structure
    ```shell
    mkdir -p /tmp/driver
    ```
2. Create environment variable
    ```shell
    export CHROMEDRIVER_FULL_PATH=/tmp/driver/chromedriver
    ```
3. Check your local Chrome browser version and [download](https://chromedriver.storage.googleapis.com/index.html) 
corresponding chromedriver on your local machine  
4. Unzip downloaded archive to aa pre-defined path
    ```shell
    unzip chromedriver_mac64.zip -d /tmp/driver
    ```
5. Add permission to execute the file
    ```shell
    chmod +x /tmp/driver/chromedriver
    ```
6. Clone this repository  
    ```shell
    git clone https://github.com/vznd/cucumber-selenium-tests.git
    ```
7. Run tests
    ```shell
    mvn test
    ```