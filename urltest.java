import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class urltest {
        public static void main(String[] args) throws java.io.UnsupportedEncodingException {
                String url = "http://example.com/ %$#?foo";

             /*   if(url.equals(java.net.URLDecoder.decode(url, "UTF-8"))) {
                        System.out.println("URL didn't contain encoded parts.");
                } else {
                        System.out.println("URL contained encoded parts.");                                                                                                                                
                }*/
		
//	System.out.println(url);
//	url = URLEncoder.encode(url, "UTF-8");
	System.out.println("First Encoding: " + url);
	/*url = URLEncoder.encode(url, "UTF-8");
	System.out.println("Second Encoding: "+ url);		*/
	
	url =	java.net.URLDecoder.decode(url, "UTF-8");
	System.out.println(url);
                                                                                                                                                                                        
        }                                                                                                                                                                                                  
}