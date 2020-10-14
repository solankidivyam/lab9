import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.*;
import java.util.Collections;
import java.lang.*;

class ActivitySelection
{
//    public static void printActivitySelection(int s[],int f[])
//    {
//        int size = s.length;
//        int i,j;
//
//        System.out.print("The Selected activities : ");
//        System.out.print("\n" +s[j]+" "+ f[j]);
//        for(j = 1; j < size; j++ ){
//            if(s[j] >= f[i]){
//                System.out.print("("+s[j]+"," + f[j]+"), ");
//                i=j;
//            }
//        }
//    }

//    void heapsort(int s[],int f[])
//    {
//        int num = s.length;
//        for(int i = num / 2 - 1; i >= 0; i--){
//            heapify(s, num, i, f);
//        }
//        for(int i = num - 1; i > 0; i--)
//        {
//            int t = s[0];
//            s[0] = s[i];
//            s[i] = t;
//
//            int tf = f[0];
//            f[0] = f[i];
//            f[i] = tf;
//
//            heapify(s ,i ,0 ,f);
//        }
//        void heapify(int s[],int num,int i,int f[])
//        {
//            int max = i;
//            int min = 2*i + 1;
//            int rr = 2*i + 2;
//
//            if(min < num && s[min] > s[max])
//            {
//                max = min;
//            }
//            if(rr < num && s[rr] > s[max])
//            {
//                max = r;
//            }
//
//            if(max != i)
//            {
//                int change = s[i];
//                s[i] = s[max];
//                s[max] = change;
//
//                int change_f = f[i];
//                f[i] = f[max];
//                f[max] = change_f;
//
//                heapify(s, num, max, f);
//            }
//        }
//    }

    public static void main(String[] args)
    {
        int[] s,f;
        s = new int[50];
        f = new int[50];

        for(int i = 0 ; i < 50 ; i++ )
        {
            s[i] = new Random().nextInt(94) + 1;
            f[i] = s[i] + new Random().nextInt(4) + 1;
        }



        System.out.print("The Selected activities : ");
        System.out.print("\n" + "(" + s[0] + "," + f[0] + "), ");

        for(int j = 1; j < 50; j++ ){

                System.out.print("("+s[j]+"," + f[j]+"), ");


        }

//        ActivitySelection A = new ActivitySelection();
//        A.heapsort(f,s);
//        A.printActivitySelection(s,f);
    }

}