package Base;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Readtestdata {

	public static void getData() {

        String[] st = null;
        File xmlfile = new File(System.getProperty("user.dir") + "\\TestConfig\\testdata.xml");
        System.out.println(xmlfile);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dbuilder = dbFactory.newDocumentBuilder();
            Document doc = dbuilder.parse(xmlfile);

            NodeList list = doc.getElementsByTagName("Urls");

            System.out.println("length of  : " + list.getLength());
            st = new String[list.getLength()];
            for (int i = 0; i < list.getLength(); i++) {

                st[i] = doc.getElementsByTagName("Urls").item(i).getTextContent();
                System.out.println(st[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        //List<String> data = new ArrayList<String>();
        //return data;
    }

    @Test
	public void geturls() {

		getData();
		 //System.out.println(Url);

	}

}



