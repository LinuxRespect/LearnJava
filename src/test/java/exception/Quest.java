package exception;

import java.io.OutputStream;

public class Quest {

    int counter;
    OutputStream out;
    Quest(){/* initialization of out */}
    float inc() {
        try { counter++; out.write(counter); }

        catch(java.io.IOException e){}
      //   finally{ };
        return counter;
        //comments
    }
}
