public class bubbleSort {

    public static void sort(int array[]){
        int n=array.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-i-1;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
    int array[] = {6,5,4,3,2,1};
    sort(array);

    for(int ele:array){
        System.out.print(ele+" ");
      }
    }
}
