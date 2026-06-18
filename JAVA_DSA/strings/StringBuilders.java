package strings;

public class StringBuilders {
  public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("Kanika");
    System.out.println(sb);
    //Add
    sb.append(" Khurana");
    System.out.println(sb);

    //Length and capacity
    System.out.println(sb.length()+" "+sb.capacity());

    //Set character
    sb.setCharAt(0, 'V');
    System.out.println(sb);

    //Convert stringbuilder to string
    String s= sb.toString();
    System.out.println(s);

    //Reverse StringBuilder
    sb.reverse();
    System.out.println(sb);

    //Function of reverse in string builder
    int i=0, j= sb.length()-1;
    while(i<=j){
      char temp1= sb.charAt(i);
      char temp2= sb.charAt(j);
      sb.setCharAt(i, temp2);
      sb.setCharAt(j, temp1);
      i++;
      j--;
    }
    System.out.println(sb);

    //Delete
    sb.deleteCharAt(0);
    System.out.println(sb);

    //Insert
    sb.insert(0,'K');
    System.out.println(sb);

  }
}
