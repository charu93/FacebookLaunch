package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String mainTitle = driver.getTitle();
		System.out.println("Main Title Page: "+mainTitle);
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Tuna@321");
driver.findElement(By.name("login")).click();
driver.findElement(By.linkText("Find your account and log in.")).click();
String title = driver.getTitle();
System.out.println("Second Title Page: "+title);
if (!title.equals(mainTitle)) {
	
	System.out.println("It is not the correct Login page");
}
else {
	System.out.println("The tile page is matching");
}
	}

}
