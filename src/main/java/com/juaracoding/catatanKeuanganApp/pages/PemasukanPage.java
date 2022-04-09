package com.juaracoding.catatanKeuanganApp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PemasukanPage {

AndroidDriver<MobileElement> driver;
	
	public PemasukanPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By permission1 = By.id("com.android.packageinstaller:id/permission_allow_button");
	By permission2 = By.id("//android:id/button2");
	By btnAdd = By.id("com.chad.financialrecord:id/fabMenu");
	
	
	
	public void AddNewPemasukan() {
		driver.findElement(permission1).click();
		tunggu(1);
		driver.findElement(permission2).click();
		
	}
	
	public void tunggu(int detik) {
		try {
			Thread.sleep(detik*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
