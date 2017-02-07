var webdriver = require('selenium-webdriver'),
    By = require('selenium-webdriver').By,
    until = require('selenium-webdriver').until;

var driver = new webdriver.Builder().forBrowser('chrome').build();

driver.get('http://localhost:3000');
driver.findElement(By.id('text')).sendKeys('welcome to solutionsiq');
driver.findElement(By.id('click')).click();
driver.quit();

/*'use strcit';
var expect = require('chai').expect;
var request = require("request"),
    assert = require('assert'),
    server = require("../server.js"),
    base_url = "http://localhost:3000/";

describe("idea keeper application servers", function() {
  describe("GET /", function() {
    it("status code 200", function(done) {
      request.get(base_url, function(error, response, body) {
        assert.equal(200, response.statusCode);
        done();
      });
    });
*/

/*
var webdriver = require('selenium-webdriver');
var browser = new webdriver.Builder().usingServer().withCapabilities({'browserName': 'chrome' }).build();
 
browser.get('http://en.wikipedia.org/wiki/Wiki');
browser.findElements(webdriver.By.css('[href^="/wiki/"]')).then(function(links){
    console.log('Found', links.length, 'Wiki links.' )
    browser.quit();
});
*/

/*
var webdriver = require('selenium-webdriver');
var browser = new webdriver.Builder().usingServer().withCapabilities({'browserName': 'chrome' }).build();

//var webdriver = require('selenium-webdriver');
//var By = webdriver.By;
//var driver = new webdriver.Builder().forBrowser('chrome').build();


browser.get('http://localhost:3000');
driver.findElement(By.name('idea')).sendKeys('webdriver');

browser.quit();
console.log('sucess');
*/






























