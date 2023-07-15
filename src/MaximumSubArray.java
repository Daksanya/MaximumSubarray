import java.util.Scanner;

public class MaximumSubArray{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int b= scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(maxSubArray(array,n,b));
    }
    public static int maxSubArray(int[] array,int n,int max)
    {
        int result=0,sum;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=array[k];
                    if(sum<=max){
                        result = Math.max(result,sum);
                    }
                }
            }
        }
        return result;
    }
}