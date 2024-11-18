package demo1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class action2 {

	public static void main(String[] args) {

		// select

		WebDriver wd = new ChromeDriver();

		String cw = wd.getWindowHandle();

		wd.get("https://www.jotform.com/42382403598964");

		Actions act = new Actions(wd);

		WebElement w = wd.findElement(By.id("input_3"));

		w.sendKeys("fdfddxcvcv");

		// double click

		act.doubleClick(w).build().perform();

		act.contextClick(w).build().perform();

		wd.findElement(By.id("input_3"));

	}

}