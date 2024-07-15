import java.util.*;

public class Sgrades {
    public static void main(String[] args) {
        int i, sno, h, l, a;
        int s = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Number of students appeared for the exam: ");
        sno = s1.nextInt();
        int[] sg = new int[100];
        
        for (i = 0; i < sno; i++) {
            System.out.println("Enter grade of student " + (i + 1) + ": ");
            sg[i] = s1.nextInt();
        }
        
        h = sg[0];
        l = sg[0];
        
        for (i = 0; i < sno; i++) {
            s = s + sg[i];
            if (sg[i] > h) {
                h = sg[i];
            }
            if (sg[i] < l) {
                l = sg[i];
            }
        }
        
        a = s / sno;
        
        System.out.println("Highest grade of the class: " + h);
        System.out.println("Lowest grade of the class: " + l);
        System.out.println("Average grade of the class: " + a);
    }
}
