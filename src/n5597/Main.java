package n5597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        for(int i = 0; i < 28; i++){
            int input  = sc.nextInt();
            student[input-1] = 1;
        }
        for(int i = 0; i < 30; i++){
            if(student[i]==0)
                System.out.println(i+1);
        }
    }
}
