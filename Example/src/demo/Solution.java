package demo;
import java.io.*;
import java.util.*;


class Result {
    public static String[] calculateGrade(int[][] students_marks ,int students_marksRows) {
        String[] str= new String[students_marksRows];
        int l=0;
        for(int[] i:students_marks){
        	float sum=0;
        	float avg=0;
        	int c=0;
            for(int j :i) {
            	sum=sum+j;
            	c++;
            }
            avg=sum/c;
            System.out.println(avg);
            if(avg>=90)
            	str[l]="A+";
            else if(avg>=80 && avg<90)
            	str[l]=Character.toString('A');
            else if(avg>=70 && avg<80)
            	str[l]=Character.toString('B');
            else if(avg>=60 && avg<70)
            	str[l]=Character.toString('C');
            else if(avg>=50 && avg<60)
            	str[l]=Character.toString('D');
            else if(avg<50)
            	str[l]=Character.toString('F');
            
            l++;
            
            }
        return str;
            
        }

    }

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        

        int students_marksRows = Integer.parseInt(sc.next().trim());
        int students_marksColumns = Integer.parseInt(sc.next().trim());
		
		
		int[][] students_marks = new int[students_marksRows][students_marksColumns];
		for(int i = 0; i < students_marksRows; i++)
        {
			for(int j = 0; j < students_marksColumns; j++)
			{
				students_marks[i][j] = Integer.parseInt(sc.next().trim());				
			}
        }

        String[] result = Result.calculateGrade(students_marks,students_marksRows);
		
		for(int i = 0; i < result.length; i++)
        {
			System.out.println(result[i]);
            
        }     
        sc.close();
    }
}
