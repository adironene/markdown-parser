import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test2() throws IOException {
        Path fileName = Path.of("test2.md");
        String content = Files.readString(fileName);
        MarkdownParse m = new MarkdownParse();
        ArrayList<String> links = m.getLinks(content);
        ArrayList<String> correct_links = new ArrayList<>(Arrays.asList("https://something.com"));
        assertEquals(links, correct_links);
    }

    @Test
    public void test3() throws IOException {
        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);
        MarkdownParse m = new MarkdownParse();
        ArrayList<String> links = m.getLinks(content);
        ArrayList<String> correct_links = new ArrayList<>(Arrays.asList());
        assertEquals(links, correct_links);
    }

    @Test
    public void testImage() throws IOException {
        Path fileName = Path.of("testImage.md");
        String content = Files.readString(fileName);
        MarkdownParse m = new MarkdownParse();
        ArrayList<String> links = m.getLinks(content);
        ArrayList<String> correct_links = new ArrayList<>(Arrays.asList());
        assertEquals(links, correct_links);
    }

    /**
     * 
     * Lab 4 tests
     */

    // @Test
    // public void testSnippet1() throws IOException {
    //     Path fileName = Path.of("lab4-snippet1.md");
    //     String content = Files.readString(fileName);
    //     MarkdownParse m = new MarkdownParse();
    //     ArrayList<String> links = m.getLinks(content);
    //     ArrayList<String> correct_links = new ArrayList<>(Arrays.asList("a.com", "a.com(())", "example.com"));
    //     assertEquals(correct_links, links);
    // }

    // @Test
    // public void testSnippet2() throws IOException {
    //     Path fileName = Path.of("lab4-snippet2.md");
    //     String content = Files.readString(fileName);
    //     MarkdownParse m = new MarkdownParse();
    //     ArrayList<String> links = m.getLinks(content);
    //     ArrayList<String> correct_links = new ArrayList<>(Arrays.asList("`google.com", "google.com", "ucsd.edu"));
    //     assertEquals(correct_links, links);
    // }

    // @Test
    // public void testSnippet3() throws IOException {
    //     Path fileName = Path.of("lab4-snippet3.md");
    //     String content = Files.readString(fileName);
    //     MarkdownParse m = new MarkdownParse();
    //     ArrayList<String> links = m.getLinks(content);
    //     ArrayList<String> correct_links = new ArrayList<>(Arrays.asList("https://twitter.com/",
    //             "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/"));
    //     assertEquals(correct_links, links);
    // }
}

// javac -cp libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar:. MarkdownParseTest.java
// java -cp libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar:.org.junit.runner.JUnitCore MarkdownParse