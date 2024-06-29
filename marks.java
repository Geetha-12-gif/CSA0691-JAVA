import java.util.*;


public class marks {
    int pm, cm, cpm, jm;

    void get(int m1, int m2, int m3, int m4) {
        pm = m1;
        cm = m2;
        cpm = m3;
        jm = m4;
    }
}

class average extends marks {
    int total;
    double avg;

    void cal1() {
        total = pm + cm + cpm + jm;
        avg = total / 4;
        System.out.println("Total marks is: " + total);
        System.out.println("Average marks is: " + avg);
    }
}

class grade extends average {
    void grade_display() {
        if (avg >= 90) {
            System.out.println("Distinction");
        } else if (avg < 90 && avg > 70) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}


    public static void main(String[] args) {
        marks obj1 = new marks();
        average obj2 = new average();
        grade obj3 = new grade();
        obj1.get(90, 92, 93, 95);
        obj2.cal1();
        obj3.grade_display();
    }
}