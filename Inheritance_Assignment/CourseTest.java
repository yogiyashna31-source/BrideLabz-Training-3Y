package Inheritance_Assignment;

class Course {
    String courseName;
    int duration;

    Course(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean recorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = recorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean recorded, double fee, double discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        System.out.println(courseName + " (" + duration + " hrs), Platform: " + platform + 
                           ", Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Mastery", 40, "Udemy", true, 199.99, 20);
        poc.displayDetails();
    }
}
