package org.bass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass  {
	
	public static WebDriver dri;
	static WebElement name;

	public static WebDriver lanchbrowser(String browser) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			dri = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dri = new FirefoxDriver();

		} else if (browser.equals("ed")) {
			WebDriverManager.edgedriver().setup();
			dri = new EdgeDriver();

		}
		dri.manage().window().maximize();
		return dri;
	}

	public static void lanchurl(String url) {
		dri.get(url);

	}

	public static  void currenturl() {
		String cr = dri.getCurrentUrl();
		System.out.println(cr);
	}

	public static  void gettitle() {
		String title = dri.getTitle();
		System.out.println(title);
	}

	public static void quit() {
		dri.quit();
	}

	public static void close() {
		dri.close();

	}

	public static void fillbox(WebElement nam,String data) {
		nam.sendKeys(data);

	}

	public static void click(WebElement ref) {
		ref.click();

	}
	public static void date() {
		Date d=new  Date();
		System.out.println(d);

	}

	public static String Fileread(String sheet, int row, int cell) throws IOException {

		File f = new File("C:\\Users\\ayoth\\eclipse-workspace\\MavenPro\\excell\\Book1.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);

		Sheet sh = book.getSheet(sheet);

		Row r = sh.getRow(row);

		Cell c = r.getCell(cell);

		int type = c.getCellType();

		String name = "";

		if (type == 1) {
			name = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("mmm/dd/yyyy");
			name = sim.format(dd);

		} else {
			double di = c.getNumericCellValue();
			long l = (long) di;
			name = String.valueOf(l);

		}

		return name;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
