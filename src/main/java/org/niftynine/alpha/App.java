package org.niftynine.alpha;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class App 
{
    @Deprecated(forRemoval = true , since = "8")
    void deprecatedMethod(){

    }
    public static void main( String[] args ) throws IOException
    {
        List<String> list = List.of("Hello","World","!");
        String wholeString = String.join(" ",list);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new ByteArrayInputStream(wholeString.getBytes(StandardCharsets.UTF_8)).transferTo(baos);

        System.out.println(baos.toString());
    }
}
