package Immutability;

import java.util.Arrays;

public class ShallowDeepCopyDemo {
    private int[] data;

    public ShallowDeepCopyDemo(int[] values){
        data = new int[values.length];
        for(int i=0; i<data.length; i++){
            data[i]= values[i];
        }
    }
    /*public ShallowDeepCopyDemo(int[] values){
        data = values; //shallow copy
    }*/
    public void showData(){
        System.out.println(Arrays.toString(data));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ShallowDeepCopyDemo sd = new ShallowDeepCopyDemo(arr);
        sd.showData();
        arr[0] = 11;
        sd.showData();


    }


}
