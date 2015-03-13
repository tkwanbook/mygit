/**
 * 
 */
package array2;

import java.util.ArrayList;
import java.util.List;


public class Exercise1 {

	public static void main(String[] args) {
		// Create a structure to hold unique urls
		// For each url, get the domain (i.e. http://www.google.com -> google.com)

		//Tony's
		String[] urlist = {"http://www.google.com", "http://www.yahoo.com", "http://www.bing.com", "http://www.amazon.com"};
		List<String> urls = new ArrayList<String>();
		for (int i=0; i < urlist.length; i++) {
			urls.add(urlist[i].substring(urlist[i].indexOf("www.")+4));
			System.out.println(urls.get(i));
		}
		
	}

}
