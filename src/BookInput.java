import javax.swing.*;

public class BookInput {


    public static void main(String[] args) {

        Book favBook = new Book() ;
        ISBN();

        String title = JOptionPane.showInputDialog(null,"Please enter the name of your favourite book: ");
        while(title.equals("")){


             title = JOptionPane.showInputDialog(null,"Invalid Entry!! Please enter the name of your favourite book: ");
        }
        favBook.setTitle(title);


        Float price=(Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the Price of your favourite book: ")));

        favBook.setPrice(price);

        String ISBN = JOptionPane.showInputDialog(null,"Please enter the name of your favourite book: ");
        while(title.equals("")  ){

            ISBN = JOptionPane.showInputDialog(null,"Invalid Entry!! Please enter the name of your favourite book: ");
        }





        favBook.getTitle();
        favBook.getPrice();

        JOptionPane.showMessageDialog(null,favBook.getTitle()+"    " +favBook.getPrice());

        Book hateBook = new Book() ;

        hateBook.setTitle ( JOptionPane.showInputDialog(null,"Please enter the name of your least favourite book: "));

        hateBook.getTitle();

        JOptionPane.showMessageDialog(null,hateBook.getTitle());
    }

    public static String ISBN(){

        return ISBN;
    }
}
