package codingame;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileFInder {

    public static void main(String[] args) {
        String fileName = "att.pdf";
        File root = new File("/home/sp/Documents");
        String path = null;
        path = fileFinder(fileName, root);
        System.out.println(path);
    }

    private static String fileFinder(String fileName, File root) {
        String path = null;
        if(root.isDirectory()){
            File[] files = root.listFiles();
            if(files == null || files.length <1)return null;
            Iterator<File> iterator = Arrays.stream(files).iterator();
            while (iterator.hasNext() && path == null){
                path = fileFinder(fileName, iterator.next() );
            }
        }else {
            Pattern pattern = Pattern.compile(fileName);
            Matcher matcher = pattern.matcher(root.getName());
            if(matcher.matches()){
                path = root.getAbsolutePath();
            }
        }
        return  path;
    }
}
