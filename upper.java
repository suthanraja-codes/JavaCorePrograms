public class upper {
    public static void main (String[] args){
        StringBuilder a =new StringBuilder("suthan");
        System.out.println("Before Coverstion : "+a);
        for(int i=0;i<a.length();i++){
            if((a.charAt(i)>=95) && (a.charAt(i)<=122)){
                int c=(int) a.charAt(i)-32;
                a.setCharAt(i,(char)c);
            }
        }System.out.println("After Coverstion : "+a);
    }
        }
