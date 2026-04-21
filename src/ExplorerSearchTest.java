import static org.junit.Assert.*;
import org.junit.Test;

public class ExplorerSearchTest {


    @Test
    public void testSingleCell() {
        int[][] island = {{0}};
        assertEquals(1, ExplorerSearch.reachableArea(island));
    }


    @Test
    public void testSingleRow() {
        int[][] island = {{1, 1, 0, 1, 1}};
        assertEquals(5, ExplorerSearch.reachableArea(island));
    }


    @Test
    public void testSingleColumn() {
        int[][] island = {
            {1},
            {1},
            {0},
            {1},
            {1},
        };
        assertEquals(5, ExplorerSearch.reachableArea(island));
    }


    @Test
    public void testExplorerOnEdge() {
        int[][] island = {
            {1, 0, 1},
            {1, 1, 1},
        };
        assertEquals(6, ExplorerSearch.reachableArea(island));
    }


    @Test
    public void testFullyOpen() {
        int[][] island = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1},
        };
        assertEquals(9, ExplorerSearch.reachableArea(island));
    }
}
