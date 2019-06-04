import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {
    final String testStr = "samsung and apple and nokia htc";

    @Test
    void stringProcessorTest() {
        StringProcessor testText = new StringProcessor(testStr);
        testText.replaceText("samsung", "apple");
        assertEquals("apple and apple and nokia htc", testText.showResult(), "Error");
    }
    @Test
    void readInputText() throws IOException {
        System.setIn(new ByteArrayInputStream(testStr.getBytes()));
        assertEquals(testStr, StringProcessor.readInputText(), "Error");
    }
}
