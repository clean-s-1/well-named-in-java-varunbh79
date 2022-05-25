package colorcoder;

public class Main {


    public static void main(String[] args) {
        ColorPairHelper.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorPairHelper.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        ColorPairHelper.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorPairHelper.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
