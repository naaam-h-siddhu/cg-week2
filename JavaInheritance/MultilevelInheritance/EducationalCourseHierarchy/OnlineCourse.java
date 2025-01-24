package EducationalCourseHierarchy;

public class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Platform : "+platform);
        System.out.println("Is it recorded"+((isRecorded)? "YES" : "NO"));
    }
}

