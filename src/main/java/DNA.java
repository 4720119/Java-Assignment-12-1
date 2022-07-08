public class DNA {
    public String str = "";
    
    public String getPair(){
        String pairStr ="";
        String pairCh ="";
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='A')
           pairCh="T";
           
           if(str.charAt(i)=='T')
           pairCh="A";
           
           if(str.charAt(i)=='G')
           pairCh="C";

           if(str.charAt(i)=='C')
           pairCh="G";
           
           pairStr +=pairCh;
    }
       return pairStr;
    }
}
