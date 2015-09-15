
import java.util.Scanner;

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
public class Lab03_A {
    public static void main(String[] args){
        Scanner inLine=new Scanner(System.in);
        System.out.print("How many pages to fax? ");
        int pages= inLine.nextInt();
        double cost=3.00;
        if(pages<=10){
            cost+=.20;
        }
        else if(pages>10){
            cost+=.20;
            for(int i=0; i<pages-10;i++){
                cost+=.10;
            }
        }
            System.out.printf("That will cost $%,.2f%n", cost);
        }
        
} 

