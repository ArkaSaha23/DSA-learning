//using MERGE SORT technique

class Result {
    public static long mergeSort(List<Integer> arr,int srt,int mid,int end)
    {
        List<Integer> temp = new ArrayList<>();
        int s=srt;
        int m=mid+1;
        long countInversion=0;
      
        while(s <= mid && m <= end){
            if(arr.get(s) <= arr.get(m)){
                temp.add(arr.get(s));
                s++;
            }
            else{
                countInversion+=(mid-s+1);  //important step for inversion calc.
                temp.add(arr.get(m));
                m++;
            }
        }
        while(s<=mid){
            temp.add(arr.get(s));
            s++;   
        }
        while(m<=end){
            temp.add(arr.get(m));
            m++;
        }
        for(int i = 0; i < temp.size(); i++){
            arr.set(srt + i, temp.get(i));
        }
        return countInversion;
    }
  
    public static long merge(List<Integer> arr,int srt,int end){
        if(srt>=end){
            return 0;
        }
        
        int mid=srt+(end-srt)/2;
      
        long l1=merge(arr,srt,mid);  //whatever result we get we will return it to the variables l1,r1,res...and return the sum of them
        long r1=merge(arr,mid+1,end);
        long res=mergeSort(arr,srt,mid,end);
      
        return (l1+r1+res);  
    }
    public static long countInversions(List<Integer> arr) {
        long result=(merge(arr,0,arr.size()-1));
        return result;
    }

}
