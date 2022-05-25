package colorcoder;

public class ColorPairHelper {

   private static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        int majorColorIndex = zeroBasedPairNumber / ColorPair.numberOfMajorColors ;
        int minorColorIndex = zeroBasedPairNumber % ColorPair.numberOfMinorColors ;
        ColorPair colorPair = retrieveColorPairBasedOnColorIndices(majorColorIndex,minorColorIndex);
        return colorPair;
    }

   private static int GetPairNumberFromColor(MajorColor major,
                                             MinorColor minor) {
        return major.getIndex() * ColorPair.numberOfMinorColors + minor.getIndex() + 1;
    }

    public static void testNumberToPair(int pairNumber,
                                 MajorColor expectedMajor,
                                 MinorColor expectedMinor)
    {
        ColorPair colorPair = GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber)
    {
        int pairNumber = GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }

    private static ColorPair retrieveColorPairBasedOnColorIndices(
            int majorColorIndex,int minorColorIndex) {

       MajorColor majorColor = null;
       MinorColor minorColor = null;
       for(MajorColor color: MajorColor.values()) {
           if(color.getIndex() == majorColorIndex) {
               majorColor = color;
               break;
           }
       }
        for(MinorColor color: MinorColor.values()) {
            if(color.getIndex() == minorColorIndex) {
                minorColor = color;
                break;
            }
        }
       return new ColorPair(majorColor,minorColor);
    }

}
