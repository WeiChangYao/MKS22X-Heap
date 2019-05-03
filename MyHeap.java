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
    if (data[index] < data[index*2] ||  
        data[index] < data[index*2+1]) { 
        if (data[index*2] > data[index*2+1]) { 
           swap(data, index, index*2);
           pushDown(data,size,index*2); 
        } 
        else { 
           swap(data, index, index*2+1); 
           pushDown(data,size,index*2+1);
        } 
    } 
  }
  
  private static void pushUp(int[]data,int index){}
  public static void heapify(int[]data){}
  public static void heapsort(int[]data){}
  
  public static String prin(int[] ary){
    String s = "";
    for (int i = 0; i < ary.length; i++){
      s+= ary[i] + " ";
    }
    return s;
  }
  public static void main(String[] args){
    int[] cat = new int[]{3,10,2,5,4,8};
    System.out.println(prin(cat));
    pushDown(cat,6,2);
    System.out.println(prin(cat));
  }
}
