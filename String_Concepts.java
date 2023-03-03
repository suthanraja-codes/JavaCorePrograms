
public class String_Concepts {
    public static void main(String[] args){
        String a="Suthan Raja";
        String b="Suthan King";

        //Hashcode
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("A Hashcode : "+a.hashCode());
        System.out.println("B HAshcode : "+b.hashCode());
        System.out.println("A Length : "+a.length());
        System.out.println("Upper Case : "+a.toLowerCase());
        System.out.println("Upper Case : "+a.toUpperCase());
        System.out.println("Index Value: "+a.charAt(4));
        System.out.println("Equals : " +a.equals(b));
        System.out.println("Equals : " +a.equalsIgnoreCase(b));
        System.out.println("Starts with : "+a.startsWith("ja"));
        System.out.println("Ends with : "+a.endsWith("ja"));
        System.out.println("Ends with : "+a.endsWith("ja"));
        System.out.println("Replace : "+a.replace("Raja","king"));
        System.out.println("contains : "+a.contains("raja"));
        System.out.println("Substring : "+a.substring(5));
        System.out.println("Substring : "+a.substring(0,5));

        char[]carray=a.toCharArray();
        for(char c:carray) {
            System.out.println(c + " ");
        }
            String D=" Suthan ";
            System.out.println("C Length : "+D);
            System.out.println("C Trim   : "+D.trim());
            System.out.println("C Trim   : "+D.trim().length());



    }
  }


