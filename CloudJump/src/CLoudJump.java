

import java.util.Scanner;
import java.util.Arrays;

public class CLoudJump {
    
    public static int cloud(int arr[],int size)
    {
        
        if(size==1)
            return 0;
        
        if(size==2 )
            return 1;
        if(size==3)
            return 1;
        
        int count=0;
        
        if(arr[2]==0)
        {
            arr=Arrays.copyOfRange(arr,2, arr.length);
            count=1+cloud(arr,arr.length);
        }
        
        else {
            
            arr=Arrays.copyOfRange(arr,1, arr.length);
            count=1+cloud(arr,arr.length);
            
        }

        
        
        
        
        
        return count;

} 
    public static void main(String []args){
        
        Scanner sc=new Scanner(System.in) ;
        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        
        
        
        
        
        
        
        System.out.print(cloud(arr,arr.length));
        
        
        
        
        
        
        
        
        
    
        
    }

}
