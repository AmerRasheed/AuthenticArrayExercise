package org.example;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ARRAY WORLD
 *
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
/*
//Write a program which will print the diagonal elements of twodimensional array.  Expected output: 1 4 9
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

        Scanner sc= new Scanner(System.in);
        int newlength=0;
        System.out.println("How many elements you want to store in an array");
        newlength=sc.nextInt();

        int[] newarray = new int[newlength];

        for(int i=0;i<newlength;i++)
            newarray[i]=sc.nextInt();
        System.out.print("The elements you entered are ");

        for(int i=0;i<newlength;i++)                                                  //The number of elements are display :: 11 23 39
            System.out.print(newarray[i]+ " ");

        System.out.println("Enter the element to add");
        int newelement=sc.nextInt();
        int[] newarray1=CallClass.add(newarray,newelement);

        for(int i=0;i<newlength+1;i++)                                                  //The number of elements are display :: 11 23 39
            System.out.print(newarray1[i]+ " ");

//Write a program which will represent multiplication table stored in multidimensional array.
// Hint: You have two-dimensional array with values  [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
        System.out.println("\n");
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
        // Remember that arrays are fixed in size so you need to come up with a solution to “expand” the array.


               System.out.println( "Array exercise FIRST EIGHT QUESTIONS SOLUTION" );
//Write a program which will store elements in an array of type ‘int’ and print it out.  Expected output: 11 23 39 etc.
                Scanner sc= new Scanner(System.in);
                int length=0;
                System.out.println("How many elements you want to store in an array");
                length=sc.nextInt();

                int[] firstarray = new int[length];

                for(int i=0;i<length;i++)
                    firstarray[i]=sc.nextInt();
                System.out.print("The elements you entered are ");
                for(int i=0;i<length;i++)                                                  //The number of elements are display :: 11 23 39
                    System.out.print(firstarray[i]+ " ");

// Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
// If the element doesn’t exist your method should return -1 as value.  Expected output: Index position of number 5 is: 2

                int[] secondarray = new int[] {11,22,33,44,55};
                System.out.println("Given the array [11,22,33,44,55]");                          //Given array            [11,  22, 33,  44,  55]
                System.out.println("Enter the element of which you want to see the index ");     //Respective indices are [ 0   1   2     3    4]
                int element=sc.nextInt();                                                     // If the user says 55, the solution will be 4
                int index= CallClass.indexOf(secondarray,element);
                if(index== -1)
                    System.out.println("No such element found in the array");
                else
                    System.out.println("The index of the element is " + index);
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");

//Write a program which will sort string array.
// Expected output:
// String array:      [Paris, London, New York, Stockholm]
// Sort string array: [London, New York, Paris, Stockholm]

                System.out.println("The elements before sorting are");
                String inputstring= "Paris,London,New York,Stockholm";
                String[] sortedArray = inputstring.split(",");                       //split function separates the string w.r.t. "," in inputstring and assigned to thirdarray
                for(int i=0;i<sortedArray.length;i++)
                    System.out.print(sortedArray[i] + " ");
                //First iteration //First iteration            //First iteration     //First iteration
                for(int i = 0; i<sortedArray.length-1; i++) {       //length-1 Last element  // Example sort   // [d c b a]      [c b a d]                    [b a c d]               [a b c d]
                    for (int j = i+1; j<sortedArray.length; j++) {  //length next place after last element     // [c d b a]      [b c a d]                    [a b c d]               [a b c d]
                        if(sortedArray[i].compareTo(sortedArray[j])>0) {                                       // [c b d a]      [b a c d]                    [a b c d]               [a b c d]
                            // CallClass.swapString(sortedArray[i],sortedArray[j]);                              // [c b a d]      [b a c d]                    [a b c d]               [a b c d]
                            String temp = sortedArray[i];
                            sortedArray[i] = sortedArray[j];
                            sortedArray[j] = temp;
                        }
                    }
                }

                System.out.println("\n");
// System.out.println(Arrays.toString(sortedArray));                                                    // Another way of solving SORT arrays
                System.out.println("The elements after sorting are");
                for(int i=0;i<sortedArray.length;i++)
                    System.out.print(sortedArray[i] + " ");

                //Write a program which will copy the elements of one array into another array.
                // Expected output: Elements from first array: 1 15 20
                // Elements from second array: 1 15 20

                int[] sourcearray = new int[] {11,22,33,44,55};                                                 // Array initiallization
                System.out.println("\n");
                System.out.print("The elements of source array are " );                                         // One must do initiiallization or declare Array dimensions
                System.out.println(Arrays.toString(sourcearray));

                int[] targetarray = new int[5];
                System.out.print("The elements of target array before copying elements are " );
                System.out.println(Arrays.toString(targetarray));

                for(int i=0; i<sourcearray.length;i++)                                                          //Copying array elements
                    targetarray[i]=sourcearray[i];
                System.out.print("The elements of source array are " );
                System.out.println(Arrays.toString(targetarray));

//Create a two-dimensional string array [2][2].
// Assign values to the 2d array containing any Country and City.
// Expected output:  France  Paris
//                   Sweden  Stockholm

                String [][] twodimension = {{"France","Paris"}, {"Sweden","Stockholm"}};    // 1R1C, 1R2C  2R1C, 2R2C           // [][] ROW COLUMN

                for(int i=0;i<twodimension.length;i++)
                {
                    System.out.println("\n");
                    for(int j=0;j<twodimension.length;j++)
                        System.out.print(twodimension[i][j]+"  ");
                }
                System.out.println("\n");

//Write a program which will set up an array to hold the next
// values in this order: 43, 5, 23, 17, 2, 14 and
// print the average of these 6 numbers. Expected output: Average is: 17.3

                float averarray[] = {43,5,23,17,2,14};
                float average=0;
                for(int i=0;i<averarray.length;i++)
                    average= average + averarray[i];
                System.out.println("Average is " + average/6);
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");

//Write a program which will set up an array to hold 10 numbers and
// print out only the uneven numbers.
// Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9
                int[] given = {1,2,4,7,9,12};
                int[] uneven= new int[5];

                for(int i=0;i<uneven.length;i++)
                {
                    if ((given[i]%2)!=0)
                        uneven[i]=given[i];
                }
                System.out.print("The uneven elements are  : ");
                for(int i=0;i<uneven.length;i++)
                    if(uneven[i]!=0)
                        System.out.print(uneven[i]+ " ");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");

//Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
// Expected output:                 Array: 20 20 40 20 30 40 50 60 50
// Array without duplicate values: 20 40 30 50 60
                int[] givenarr = {20, 20, 40,20, 30, 20, 50, 60, 50};
                int compare;
                for(int i=0;i<9;i++) {
                    int engång=0;

                    for (int j = 0; j < 8; j++)
                    {
                        compare = givenarr[i];
                        if (compare == givenarr[j + 1])
                        {
                            if(engång<1)
                                givenarr[j + 1] = givenarr[i];
                            else
                                givenarr[j+1]=0;
                            engång++;
                        }

                    } //inner loop
                }//outer loop
                System.out.println(Arrays.toString(givenarr));
                System.out.print("The non-duplicate elements are : ");
                for(int i=0;i<givenarr.length;i++)
                    if(givenarr[i]!=0)
                        System.out.print(givenarr[i]+ " ");

            */
    }
        }



