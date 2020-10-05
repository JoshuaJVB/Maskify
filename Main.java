package maskify;

public class Main {

	public static void main(String[] args) {
			String str = "4556364607935616";
		      if (str.length() <= 4) System.out.println(str);
		      
		      char[] mask = str.toCharArray();
		      
		      for (int i = 0; i < (str.length() - 4); i++) {
		    	  mask[i] = '#';
		      }
		    
		      str = String.valueOf(mask);
		      
		      System.out.println(str);
	}
}
