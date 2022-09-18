package takeScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.util.Base64;

public class ImageToBase64Encoded {
  public static void main(String[] args) throws Exception{
	
	  File f=new File("C:\\Users\\Vivek Kumar\\Downloads\\WhatsApp Image 2021-11-18 at 10.44.11 PM.jpeg");
	  FileInputStream fileInputStream=new FileInputStream(f);
	  byte aarr[]=new byte[(int)f.length()];
	  fileInputStream.read(aarr);
	  String encodedString= Base64.getEncoder().encodeToString(aarr);
	  System.out.println(encodedString);
	  
	  byte decod[]=Base64.getDecoder().decode(encodedString);
	  System.out.print(aarr.toString());
	  
	   InetAddress localhost = InetAddress.getLocalHost();

       System.out.println("System IP Address : " +
                     (localhost.getHostAddress()).trim());
	  //FileInputStream reads raw binary data of a file, particularyl image,to read characters use FileReader
/*	  FileInputStream fileInputStream=new FileInputStream(f);
	  byte array[]=new byte[(int) f.length()];
	  fileInputStream.read(array);
	  String encodedString=Base64.getEncoder().encodeToString(array);
	  System.out.print(encodedString);*/
}
}
