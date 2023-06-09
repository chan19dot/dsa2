import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class SnapShotArray {
    private int count;
    private List<TreeMap<Integer, Integer>> shot = new ArrayList<>();

    public SnapShotArray(int length) {
        IntStream.range(0, length).forEach(i -> { shot.add(new TreeMap<>()); });
    }

    public void set(int index, int val) {
        shot.get(index).put(count, val);
    }

    public int snap() {
        return count++;
    }

    public int get(int index, int snap_id) {
        Integer key = shot.get(index).floorKey(snap_id);
        return key == null ? 0 : shot.get(index).get(key);
    }
}
