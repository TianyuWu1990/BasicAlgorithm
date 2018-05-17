package BFS;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // write your code here
        if (numCourses < 1) {
            return true;
        }

        if (prerequisites.length == 0 || prerequisites[0].length == 0) {
            return true;
        }

        HashMap<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();

        for (int i = 0; i < numCourses; i++) {
            map.put(i, new HashSet<Integer>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            map.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int remainCourse = numCourses;
        Queue<Integer> q = new LinkedList<Integer>();

        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 0) {
                q.offer(entry.getKey());
                remainCourse--;
            }
        }

        while (!q.isEmpty()) {
            int course = q.poll();
            for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
                if (entry.getValue().contains(course)) {
                    entry.getValue().remove(course);

                if (entry.getValue().size() == 0) {
                    q.offer(entry.getKey());
                    remainCourse--;
                }
                }
            }
        }
        return remainCourse == 0;
    }
}
