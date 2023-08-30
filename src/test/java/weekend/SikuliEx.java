package weekend;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliEx {

	public static void main(String[] args) throws Throwable {
		Screen sc = new Screen();
		Pattern minimise = new Pattern("C:\\Users\\Dell\\Desktop\\minimise1.png");
		Thread.sleep(2000);
		
		sc.click(minimise);
	}

}
