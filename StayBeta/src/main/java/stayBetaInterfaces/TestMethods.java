package stayBetaInterfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMethods {
	Date date = new Date();
	String str = new SimpleDateFormat("ddMMMyy").format(date);
}
