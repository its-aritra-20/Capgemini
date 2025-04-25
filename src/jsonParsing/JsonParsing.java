package jsonParsing;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsing {

    public static void main(String[] args) throws Exception {

        Map<Integer, List<String>> map = new HashMap<>();
        List<String> list = Arrays.asList("Hello", "World", "Demo");
        map.put(1, list);
        ObjectMapper om = new ObjectMapper();
        String data = om.writeValueAsString(map);
        System.out.println(data);
    }
}
