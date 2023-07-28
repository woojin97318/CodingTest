import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Student> studentList = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i])
                studentList.add(new Student(rank[i], i));
        }
        
        studentList = studentList.stream()
            .sorted(Comparator.comparing(Student::getRank))
            .collect(Collectors.toList());
        
        int a = studentList.get(0).getIndex();
        int b = studentList.get(1).getIndex();
        int c = studentList.get(2).getIndex();
        
        return 10000 * a + 100 * b + c;
    }
}

class Student {
    private int rank;
    private int index;

    public Student(int rank, int index) {
        this.rank = rank;
        this.index = index;
    }

    public int getRank() {
        return rank;
    }

    public int getIndex() {
        return index;
    }
}