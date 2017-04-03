package printer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Ghazi Ennacer on 03/04/2017.
 */
public class Printer {


    public static class MessageBuilder implements Message{
        private Status status;
        private Map<String, Object> details;
        private String reference;

        public MessageBuilder(Status status, Map<String, Object> details) {
            this.status = status;
            this.details = details;
            this.reference = UUID.randomUUID().toString();
        }

        public void addDetails(String s, Object o){
            details.put(s,o);
        }

        public MessageBuilder intro(CharSequence sequence){
            CharSequence seq = (CharSequence) details.get("messages");
            return this;
        }

        public MessageBuilder detail(String s, Object o){
            addDetails(s,o);
            return this;
        }

        public MessageBuilder why(Throwable e){
            final StringWriter s = new StringWriter();
            final PrintWriter p = new PrintWriter(s);
            e.printStackTrace(p);
            p.flush();
            return this;
        }

        public MessageBuilder why(String raison){
            final StringWriter s = new StringWriter();
            final PrintWriter p = new PrintWriter(s);
            p.append(raison);
            System.out.println(p);
            return this;
        }
    }
}
