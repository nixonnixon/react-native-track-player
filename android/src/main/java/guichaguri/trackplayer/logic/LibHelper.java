package guichaguri.trackplayer.logic;

/**
 * @author Guilherme Chaguri
 */
public class LibHelper {

    private static Boolean EXOPLAYER = null;
    private static Boolean PROXY_CACHE = null;

    public static boolean isExoPlayerAvailable() {
        return false;
    }

    public static boolean isProxyCacheAvailable() {
        if(PROXY_CACHE == null) {
            PROXY_CACHE = isAvailable("com.danikula.videocache.HttpProxyCacheServer");
        }
        return PROXY_CACHE;
    }

    private static boolean isAvailable(String className) {
        try {
            Class.forName(className);
        } catch(ClassNotFoundException ex) {
            return false;
        }
        return true;
    }

}
