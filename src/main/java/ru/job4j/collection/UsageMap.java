package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("nurik95@gmail.com", "Ivanov Nursultan Ibragimovich");
        map.put("arsen_grozniy@mail.ru", "Armenyan Arsen Ivanovich");
        map.put("kazbeksolncev@rambler.com", "Solncev Kazbek Balbek ogly");
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
