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
    public void testFile() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        MarkdownParse m = new MarkdownParse();
        ArrayList<String> links = m.getLinks(content);
        ArrayList<String> correct_links = new ArrayList<>(Arrays.asList("https://something.com", "some-thing.html"));
        assertEquals(links, correct_links);
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
}