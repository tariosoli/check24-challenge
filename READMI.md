#### To run tests locally

* Install Selenium standalone to run local grid [WebDriver](http://www.seleniumhq.org/projects/webdriver/)
* Install [chrome driver](http://chromedriver.chromium.org/downloads)
* Install [firefox driver](https://github.com/mozilla/geckodriver/releases)
* Go to the folder with selenium installed and run the command `java -Dwebdriver.chrome.driver={chromedriver} -Dwebdriver.gecko.driver={geckodriver} -jar {selemium}`
changing names of drivers and selenium standalone accordingly
* Run tests from the console with comand `mvn clean test`