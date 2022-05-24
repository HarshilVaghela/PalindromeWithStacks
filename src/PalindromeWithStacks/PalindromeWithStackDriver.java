/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromeWithStacks;

import java.util.Scanner;
/**
 *
 * @author Harshilkumar Vaghela(3116318);
 * @date September 30,2020(Lab3);
 */
public class PalindromeWithStackDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I am supposed determine if a sentence entered is a palindrome with 2 different sort of stacks
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a word or a sentence to check if it is a palindrome");
        String answer = kb.nextLine();
        String userAnswer = answer;//just to keep actual answer safe
        answer = answer.toLowerCase();//we can manipulate this without worrying about actual input
        answer = answer.replaceAll("[^A-Za-z]+", "");
        char[] answerArray = answer.toCharArray();char[] answerArray2=answer.toCharArray();

        Stack<Character> temp = new ArrayStack<>(answerArray.length);//using this to reverse the array
        reverser(temp,answerArray);
        Stack<Character> temp2 = new LinkedJavaStack<>();//using this to reverse the array
        reverser(temp2,answerArray2);//just note that I am not using generic reverser, I am initiating the stacks in main and using a method for both
                                       //So that I can cut out redundant code

        boolean checker = checker(temp,answerArray,answer);// checking palindrome with ArrayStack
        boolean checker2 = checker(temp2,answerArray2,answer);//Checking palindrome with linkedJavaStack
       
        if (checker2&checker) {
            System.out.println(userAnswer + " is a Palindrome");
        } else {
            System.out.println(userAnswer + " is not a Palindrome");
        }
    }
    public static boolean checker(Stack<Character> t,char[] a,String k){
    boolean checker = true;int i=0;
        while(i<a.length){
        
         if (a[i]==k.toCharArray()[i]) {checker=checker&true;
            } else {checker=checker&false;
            }i++;
        }
        return checker;
    }
    public static void reverser(Stack<Character> t,char[] a){
    for (int i = 0; i < a.length; i++) {
            t.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = t.pop();
        }
    }

}
