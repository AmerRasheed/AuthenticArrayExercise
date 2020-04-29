package org.example;

import com.sun.deploy.security.SelectableSecurityManager;

    public class CallClass {

        public static int indexOf(int[] a, int b){

            boolean flag=true;

            for(int i=0;i<5;i++) {
                if (a[i]==b) {
                    System.out.println(a[i]);
                    flag=false;
                    return i;
                }
                else flag=true;
            }
            return -1;
        }
/*
public static int addelement()
{
  addelement();
}
*/
/*
    public static void swapString(String a, String b){
        String temp;
        temp = b;
        b = a;
        a = temp;
    }
*/
    }
