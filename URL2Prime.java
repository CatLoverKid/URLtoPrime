import java.io.*;

class URL2Prime{
  private static String inputString;
  private static int tempASCIIResult;
  private static int primeCounter = 1;
  private static String primeString;
  
  public static void main(String args[])throws Exception{  
	BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
    inputString = args[0];
	for(int i = 0; i < inputString.length(); i++){tempASCIIResult += (int) inputString.charAt(i);}

	System.out.println(primeString);
      for(int i = 0; i < tempASCIIResult; i ++){
        primeString = systemIn.readLine();
      }
	System.out.println(primeString);
  }
}
