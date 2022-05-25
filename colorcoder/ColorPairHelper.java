package colorcoder;

public class ColorPairHelper {

   public static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.numberOfMajorColors);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

   public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
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
}
