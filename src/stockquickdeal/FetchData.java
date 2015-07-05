package stockquickdeal;

import java.net.URL;

public class FetchData {

	public FetchData(){
		 String res = "";   
		  String urlString = "http://hq.sinajs.cn/list=sh601989";
	      try {   
	            URL url = new URL(urlString);  
	            java.net.HttpURLConnection conn = (java.net.HttpURLConnection)url.openConnection();  
	            conn.setDoOutput(true);  
	            conn.setRequestMethod("POST");  
	            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream(),"GBK"));  
	            String line;  
	           while ((line = in.readLine()) != null) {  
	               res += line+"\n";  
	           }  
	            in.close();  
	      } catch (Exception e) {  
	            e.printStackTrace();//logger.error("error in wapaction,and e is " + e.getMessage());  
	        }  
	      System.out.println(res);  
	      String[] sourceStrArray = res.split(",");
	        for (int i = 0; i < sourceStrArray.length; i++) {
	            System.out.println(sourceStrArray[i]);
	        }
//	        return res;  
	}
	

}
