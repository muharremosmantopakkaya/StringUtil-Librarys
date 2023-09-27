package tr.edu.altinbas.util.array;

import java.util.Random;

import java.util.*;

/*

class App {
    public static void main(String [] args)
    {
        int [] a = new int[5];

        int i = 0;

        for (int val : a) // Bunun yerine klasik for döngüsü kullanılması daha iyidir
            a[i++] = i * 10;

        for (int val : a)
            System.out.printf("%d ", val);

        System.out.println();
    }


    public static String
}
*/

public class ArraysUtils {
  public static void sort(int[] arr){
      if(arr==null)
          throw new NullPointerException("Nissing Array");
      for(int i=0; i<arr.length-1;i++)
      {
          int min_val =arr[i];
          int min_pos=i;

          for(int j=0; j<arr.length; j++)
          {
              if(arr[j]<min_val)
              {
                  min_val=arr[j];
                  min_pos=j;

              }
          }
          swap(arr, i, min_pos);

      }

  }
  public static void swap(int var1,int var2)
  {
      int temp= var2;
      var2=var1;
      var1=temp;
  }
  public static void swap(int[] arr, int pos1, int pos2){
      if(arr==null)
      throw new NullPointerException("Missing Array");

      int temp=arr[pos1];
      arr[pos1]=arr[pos2];
      arr[pos2]=temp;
  }
  public static String printArray(int arr)
  {
      return("");
  }
}



