package colorcoder;

import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Main main = new Main();
        ColorPairHelper.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorPairHelper.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        ColorPairHelper.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorPairHelper.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        Map<Integer,ColorPair> colorCodingPairMap = ColorPairUtil.getColorCodingPairMap();
        main.printColorCodingReferenceManual(colorCodingPairMap);

    }

    private void printColorCodingReferenceManual(Map<Integer,ColorPair> colorCodingPairMap) {
        System.out.println("**********************************");
        System.out.println("Pair No.|| MajorColor || MinorColor");
        for(Map.Entry<Integer,ColorPair> colorPairEntry : colorCodingPairMap.entrySet()) {
            System.out.println(colorPairEntry.getKey()+" ---------"
                    + colorPairEntry.getValue().getMajor()+" ----------"
                    + colorPairEntry.getValue().getMinor());
        }
    }
}
