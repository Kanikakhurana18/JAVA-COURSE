package strings;

public class SumOfAllSubstringOfNumber {
  public static void main(String[] args) {
    int n= 12345;
    String s= Integer.toString(n); //integer to string to convert into susbtring
    int sum=0;
    for(int i=0;i<s.length();i++){
      for (int j = i+1; j <= s.length(); j++) { //remember j=i+1
        String sub= s.substring(i,j);
        sum+= Integer.parseInt(sub); //As sum int hai sub string so we have to convert
      }
    }
    System.out.println("Sum of all numbers substring is "+sum);
  }
}
