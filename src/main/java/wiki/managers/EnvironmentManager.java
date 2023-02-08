package wiki.managers;

public class EnvironmentManager {

    private static String env;

    public static String getEnv() {
        if(env == null) {
            env = System.getenv("CUCUMBER_ENV") == null
                    ? "LOCAL"
                    : System.getenv("CUCUMBER_ENV");
        }
        return env;
    }

}
