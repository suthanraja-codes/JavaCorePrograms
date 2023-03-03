import java.util.Arrays;

public class desending_order{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,78,9};
        System.out.println("Before Sort : " + Arrays.toString(a));
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){

                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }}
        System.out.println("After Swap : "+Arrays.toString(a));

    }
}
