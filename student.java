import java.util.Arrays;
public class student {
    private String name;
    private int[] grades;

    public student(String name, int... grades) {
        this.name = name;
        this.grades = grades.clone(); // Копируем массив оценок
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades.clone(); // Возвращаем копию массива оценок
    }

    public void setGrades(int[] grades) {
        this.grades = grades.clone(); // Копируем массив оценок
    }
    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public boolean isExcellentStudent() {
        if (grades.length == 0) {
            return false;
        }
        for (int grade : grades) {
            if (grade != 5) {
                return false;
            }
        }
        return true;
    }


    public String toString() {
        return "Имя: " + name + " [оценка1, оценка2,…,оценкаN] = " + Arrays.toString(grades);
    }

}
