public class binary {

    public static int binary1 (int[]arr , int key)
    {
        int l=0 , h=arr.length-1;
        while(l!=h)
        {
            int i= (l+h)/2;
            if(arr[i]==key)
            return i;
            else if (arr[i]<key)
            l=i+1;
            else h=i-1;

            if(l==h)
             if(arr[l]==key)
             return l;

           
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={3,6,12,76,102,110};
        System.out.println(binary1(arr,108));
        
    }
}