import java.util.Arrays;

public class Ascending_order {
    public static void main(String[] args) {
        int a[] = {4, 38, 29, 03, 12, 584};
        System.out.println("Before Sort : " + Arrays.toString(a));
//        int temp;
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//
//                if(a[i]>a[j])
//                {
//                 temp=a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//                }
//        }}
//        System.out.println("After Swap : "+Arrays.toString(a));

        
        int temp;
        for (int i=0;i<a.length;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		
        		if(a[i] < a[j]) {
        			temp = a[i];
        			a[i] = a[j];
        			a[j] = temp;
        		}
        		
        		System.out.println(Arrays.toString(a));
        	}
        }
    }
}
