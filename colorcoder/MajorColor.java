package colorcoder;

public enum MajorColor  {

    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);

    private final int index;

    private MajorColor(int index) {
        this.index = index;
    }

    int getIndex() {
        return index;
    }

}
