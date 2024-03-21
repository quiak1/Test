/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucvonglap;

import java.util.Scanner;

public class CauTrucVongLap {
    public static int age;
    public static String gender;
    public static String profession;
    public static int pa;
    public static void main(String[] args) {
        System.out.println("Bài 1:");
        Scanner input = new Scanner(System.in);
        System.out.println("Input age: ");
        age = input.nextInt();
        System.out.println("Input gender: ");
        gender = input.next();
        System.out.println("Input Profession: ");
        profession = input.next();
        System.out.println("Input Personal assets: ");
        pa = input.nextInt();
        Gender(gender);
    }    
    public static void Profession (String profession){
            switch (profession) {
		case "se": 
			ifAgePA();
			break;
		case "pro":
			ifAgePA();
			break;
		case "retired":
			ifAgePA();
			break;
                default:
                        System.out.println("Truong hop nay ko co");
			break;
            }
    }
    public static void Gender(String gender) {
            switch (gender) {
		case "M":
			Profession(profession);
			break;
		case "F":
			Profession(profession);
			break;
		default:
                        System.out.println("Truong hop nay ko co");
			break;
                }  
    }
    public static void ifAgePA(){
            if ((age > 16 || age < 25) &&  (pa > 2500)){
            System.out.println("abcxyz");
            //them cac dieu kien khac nua
    }
    }
}
//(age > 16 || age < 25) &&  (pa > 2500)) &&
//((age > 16 || age < 25) && (gender.equals("M") || gender.equals("F")) &&  (pa > 2500)) && (profession.equals("se") || profession.equals("pro"))