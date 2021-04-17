
package org.agoncal.book;

import org.agoncal.book.service.BookService;
import org.agoncal.book.service.Book;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author emaph
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*** org agoncal main ****");
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        BookService bookService = container.instance().select(BookService.class).get();

        Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

        System.out.println(book);

        weld.shutdown();
    }
}
