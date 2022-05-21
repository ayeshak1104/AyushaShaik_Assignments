public class LinearSer{
       public static void main(String Args[])
         {
                 int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
                 int num=14;
                 int temp=0;
                 for(int i=0;i<arr.length;i++)
                 {
                      if(arr[i]==num)
                       {
                         System.out.println("num is present at "+i+" index position");
                           temp=temp+1; 
                        }

                   
                 }
                  if(temp==0)
                  {
                    System.out.println("num not found in the list");
                  }
         }
} 