import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishesInTheSeaTest {

    FishesInTheSea fishesInTheSea = new FishesInTheSea();

    @Test
    void solve() {
        int[][] fish1 = {
                { 1, 3, 1, 5 },
                { 2, 2, 4, 1 },
                { 5, 0, 2, 3 },
                { 0, 6, 1, 2 }};
        int[][] fish2 = {
                { 10, 0, 0, 0 },
                { 2, 1, 3, 4 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 5, 6, 7, 8 }};
        assertEquals(16, fishesInTheSea.solve(fish1));
        assertEquals(26, fishesInTheSea.solve(fish2));
    }
}