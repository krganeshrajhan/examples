package example.java;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Solution4 {



    public static void main(String[] args) throws IOException {
        FileSystem fs = new FileSystem();
        System.out.println(fs.ls("/"));
        fs.mkdir("/a/b/c");
        fs.addContentToFile("/a/b/c/d", "hello");
        System.out.println(fs.readContentFromFile("/a/b/c/d"));
    }
}

class FileSystem {

    public FileSystem() {

    }

    private Map<String,FileSystem> map = new HashMap<>();
    private boolean isDirectory = true;
    private String content = new String();

    public List<String> ls(String path) {

        List<String> list = new ArrayList<>(map.keySet());
        return list;
    }

    public void mkdir(String path) {
        StringTokenizer st = new StringTokenizer(path,"/");
        if(st.hasMoreTokens()) {
            FileSystem fs = new FileSystem();
            fs.isDirectory = true;
            String token = st.nextToken();
            this.map.put(token, fs);
            fs.mkdir(path.substring(path.indexOf(token)+1));
        }
    }

    public void addContentToFile(String filePath, String content) {
        int nextIndex = filePath.indexOf("/",1);
        if(nextIndex!=-1) {
            String path = filePath.substring(1,nextIndex);
            String subPath = filePath.substring(nextIndex);
            if(map.containsKey(path)) {
                FileSystem fs = map.get(path);
                fs.addContentToFile(subPath, content);
            }
        } else {
            this.mkdir(filePath);
            FileSystem f = this.map.get(filePath.substring(1,filePath.length()));
            f.isDirectory = false;
            f.content = content;
        }
    }

    public String readContentFromFile(String filePath) {
        int nextIndex = filePath.indexOf("/",1);
        if(nextIndex!=-1) {
            String path = filePath.substring(1,nextIndex);
            String subPath = filePath.substring(nextIndex);
            FileSystem fs = map.get(path);
            return fs.readContentFromFile(subPath);
        } else {
            FileSystem fs = map.get(filePath.substring(1,filePath.length()));
            return fs.content;
        }
    }
}

