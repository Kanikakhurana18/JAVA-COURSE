package strings;

public class StringCompression {
  public static void main(String[] args) {
    char[] chars= { 'a','a','b','b','c','c','c'};
     int i=0, j=0;
        int k=0; //compressed result likhne ka index
        int n= chars.length;
        while(i<n){ //i group start ko represent karta hai. //ye while loop group process krega
           j=i;
           while(j<n && chars[i]==chars[j]){//Current group kitna bada hai, wo find karega. i.e. same character ka poora group find 
               j++;
            }
            int count=j-i;
            // chars[k++]= chars[i]; //character likho for eg a mil gya
            chars[k]=chars[i]; //a hai chars[i]=chars[k]
            k++; //now k increase hoke 2 ho gya agr a ki do value hai

            if(count>1){
                String cnt= String.valueOf(count); //Integer.toString
                for(char ch: cnt.toCharArray()){
                    chars[k]=ch; //Or chars[k++]=ch
                    k++;
                }
            }
            i=j; //next group
        }
        System.out.println(k);


        //Brute force approach StringBUilder but takes Space O(n) extra space
        //  int n= chars.length;
        //  StringBuilder sb= new StringBuilder();
        //  int i=0;
        //  while(i<n){
        //     int j=i;
        //     while(j < n && chars[j] == chars[i]){
        //         j++;
        //     }
        //     int count=j-i;
        //     sb.append(chars[i]);
        //     if(count>1) sb.append(count);
        //     i=j;
        //  }
        //  for(int p=0;p<sb.length();p++){ //Compressed string ko input array chars me store bhi karo. //[a,2,b,2,c,3,...] Usko chars me copy karo:
        //         chars[p]=sb.charAt(p);
        //     }
        // System.out.println(sb.length()); //return the new length of the compressed array
  }
}
