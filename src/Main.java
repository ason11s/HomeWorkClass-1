public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("Джоан" , "Роллинг");
        Author author2 = new Author("Джон" , "Толкин");

        Book book1 = new Book("Гарри Потер и филосовский камень", author1, 1995);
        Book book2 = new Book("Властелин колец", author2, 1937);

        System.out.println(book1);
        System.out.println(book2);


        book1.setPublicationYear(2000);

        System.out.println(" Информация о книгах после изменения : ");
        System.out.println(book1);
        System.out.println(book2);


    }
}