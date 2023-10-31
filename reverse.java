public class reverse{
    
    public static void main(String[] args){
    String reshte="shayan";   
    char []array_reshte=reshte.toCharArray();
    char[]array_reverrsed=reverseArray(array_reshte, 0, reshte.length()-1);
    char []array_reshte2=reshte.toCharArray();
    System.out.println(is_same(array_reshte2, array_reverrsed));
    // System.out.println(reverseArray(array_reshte, 0, reshte.length()-1));
    }
    public static char[] reverseArray(char[] data, int low, int high) {
         
        if (low < high) {                         // if at least two elements in subarray
          char temp = data[low];                   // swap data[low] and data[high]
          data[low] = data[high];
          data[high] = temp;
          reverseArray(data, low + 1, high - 1);  // recur on the rest
        }
        return data;
      }

      public static Boolean is_same(char[] reshte_asli,char[] reshte_reversed){
        System.out.println(reshte_asli);
        System.out.println(reshte_reversed);
        Boolean same=true;
        for(int i=0;i<reshte_asli.length;i++){
            if(reshte_asli[i]!=reshte_reversed[i]){
                same=false;
            }
        }
        return same;

      }
}