# Cucumber Selenium Tests

[![CircleCI](https://circleci.com/bb/den44/cucumber-selenium-tests.svg?style=shield&circle-token=a9b5f1d75ac80b6b2c919b9dfafbc00806754b91)](https://app.circleci.com/pipelines/bitbucket/den44/cucumber-selenium-tests?branch=master&filter=all)

This repository includes cucumber selenium tests examples using [wikipedia.org](https://www.wikipedia.org/).

## Run tests

To run tests on your local machine, you need to do the following steps:  
1) Create the following folder structure on your PC `/tmp/chromedriver`  
2) Check your local Chrome browser version and download corresponding chromedriver on your local machine. You can use an official Chrome [web page](https://chromedriver.storage.googleapis.com/index.html).  
3) Unzip downloaded archive, e.g. `chromedriver_mac64.zip`  
4) Put the unarchived file to the created folder on the 1st step, so you have your driver under the following location: `/tmp/chromedriver`  
5) Clone this repository  
6) Run `mvn test`