public class MyHeap{
  private static void swap(int[]data, int indexOne, int indexTwo){
    int swapdata = data[indexOne];
    data[indexOne] = data[indexTwo];
    data[indexTwo] = swapdata;
  }
  private static void pushDown(int[]data,int size,int index){
    //why do i need size? to over
    if(data[index] < data[index*2+1]){
      swap(data,index,index*2+1);
      //recursive?
      pushDown(data,size,index*2+1)
    }
    if(data[index] < data[index*2+2]){
      swap(data,index,index*2+2);
    }

  }
  private static void pushUp(int[]data,int index){}
  public static void heapify(int[]data){}
  public static void heapsort(int[]data){}
  public static String prin(int[] ary){
    String s = "";
    for (int i = 0; i < ary.length; i++){
      s+= ary[i];
    }
    return s;
  }
  public static void main(String[] args){
    int[] cat = new int[]{1,2,3};
    System.out.println(prin(cat));
    swap(cat,1,2);
    System.out.println(prin(cat));
  }
}
