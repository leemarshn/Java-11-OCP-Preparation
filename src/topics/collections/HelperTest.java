package topics.collections;

import java.io.FileNotFoundException;

public class HelperTest {
    public static <U extends Exception> void PrintException(U u){
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        HelperTest.PrintException(new NullPointerException("message"));
        HelperTest.PrintException(new FileNotFoundException("file not found"));
        HelperTest.PrintException(new Exception("exception"));
        //HelperTest.<Throwable>PrintException(new Throwable("throwable"));
        HelperTest.<NullPointerException>PrintException(new NullPointerException("null pointer exception"));
      //  PrintException(new Throwable("throwable"));
        PrintException(new RuntimeException("Runtime exception"));
        //<Exception>PrintException(new Exception("wrong"));
    }
}
