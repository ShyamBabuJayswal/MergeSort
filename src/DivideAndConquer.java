public class DivideAndConquer {
    public static void divide(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
    }
    public static void conquer(int [] arr,int start,int mid,int end){
        int mergerd[] =new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2 <=end){
            if(arr[idx1] <= arr[idx2] ){
                mergerd[x++]=arr[idx1++];
            }
        }
        while(idx1 <= mid){
            mergerd[x++]=arr[idx1++];
        }
        while(idx2 <= end){
            mergerd[x++]=arr[idx2++];
        }
        for(int i=0,j=start;i<mergerd.length;i++,j++){
            arr[i]=mergerd[i];
        }

    }
    }
