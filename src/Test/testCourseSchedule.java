package Test;

import BFS.CourseSchedule;

public class testCourseSchedule {
    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();
        int[][] test = {{1,2}, {2,0}};
        System.out.println(cs.canFinish(3, test));
    }
}
