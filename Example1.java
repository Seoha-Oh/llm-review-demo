
package demo;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

public class Example1 {

    public static String f1(String path) throws IOException {
        FileInputStream in = new FileInputStream(path);
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        return new String(buf, 0, len, StandardCharsets.UTF_8);
    }

    public static String f2(String path) throws IOException {
        try (FileInputStream in = new FileInputStream(path)) {
            byte[] buf = in.readAllBytes();
            return new String(buf, StandardCharsets.UTF_8);
        }
    }


    public static int f3(List<String> items, int index) {
        return items.get(index).length(); 
    }

    public static int f4(List<String> items, int index) {
        Objects.requireNonNull(items, "items must not be null");
        if (index < 0 || index >= items.size()) {
            throw new IllegalArgumentException("index out of range: " + index);
        }
        String value = Objects.requireNonNull(items.get(index), "item must not be null");
        return value.length();
    }
}
