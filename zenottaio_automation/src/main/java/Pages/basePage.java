package Pages;

public class basePage {
    
    public static String ORPATH = getAbsolutePath("Locators");

    protected static String getAbsolutePath(String providedPath) {
        String newPath[] = providedPath.split(">");
        String path = System.getProperty("user.dir");
        String OS = System.getProperty("os.name");

        if (OS.contains("Win")) {
            int spaceIndex = path.lastIndexOf("\\");
//			        path = path.substring(0, spaceIndex);
            for (int i = 0; i < newPath.length; i++) {
                path = path + "\\" + newPath[i];
            }
            path = path + "\\";
        } else {
            int spaceIndex = path.lastIndexOf("/");
//		           path = path.substring(0, spaceIndex);
            for (int i = 0; i < newPath.length; i++) {
                path = path + "/" + newPath[i];
            }
            path = path + "/";
        }
        return path;
    }
}
