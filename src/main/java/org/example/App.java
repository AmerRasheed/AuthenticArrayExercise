package org.example;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ARRAY WORLD
 *
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Array Exercise" );

//Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers from the array with random numbers
// so that the even numbers are located in the rear (the right side) part of the array and
// the odd numbers are located in the front part (the left side).
        System.out.println("Solution Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers from the array with random numbers so that the even numbers are located in the rear (the right side) part of the array and the odd numbers are located in the front part (the left side).");

        //Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9
        // int[] source = {1,2,3,7,9,12};
        //int[] target= new int[6];

        Scanner sctarget = new Scanner(System.in);
        Random randomnumber = new Random();
        int arraylength = 0;
        int var1;

        System.out.println("How many elements you want to store in an array");
        arraylength = sctarget.nextInt();

        int[] source = new int[arraylength];

        for(int i=0; i<arraylength;i++) {

            var1=randomnumber.nextInt(1000);
            source[i] =var1;
        }

        System.out.println("The random numbers generated are  : ");
        for(int i=0;i<source.length;i++)
            System.out.print(source[i]+ " ");
        System.out.println("\n");

        int[] target= new int[arraylength];

        int right=arraylength-1;
        int left=0;

        for(int i=0;i<source.length;i++)
        {
            if ((source[i]%2)==0) {
                target[right] = source[i];
                right--;
            }
            else
            {
                target[left]=source[i];
                left++;
            }
        }

        System.out.println("The output(Even number on the right and Odd numbers on the left side is shown) is  : ");
        for(int i=0;i<target.length;i++)
            if(target[i]!=0)
                System.out.print(target[i]+ " ");
        System.out.println("\n");
        System.out.println("\n");


//Write a program which will print the diagonal elements of twodimensional array.  Expected output: 1 4 9
        System.out.println("Solution 12. Write a program which will print the diagonal elements of twodimensional array.");
        int[] printDiagonal = new int[11];
        for(int i=1;i<4;i++)
        {
            System.out.print("\n");
            for(int j=1;j<4;j++)
                System.out.print(printDiagonal[j]+ i*j+"   ");                    // For identing purpose in the output
        }
        System.out.println("\n");
        System.out.println("The diagonal elements are ");
        for(int i=1;i<4;i++)
        {
            for(int j=1;j<4;j++) {
                if(i==j)
                    System.out.print(printDiagonal[j] + i * j + "   ");                    // For identing purpose in the output

            }
        }
        System.out.println("\n");



        System.out.println("\n");


        //Write a program that ask the user for an integer and repeat that question until user give you a specific value
// that user already has been told about as a message in your program. Store these values in an array and print that array.
// After that reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, etc.
// Do not just reverse the order in which they are printed. You need to change the way they are stored in the array
        System.out.println("Solution 11. Write a program that ask the user for an integer and repeat that question until user give you a specific value that user already has been told about as a message in your program. Store these values in an array and print that array. After that reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, etc. Do not just reverse the order in which they are printed. You need to change the way they are stored in the array.  \n" +               " ");
        Scanner sc= new Scanner(System.in);
        int newlength=0;
        System.out.println("How many elements you want to store in an array");
        newlength=sc.nextInt();

        int[] newarray = new int[newlength];
        int[] newarray1 = new int[newlength];
        for(int i=0;i<newlength;i++)
            newarray[i]=sc.nextInt();
        System.out.print("The elements you entered are ");

        for(int i=0;i<newlength;i++)                                                  //The number of elements are display :: 11 23 39
            System.out.print(newarray[i]+ " ");
        System.out.println("\n");
        int num=newlength;
        System.out.println("Reverse is \n");
        for(int i=0;i < newlength;i++)
        {
           num--;
           newarray1[i]=newarray[num];
           System.out.print(newarray1[i]+" ");
        }

        System.out.println("\n");
//Write a program which will represent multiplication table stored in multidimensional array.
// Hint: You have two-dimensional array with values  [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]

        System.out.println("Solution 10. Write a program which will represent multiplication table stored in multidimensional array.  \n");
        System.out.println("Output of a program which will represent multiplication table stored in multidimensional array.");
        int[] adimension= new int[11];
        for(int i=1;i<11;i++)
        {
            System.out.print("\n");
            for(int j=1;j<11;j++)
                if((i*j)<10)
                    System.out.print(adimension[j]+ i*j+"   ");                    // For identing purpose in the output
                else                                                               // Two spaces for single digits and single space for double digit
                    System.out.print(adimension[j]+ i*j+"  ");
        }
        System.out.println("\n");


//Write a method which will add elements in an array.
//Remember that arrays are fixed in size so you need to come up with a solution to “expand” the array.
        System.out.println("Solution 9. Write a method which will add elements in an array.  Remember that arrays are fixed in size so you need to come up with a solution to “expand” the array");
        Scanner sc3= new Scanner(System.in);
        int newlength5=0;
        System.out.println("How many elements you want to store in an array");
        newlength5=sc3.nextInt();

        int[] newarray3 = new int[newlength5];
       // int[] newarray5 = new int[0];

        for(int i=0;i<newlength5;i++)
            newarray3[i]=sc3.nextInt();
        System.out.print("The elements you entered are ");

        for(int i=0;i<newlength5;i++)                                                  //The number of elements are display :: 11 23 39
            System.out.print(newarray3[i]+ " ");

        System.out.println("Enter the element to add");
        int newelement=sc3.nextInt();
        int[] newarray5=CallClass.add(newarray3,newelement);

        for(int i=0;i<newlength5+1;i++)                                                  //The number of elements are display :: 11 23 39 + Additional elements added
            System.out.print(newarray5[i]+ " ");
    }
        }



