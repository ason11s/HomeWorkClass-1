public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("Джоан" , "Роллинг");
        Author author2 = new Author("Джон" , "Толкин");
        Author author3 = new Author("Джоан" , "Роллинг");

        Book book1 = new Book("Гарри Потер и филосовский камень", author1, 1995);
        Book book2 = new Book("Властелин колец", author2, 1937);
        Book book3 = new Book("Гарри Потер и филосовский камень", author3, 1995);

        System.out.println(book1);
        System.out.println(book2);


    //    book1.setPublicationYear(2000);

    //    System.out.println(" Информация о книгах после изменения : ");
     //   System.out.println(book1);
     //   System.out.println(book2);


        System.out.println(" Сравнивая 1го и 2го автора: " + author1.equals(author2));
        System.out.println(" Сравнивая 1го и 3го автора: " + author1.equals(author3));

        System.out.println(" Сравнивая 1ую и 2ую книгу: " + book1.equals(book2));
        System.out.println(" Сравнивая 1ую и 3ую книгу: " + book1.equals(book3));


    }
}