import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void everyStatement() {

        List<String> everyMap = List.of("0","0","#","0","#","#","0","#","0","0","#","0","0","#","#","#");
        List<String> everyCorrect = List.of("1","2","#","2","#","#","4","#","1","3","#","3","1","#","#","#");

        List<String> zeroMap = List.of("0","0","0","0","#","#","0","#","#");
        List<String> zeroCorrect = List.of("0","1","1","1","#","#","1","#","#");

        IllegalArgumentException er;
        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(er.getMessage().contains("List length should be greater than 0"));

        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("#", "#", "0", "#", "#")));
        assertTrue(er.getMessage().contains("List length should be a perfect square"));

        assertEquals(everyCorrect, SILab2.function(everyMap));
        assertEquals(zeroCorrect, SILab2.function(zeroMap));
    }

    @Test
    public void everyBranch() {

        List<String> everyMap = List.of("0","0","#","0","#","#","0","#","0","0","#","0","0","#","#","#");
        List<String> everyCorrect = List.of("1","2","#","2","#","#","4","#","1","3","#","3","1","#","#","#");

        IllegalArgumentException er;
        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(er.getMessage().contains("List length should be greater than 0"));

        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("#", "#", "0", "#", "#")));
        assertTrue(er.getMessage().contains("List length should be a perfect square"));

        assertEquals(everyCorrect, SILab2.function(everyMap));
    }
}
