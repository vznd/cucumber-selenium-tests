# Cucumber Selenium Tests

[![CircleCI](https://circleci.com/bb/den44/cucumber-selenium-tests/tree/master.svg?style=shield&circle-token=f6217eda3abbfa6fc66c5a5c7ad9c50124d55a0e)](https://circleci.com/bb/den44/cucumber-selenium-tests/tree/master)

This repository includes cucumber selenium tests examples using [wikipedia.org](https://www.wikipedia.org/).

## Run tests

To run tests on your local machine, you need to do the following steps:  
1) Create the following folder structure on your PC `/tmp/chromedriver`  
2) Check your local Chrome browser version and download corresponding chromedriver on your local machine. You can use an official Chrome [web page](https://chromedriver.storage.googleapis.com/index.html).  
3) Unzip downloaded archive, e.g. `chromedriver_mac64.zip`  
4) Put the unarchived file to the created folder on the 1st step, so you have your driver under the following location: `/tmp/chromedriver`  
5) Clone this repository  
6) Run `mvn test`