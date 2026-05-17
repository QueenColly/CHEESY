import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HighestOccuringTest {

    @Test
    void testSingleMode() {
        int[] data = {2, 4, 5, 2, 7, 2, 4};
        assertEquals(2, HighestOccuring.findMode(data));
    }
}
