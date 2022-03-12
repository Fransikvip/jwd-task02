package by.tc.task01.dao;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class PropertyRead {

    private final static String PATH = ".\\src\\main\\resources\\appliances_db.txt";
    private final static String REGULAR = "\\s*(\\s|,|:|;)\\s*";

    public static ArrayList<String> readDoc(Criteria criteria) throws IOException {
        File file = new File(PATH);
        ArrayList<String> appliances = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = reader.readLine()) != null) {
                if (s.contains(criteria.getGroupSearchName())) {
                    appliances.add(s);
                }
            }
        } catch (IOException e) {
            throw new IOException();
        }

        return appliances;
    }


    public static Map<String, Object> parsing(String appliance) {
        Map<String, Object> inf = new HashMap<>();
        String[] s = appliance.split(REGULAR);
        for (String value : s) {
            if (value.equalsIgnoreCase(Oven.class.getSimpleName()) || value.equalsIgnoreCase(Laptop.class.getSimpleName())
                    || value.equalsIgnoreCase(Refrigerator.class.getSimpleName()) || value.equalsIgnoreCase(Speakers.class.getSimpleName())
                    || value.equalsIgnoreCase(TabletPC.class.getSimpleName()) || value.equalsIgnoreCase(VacuumCleaner.class.getSimpleName())) {
                continue;
            }

            int index = value.indexOf("=");
            inf.put(value.substring(0, index), value.substring(index + 1));
        }

        return inf;
    }
}