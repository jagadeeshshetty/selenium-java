package com.jc.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class LaunchCrossBrowser {

  public static void main(String[] args) {
    // set up
    String browser = "ie";
    WebDriver driver;

    switch (browser.toUpperCase()) {
      case "EDGE":
        driver = new EdgeDriver();
        break;
      case "SAFARI":
        driver = new SafariDriver();
      case "OPERA":
        driver = (WebDriver) new OperaDriverManager();
      case "FF":
        driver = new FirefoxDriver();
        break;
      case "IE":
        driver = new InternetExplorerDriver();
        break;
      default:
        driver = new ChromeDriver();
        break;
    }

    driver.navigate().to("http://www.amazon.in");
    String title = driver.getTitle();
    System.out.println("Title: " + title);

    // tear down
    driver.quit();
  }
}
