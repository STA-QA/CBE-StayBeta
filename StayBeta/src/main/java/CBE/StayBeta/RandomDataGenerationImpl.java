package CBE.StayBeta;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;

import Base.BaseUtil;
import stayBetaInterfaces.RandomDataGeneration;


public class RandomDataGenerationImpl extends BaseUtil implements RandomDataGeneration{

	@Override
	public void storeBookingDetails() throws FileNotFoundException, UnsupportedEncodingException {

		 try {
	           // FileWriter writer = new FileWriter("Booking-Details.txt", true);
	            FileWriter writer = new FileWriter("BookingDetails.docx", true);
	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
	            bufferedWriter.newLine();
	            String text = driver.findElement(By.xpath("//div[@id='m_c_C000_m_c_up']/div/div/h4")).getText();
	            Calendar cal = Calendar.getInstance();
	    		SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yy hh:mm");
	    		String BookingDate = format1.format(cal.getTime());
	    		bufferedWriter.write("The Below booking done at : " + BookingDate);
	    		bufferedWriter.newLine();
	            bufferedWriter.write(text);
	            bufferedWriter.newLine();
	            bufferedWriter.close();
	        }
		 catch (IOException e) {
	            e.printStackTrace();
	        }




	}






}
