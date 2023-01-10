import java.util.Scanner;
public class HeartShape {

   
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double mathGrade = 0;
            double scienceGrade = 0;
            double mapehGrade = 0;
            double englishGrade = 0;
            double filipinoGrade = 0;
            
            double mathWeight = 0;
            double scienceWeight = 0;
            double mapehWeight = 0;
            double englishWeight = 0;
            double filipinoWeight = 0;
            
            System.out.print("Enter the grade for math: ");
            mathGrade = sc.nextDouble();
            
            System.out.print("Enter the grade for science: ");
            scienceGrade = sc.nextDouble();
            
            System.out.print("Enter the grade for mapeh: ");
            mapehGrade = sc.nextDouble();
            
            System.out.print("Enter the grade for english: ");
            englishGrade = sc.nextDouble();
            
            System.out.print("Enter the grade for filipino: ");
            filipinoGrade = sc.nextDouble();
            
            System.out.print("Enter the weight for math: ");
            mathWeight = sc.nextDouble();
            
            System.out.print("Enter the weight for science: ");
            scienceWeight = sc.nextDouble();
            
            System.out.print("Enter the weight for english: ");
            englishWeight = sc.nextDouble();
            
            System.out.print("Enter the weight for mapeh: ");
            mapehWeight = sc.nextDouble();
            
            System.out.print("Enter the weight for filipino: ");
            filipinoWeight = sc.nextDouble();
            
            
            
           
            double weightedAverage = (mathGrade + englishGrade + scienceGrade + mapehGrade + filipinoGrade) / 5;
            if(weightedAverage >=100){
                System.out.println("Your weighted average is " + weightedAverage + ".Highest Honors");
            } else if (weightedAverage >=95){
                System.out.println("Your weighted average is " + weightedAverage + ".High Honors");
            } else if (weightedAverage >=90){
                System.out.println("Your weighted average is " + weightedAverage + ".Honors");
            } else if (weightedAverage >=89){
                System.out.println("Your weighted average is " + weightedAverage + ".Excellent");
            } else if (weightedAverage >=85){
                System.out.println("Your weighted average is " + weightedAverage + ". Very Good");
            } else if (weightedAverage >=80){
                System.out.println("Your weighted average is " + weightedAverage + ".Good");
            } else if (weightedAverage >=75-0){
                System.out.println("Your weighted average is " + weightedAverage + ".Failed");
            }   
                 
            
            
            
    }
    
}
