package jcode.ch_02_collections.q_12_list_to_map_java11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap_01 {
    public static void main(String[] args) {
        List<String> l = List.of("a", "b");
        Map<String, String> m = l.stream().collect(Collectors.toMap(s -> s, s -> s));

        System.out.println("m--->" + m);
    }
}
