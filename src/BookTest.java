public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.toString());


        Book book2 = new Book("jaws", 12.50f, "12e", 157);
        System.out.println(book2.toString());

        Book book3 = new Book();

        book3.setTitle("Harry POTTER");
        book3.setPrice(14.50f);
        book3.setPages(156);
        book3.setISBN("876t");

        book3.getTitle();
        book3.getPrice();
        book3.getISBN();
        book3.getPrice();

        System.out.println(book3.toString());
    }


}
