package wiki.managers;

public class EnvironmentManager {

    private static String env;

    public static String getEnv() {
        if(env == null) {
            env = System.getenv("WIKI_ENV") == null
                    ? "LOCAL"
                    : System.getenv("WIKI_ENV");
        }
        return env;
    }

}
