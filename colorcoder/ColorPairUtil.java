package colorcoder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ColorPairUtil {

    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    public static Map<Integer,ColorPair> getColorCodingPairMap() {
        Map<Integer,ColorPair> colorPairMap  = new ConcurrentHashMap<>();
        for(MajorColor majorColor : MajorColor.values()) {
            for(MinorColor minorColor : MinorColor.values()) {
                colorPairMap.put(atomicInteger.incrementAndGet(),
                        new ColorPair(majorColor,minorColor));
            }
        }
        return colorPairMap;
    }


}
