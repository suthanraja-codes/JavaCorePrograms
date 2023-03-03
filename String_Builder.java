public class String_Builder {
    public static void main(String[] args){
        StringBuilder sk=new StringBuilder("Suthan 190 @gmail.com");
        System.out.println(sk);
        int upper=0,lower=0,special=0,vowel=0,space=0,number=0;
        for(int i=0;i<sk.length();i++){
        if((sk.charAt(i)>=97) && (sk.charAt(i)<=122)){
            lower++;
        }
        if((sk.charAt(i)>=65)&&(sk.charAt(i)<=90)){
            upper++;
        }
        if(sk.charAt(i)==32){
            space++;
        }
        if(sk.charAt(i)>=48 && sk.charAt(i)<=57){
             number++;
        }
        if(sk.charAt(i)=='a' || sk.charAt(i)=='e' || sk.charAt(i)=='i' ||  sk.charAt(i)=='o'  || sk.charAt(i)=='u'||
            sk.charAt(i)=='A'|| sk.charAt(i)=='E' || sk.charAt(i)=='I' || sk.charAt(i)=='O' || sk.charAt(i)=='U'){
            vowel++;
        }
        special=(sk.length())-(upper+lower+space+number);


        }
        System.out.println("lower : "+lower);
        System.out.println("upper : "+upper);
        System.out.println("vowel : "+vowel);
        System.out.println("space : "+space);
        System.out.println("special : "+special);
    }
}
