package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //Create a list of Figures
        // TODO: DK: В java лучше оперировать интерфейсами когда есть возможность а не конкретными имплементациями. т.е. писать List <Figure> figures = new ArrayList<Figure>();
        ArrayList<Figure> figures = new ArrayList<Figure>();
        /**  TODO: DK: При задании типа как строки легко сделать опечатку, и получить ошибку во время выполнения.
         *      для такого рода задач удобно использовать специальные классы Enum - https://www.youtube.com/watch?v=uTF0863-nC8
          */
        figures.add(createFigure("Circle"));
        figures.add(createFigure("Square"));
        figures.add(createFigure("Rectangle"));

        //Find square for every Figure in list
        /**  TODO: DK: В случаях когда нужно пройтись по всем элементам массива или коллекции удобно использовать сокращённую запись цикла for (foreach)
         *             https://www.youtube.com/watch?v=eByBsjUazII
         *
         *       for (Figure figure: figures){
         *             figure.findSquare();
         *             System.out.println(figure.square);
         *         }
         *
         */
        for(int i = 0; i < figures.size(); i++) {
            figures.get(i).findSquare();
            System.out.println(figures.get(i).square);

        }

        //Sort list of Figures by square
        Collections.sort(figures, new Comparator<Figure>() {

            public int compare(Figure a, Figure b) {
                // TODO: DK: В компараторе стоит предусмотреть проверку на NULL чтобы не получить NullPointerException. https://stackoverflow.com/questions/128042/what-to-do-with-null-fields-in-compare
                return a.square > b.square ? 1 : (a.square < b.square) ? -1 : 0;
            }
        });

        //Compare Figures square with number
        compageFiguresWithNumber(figures, 75.14);


        // TODO: DK: Вывод на экран у тебя используется 2 раза (дублирование кода, можно вынести в отдельный метод)
        for(int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i).square);

        }

    }
    //Create Figure
    // TODO: DK: В данном случае это не принципиально, логику создания фигур можно вынести в отдельный класс FigureFactory - c методом createFigure.
    // TODO: DK: В методах лучше давать осмысленные названия параметрам, например "figureType" чтобы было понятно на основе чего создаётся фигура.
    public static Figure createFigure(String str) {
        // TODO: DK: В случаях когда используется много if - условий, для более удобного чтения можно использовать switch - case.
        if (str.toLowerCase().equals("circle")) {
            // TODO: DK: Можно добавить случайности и рандомно выбирать значения длины или радиуса.
            return new Circle(2);
        } else if (str.toLowerCase().equals("square")) {
            return new Square(4);
        } else if (str.toLowerCase().equals("rectangle")){
            return new Rectangle(2,4);
        } else {
            return null;
        }
    }

    //Compare Figures square with value
    // TODO: DK: Kак параметр метода лучше указывать интерфейс List, а не конкретную имплементацию - ArrayList
    // TODO: DK: Так как по условию требовалаось узнать больше или нет сумарная площадь, можно было бы сделать метод не void а возвращающий boolean.
    public static void compageFiguresWithNumber(ArrayList<Figure> array, double sq) {
        double squareSum = 0;
        for(int i = 0; i < array.size(); i++) {
            squareSum += array.get(i).square;
        }
        if (squareSum > sq) {
            System.out.println("Square of all figures is GREATER than a given number!");
        } else if (squareSum < sq) {
            System.out.println("Square of all figures is LESS than a given number!");
        } else {
            System.out.println("Square of all figures EQUALS to a given number!");
        }
    }

}
