package strings;

public class Immutablity { //security purpose
  public static void main(String[] args) {
  String s="Kanika";
  // s.charAt(0)='v';  //NOT POSSIBLE
  s+=" Khurana";
  System.out.println(s);

  //To create new string 
  String str= new String("Kanika khurana");
  //To change a character
  str= 'V'+str.substring(1);
  System.out.println(str);

  //s1.equals s2 [two string same name pointing to same position in address gives true]
  //  and s1== s2 [while this gives false]
  String s1="Radha";
  String s2= new String ("Radha"); //new String() alag object banata hai.
  System.out.println(s1.equals(s2)); //characters/content compare karta hai.
  System.out.println(s1==s2); //memory reference compare karta hai. //Yahaan false aayega kyunki new String() alag object banata hai.

  System.out.println(equals(s1,s2)); //Function call

  } 
  //Character compare function(s1.equals(s2))
  public static boolean equals(String s1, String s2){
    if(s1.length()!=s2.length()) return false;
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)!=s2.charAt(i)) return false;
    }
    return true;
  }
}
