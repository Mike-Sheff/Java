package Netologia.task_2_1.task_2_1_1;

public class task_2_1_1 {
    public static void main(String[] args) {
        System.out.println("Задача: Онлайн-читалка.");
        System.out.println("");

        Book firstBook = new Book("Книга первая", "Автор неизестный", "нетология", 2019, 500);
        System.out.println("Пример книги: ");
        //firstBook.printInfoBook();
        System.out.println(firstBook.toString());

        System.out.println("Перелистать с " + firstBook.currentPage + " на 1 страницу назад = " + firstBook.turnPageBack());
        System.out.println("Перелистать с " + firstBook.currentPage + " на 1 страницу назад = " + firstBook.turnPageBack());
        System.out.println("Перелистать с " + firstBook.currentPage + " на 1 страницу назад = " + firstBook.turnPageBack());
        System.out.println("Перелистать с " + firstBook.currentPage + " на 1 страницу вперед = " + firstBook.turnPageForward());
        System.out.println("Перелистать с " + firstBook.currentPage + " на 497 страницу вперед =" + firstBook.turnPageCount(497));
        System.out.println("Перелистать с " + firstBook.currentPage + " на 1 страницу вперед = " + firstBook.turnPageForward());
        System.out.println("Перелистать с " + firstBook.currentPage + " на 1 страницу вперед = " + firstBook.turnPageForward());

        System.out.println("Перелистать на 47 страницу =" + firstBook.turnPage(47));

        System.out.println("");

        Book secondBook = new Book();

        secondBook.nameBook = "Book two";
        secondBook.authorBook = "Unknown author";
        secondBook.publishingHouse = "netologiya";
        secondBook.yearBook = 2018;
        secondBook.countPages = 100;

        System.out.println("Пример книги: ");
        //secondBook.printInfoBook();
        System.out.println(secondBook.toString());

        System.out.println("Перелистать с " + secondBook.currentPage + " на 40 страниц вперед = " + secondBook.turnPageCount(40));
        System.out.println("Перелистать с " + secondBook.currentPage + " на 5 страниц вперед = " + secondBook.turnPageCount(5));
        System.out.println("Перелистать с " + secondBook.currentPage + " на 105 страниц назад = " + secondBook.turnPageCount(-105));
    }
}
