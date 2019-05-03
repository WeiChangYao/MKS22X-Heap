public class MyHeap{
  private static void swap(int[]data, int indexOne, int indexTwo){
    int swapdata = data[indexOne];
    data[indexOne] = data[indexTwo];
    data[indexTwo] = swapdata;
  }
  private static void pushDown(int[]data,int size,int index){
    if (index >= (size/2) && index <= size) { 
      return; 
    }
    //if(size%2==0){
    
    if (data[index] < data[index*2+1] ||  
        data[index] < data[index*2+2]) { 
        if (data[index*2+1] > data[index*2+2]) { 
           swap(data, index, index*2+1);
           pushDown(data,size,index*2+1); 
        } 
        else { 
           swap(data, index, index*2+2); 
           pushDown(data,size,index*2+2);
        } 
    } 
    
    //}
    /*else{
      if(index*2+1 < size){
      if (data[index] < data[index*2+1]){
        swap(data, index, index*2+1);
        pushDown(data,size,index*2+1); 
      }
    }
    }*/
  }
  private static void pushUp(int[]data,int index){}
  public static void heapify(int[]data){
    heapifyHelp(data,data.length,0);
  }
    
  public static void heapifyHelp(int[] data, int n, int i) { 
    int max = i; 
    int l = i*2 + 1;  
    int r = i*2 + 2; 
    if (l < n && data[l] > data[max]) 
            max = l; 
    if (r < n && data[r] > data[max])
            max = r; 
    if (max != i){ 
       swap(data,i,max);
       heapifyHelp(data, n, max); 
    } 
  } 
  
  
  public static void heapsort(int[]data){}
  
  public static String prin(int[] ary){
    String s = "";
    for (int i = 0; i < ary.length; i++){
      s+= ary[i] + " ";
    }
    return s;
  }
  public static void main(String[] args){
    int[] cat = new int[]{3,8,2,5,10};
    System.out.println(prin(cat));
    pushDown(cat,5,1);
    System.out.println(prin(cat));
  }
}
