package 排序;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Demo1 {

    @Test
    public void test1(){
        int[] arr ={2,1,56,3,23,12,6};
        //冒泡排序
        //bubbleSort(arr);
        //快速排序
        quickSort(arr,0,arr.length-1);
        //打印结果
        System.out.println(Arrays.toString(arr));
    }
    void quickSort(int[] arr,int start,int end){
        if (start>end){
            return;
        }
        int temp=arr[start];
        int low=start;
        int high=end;
        while (low<high){
            while (low<high&&temp<=arr[high]){
                high--;
            }
            arr[low]=arr[high];
            while (low<high&&temp>=arr[low]){
                low++;
            }
            arr[high]=arr[low];
        }
        //第一次快速排序结束 递归调用
        arr[low]=temp;
        quickSort(arr,start,low-1);
        quickSort(arr,low+1,end);
    }
    void bubbleSort(int[] arr){
        boolean flag=false;
        int length=arr.length-1;
        int number=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <length ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                    number=j;
                }
            }
            if (!flag){
                break;
            }
            length=number;
        }
    }
}
