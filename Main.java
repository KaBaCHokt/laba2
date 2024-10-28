import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1.1");
        Scanner scanner = new Scanner(System.in);

        Point[] points = new Point[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите координаты для точки " + (i + 1) + ":");
            System.out.print("X: ");
            int x = scanner.nextInt();
            System.out.print("Y: ");
            int y = scanner.nextInt();

            points[i] = new Point(x, y);
        }


        System.out.println("Текстовое представление точек:");
        for (Point point : points) {
            System.out.println(point.toString());
        }


        //задание 2
        System.out.println();
        System.out.println("Задание 2.1");
        System.out.println("Введите координаты для линии 1 через пробел(начальная и конечная точки):");
        Point start1 = new Point(scanner.nextInt(), scanner.nextInt());
        Point end1 = new Point(scanner.nextInt(), scanner.nextInt());
        line line1 = new line(start1, end1);


        System.out.println("Введите координаты для линии 2 через пробел(начальная и конечная точки):");
        Point start2 = new Point(scanner.nextInt(), 10);
        Point end2 = new Point(scanner.nextInt(), 10);
        line line2 = new line(start2, end2);


        line line3 = new line(line1.getStart(), line2.getEnd());


        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);


        System.out.println("Введите новые координаты для линии 1 через пробел(начальная и конечная точки):");
        line1.getStart().setX(scanner.nextInt());
        line1.getStart().setY(scanner.nextInt());
        line1.getEnd().setX(scanner.nextInt());
        line1.getEnd().setY(scanner.nextInt());

        System.out.println("Введите новые координаты для линии 2 через пробел(начальная и конечная точки):");
        line2.getStart().setX(scanner.nextInt());
        line2.getEnd().setX(scanner.nextInt());


        line3.setStart(line1.getStart());
        line3.setEnd(line2.getEnd());


        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);


        System.out.println("Введите новые координаты для линии 1 через пробел(начальная и конечная точки), не затрагивая линию 3:");
        line1.getStart().setX(scanner.nextInt());
        line1.getStart().setY(scanner.nextInt());
        line1.getEnd().setX(scanner.nextInt());
        line1.getEnd().setY(scanner.nextInt());


        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);



        //задание 3.1
        System.out.println();
        System.out.println("Создаем студента Васю с оценками: 3, 4, 5");
        int[] gradesVasya = {3, 4, 5};
        student vasya = new student("Вася", gradesVasya);

        // Создаем студента Петю и копируем оценки Васи
        System.out.println("Создаем студента Петю и копируем оценки Васи");
        student petya = new student("Петя", vasya.getGrades());

        // Заменяем первую оценку Пети на число 5
        System.out.println("Заменяем первую оценку Пети на число 5");
        int[] gradesPetya = petya.getGrades();
        gradesPetya[0] = 5;
        petya.setGrades(gradesPetya);

        // Выводим на экран строковое представление Васи и Пети
        System.out.println("Строковое представление Васи:");
        System.out.println(vasya);
        System.out.println("Строковое представление Пети:");
        System.out.println(petya);

        // Объяснение результата
        System.out.println("Объяснение результата:");
        System.out.println("Оценки Васи не изменились, так как при создании студента Петю мы скопировали массив оценок.");
        System.out.println("Изменение оценок Пети не влияет на оценки Васи.");

        // Создаем студента Андрея и копируем ему оценки Васи
        System.out.println("Создаем студента Андрея и копируем ему оценки Васи");
        student andrey = new student("Андрей", vasya.getGrades());

        // Выводим на экран строковое представление Андрея
        System.out.println("Строковое представление Андрея:");
        System.out.println(andrey);

        // Объяснение результата
        System.out.println("Объяснение результата:");
        System.out.println("Оценки Андрея являются копией оценок Васи, поэтому изменение оценок Васи не влияет на оценки Андрея.");


        System.out.println();
        System.out.println("Задание 4.1");
        System.out.println("Введите координаты точки (X Y):");
        Point point1 = new Point(scanner.nextInt(), scanner.nextInt());
        System.out.println(point1);

        // Создаем и выводим на экран точку с координатами 25;6
        System.out.println("Введите координаты точки (X Y):");
        Point point2 = new Point(scanner.nextInt(), scanner.nextInt());
        System.out.println(point2);

        // Создаем и выводим на экран точку с координатами 7;8
        System.out.println("Введите координаты точки (X Y):");
        Point point3 = new Point(scanner.nextInt(), scanner.nextInt());
        System.out.println(point3);


        System.out.println();
        System.out.println("Задание 4.7");
        System.out.println("Создаем студента Вася с оценками: 3, 4, 5");
        student vasya2 = new student("Вася", 3, 4, 5);
        System.out.println(vasya2);

        // Создаем студента Максим без оценок
        System.out.println("Создаем студента Максим без оценок");
        student maxim = new student("Максим");
        System.out.println(maxim);


        System.out.println();
        System.out.println("Задание 5.6");
        System.out.println("Введите имя студента  и его оценки (через пробел):");
        String vasyaName = scanner.next();
        int[] vasyaGrades = new int[4];
        for (int i = 0; i < 4; i++) {
            vasyaGrades[i] = scanner.nextInt();
        }
        student vasya3 = new student(vasyaName, vasyaGrades);
        System.out.println(vasya3);
        System.out.println("Средний балл: " + vasya3.getAverageGrade());
        System.out.println("Отличник: " + (vasya3.isExcellentStudent() ? "Да" : "Нет"));

        // Создаем студента Петю с оценками 5, 5, 5, 5
        System.out.println("Введите имя студента  и его оценки (через пробел):");
        String petyaName = scanner.next();
        int[] petyaGrades = new int[4];
        for (int i = 0; i < 4; i++) {
            petyaGrades[i] = scanner.nextInt();
        }
        student petya3 = new student(petyaName, petyaGrades);
        System.out.println(petya3);
        System.out.println("Средний балл: " + petya3.getAverageGrade());
        System.out.println("Отличник: " + (petya3.isExcellentStudent() ? "Да" : "Нет"));


        scanner.close();
    }
}