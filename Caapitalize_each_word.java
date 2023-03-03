public class Caapitalize_each_word {
    public static void main(String[] args){
        StringBuilder sk= new StringBuilder("suThan tHe King Of The KinG");
        System.out.println("Befor : "+sk);
        if((sk.charAt(0)>=97) && (sk.charAt(0)<=122)){
        int c=(int) sk.charAt(0)-32;
        sk.setCharAt(0,(char)c);
        }
       // System.out.println(sk);
        for(int i=1;i<sk.length();i++)
        {
            if(sk.charAt(i)==32){
                i++;
                if(sk.charAt(i)>=97 && sk.charAt(i)<=122) {
                    int c = (int) sk.charAt(i) - 32;
                    sk.setCharAt(i, (char) c);
                }
                }
                else{

                if(sk.charAt(i)>=65 && sk.charAt(i)<=90){
                    int c=(int)sk.charAt(i)+32;
                    sk.setCharAt(i,(char)c);
                }
                }



        }System.out.println(sk);


    }
}
