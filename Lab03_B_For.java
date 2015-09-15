/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class Lab03_B_For {
    public static void main(String[] args){
        Scanner nums= new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNum= nums.nextInt();
        System.out.print("Input the second number: ");
        int secondNum= nums.nextInt();
        int sum=0;
        
        System.out.println("All odd numbers between "+firstNum+" and "+ secondNum+" inclusive");
        for(int i=firstNum; i<=secondNum; i++){
            if(i%2==0){
                sum+=i;
                i++;
            }
            else{
                System.out.println(i);
                i++;
            }
        }
        System.out.println("Sum of all even numbers between "+firstNum+" and "+ secondNum+" inclusive");
        System.out.println(sum);

    }
}
