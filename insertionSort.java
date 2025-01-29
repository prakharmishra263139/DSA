public class insertionSort {
    public static void sort(int array[]){
        int n=array.length;

        for(int i=1;i<n;i++){
            int current =array[i];
            int j=i-1;

            while(j>=0 && array[j]>current){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
    }
    public static void main(String[] args) {

        int array[]={6,5,4,3,2,1};
        sort(array);

        for(int ele:array){
            System.out.print(ele+" ");
        }

    }
}
