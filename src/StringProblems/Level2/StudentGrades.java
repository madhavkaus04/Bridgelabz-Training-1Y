package StringProblems.Level2;

public class StudentGrades {
        static int[][] generateMarks(int students) {
            int[][] marks = new int[students][3];
            for (int i = 0; i < students; i++) {
                for (int j = 0; j < 3; j++) {
                    marks[i][j] = (int)(Math.random() * 51) + 50;
                }
            }
            return marks;
        }
        static String grade(double percent) {
            if (percent >= 80) return "A";
            if (percent >= 70) return "B";
            if (percent >= 60) return "C";
            if (percent >= 50) return "D";
            if (percent >= 40) return "E";
            return "R";
        }
        public static void main(String[] args) {
            int students = 5;
            int[][] marks = generateMarks(students);
            System.out.println("Stu\tM1\tM2\tM3\t%\tGrade");
            for (int i = 0; i < students; i++) {
                int total = marks[i][0] + marks[i][1] + marks[i][2];
                double percent = total / 3.0;
                System.out.println(
                        (i+1) + "\t" +
                                marks[i][0] + "\t" +
                                marks[i][1] + "\t" +
                                marks[i][2] + "\t" +
                                String.format("%.2f", percent) + "\t" +
                                grade(percent)
                );
            }
        }
    }


