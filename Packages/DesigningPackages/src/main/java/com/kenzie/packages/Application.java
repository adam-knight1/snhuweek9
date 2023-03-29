package com.kenzie.packages;

//import dependencies
import com.kenzie.packages.book.service.BookRequestService;
import com.kenzie.packages.logger.service.Logger;
import com.kenzie.packages.model.LibraryBook;

import java.util.ArrayList;


public class Application {


    /*
        This method should take in a response String as a parameter.
        It should instantiate a LibraryBook object and
        use the response string to set book info. Return the generated object.
     */
    public static LibraryBook convertResponseToLibraryBook(String response){
        LibraryBook libraryBook1 = new LibraryBook();
        libraryBook1.setBookInfo(response);

        return libraryBook1;
    }

    /*
        This method should take in 5 formatted response Strings.
        Within the method, instantiate five LibraryBook objects.
        Create an `ArrayList<LibraryBook>` object, fill it with generated books,
        and return the resultant ArrayList.
     */
    public static ArrayList<LibraryBook> returnBookList(String response1,
                                                        String response2,
                                                        String response3,
                                                        String response4,
                                                        String response5) {

            /* Claire talked about something like this in the lecture, but I thought it was referring
            to instantiating the singleton (avoiding repetition, so I don't know if there is a better way to do this */
        LibraryBook libraryBook1 = new LibraryBook();
        LibraryBook libraryBook2 = new LibraryBook();
        LibraryBook libraryBook3 = new LibraryBook();
        LibraryBook libraryBook4 = new LibraryBook();
        LibraryBook libraryBook5 = new LibraryBook();
        libraryBook1.setBookInfo(response1);
        libraryBook2.setBookInfo(response2);
        libraryBook3.setBookInfo(response3);
        libraryBook4.setBookInfo(response4);
        libraryBook5.setBookInfo(response5);
        ArrayList<LibraryBook> listOfBooks = new ArrayList<>();

        //there has got to be a better way to do this... =P

        listOfBooks.add(libraryBook1);
        listOfBooks.add(libraryBook2);
        listOfBooks.add(libraryBook3);
        listOfBooks.add(libraryBook4);
        listOfBooks.add(libraryBook5);


        return listOfBooks;
    }

    public static void main(String[] args) {
        // Use these constant values as test input
        final String BOOK_1 = "The Hobbit|J.R.R. Tolkien||";
        final String BOOK_2 = "Dune|Frank Herbert||";
        final String BOOK_3 = "The Nonsense Book|Mr. Myzlplk||";
        final String BOOK_4 = "The Cat in the Hat|Dr. Seuss||";
        final String BOOK_5 = "The Art of War|Sun Tzu||";


        //I am straight up not sure if I did this correctly, as all the tests are already passing before even trying this.
        //Any advice is appreciated on how it could be corrected or made more efficient!
        try {
            Logger logger = Logger.getInstance();
            logger.logMessage("Process Starting");
            String responseString1 = BookRequestService.sendGetRequest(BOOK_1);
            String responseString2 = BookRequestService.sendGetRequest(BOOK_2);
            String responseString3 = BookRequestService.sendGetRequest(BOOK_3);
            String responseString4 = BookRequestService.sendGetRequest(BOOK_4);
            String responseString5 = BookRequestService.sendGetRequest(BOOK_5);
            logger.logMessage(responseString1);
            logger.logMessage(responseString2);
            logger.logMessage(responseString3);
            logger.logMessage(responseString4);
            logger.logMessage(responseString5);

            returnBookList(responseString1,responseString2,responseString3,responseString4,responseString5);
            System.out.println(responseString2);  //it works I think!
            System.out.println(responseString1);
            System.out.println(responseString3);
            logger.logMessage("Process Complete");



            // Write code inside this try/catch block
            // 1. Instantiate Singleton Logger object to log: "Process starting"
            // 2. Repeat for all five books listed (you do not need to loop):
            //      a. Call BookRequestService.sendGetRequest()
            //      b. Get the String response as the return value
            //      c. Use Logger to log each response string
            // 3. Call the returnBookList() method with each response string
            //        and print the results with System.out.println()
            //        to make sure the method works and toString() is overridden.
            // 4. User Logger to log: "Process complete"

        }
        catch (Exception e){

            System.out.println("Error occurred: unable to request book info");
            System.out.println("Exception info:" + e.getMessage());

        }
    }

}