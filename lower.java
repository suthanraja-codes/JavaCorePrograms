public class lower {
    public static void main(String[] args){
        StringBuffer a=new StringBuffer("SUTHAN");
        System.out.println("Before coverstion : "+a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=65 && a.charAt(i)<=90) {


                int b = (int) a.charAt(i) + 32;
                a.setCharAt(i, (char) b);
            }

        }System.out.println("After coverstion : "+a);
    }
}
