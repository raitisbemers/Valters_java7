import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Book book1 = new Book("1234567890", "Story Of My Life", "Unknown", 10);
        Book book2 = new Book("0987654321", "Story Of Your Life", "Stalker", 88);
        Book book3 = new Book("4578945217", "Life Of My Story", "Dreamer", 100);
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);

        bookshelf.getBooks().forEach(book -> log.info(book.getTitle()));

//        System.out.println("Java7 Maven project");
//        try{
//            throw  new RuntimeException("Nereala kluda");
//        }catch (RuntimeException e){
//            log.error("Java7 Maven project", e);
//        }
//        log.info("Java7 Maven project");
//        log.debug("Java7 Maven project");
//        log.error("Java7 Maven project");
//        log.warn("Java7 Maven project");
//        log.trace("Java7 Maven project");
    }
}
