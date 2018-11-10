package com.greencoxacademy.application.components.services;

import com.greencoxacademy.application.models.Fox;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxServicesImpl implements FoxServices {

    private static Path pathToFile = Paths.get("names.txt");
    public List<Fox> listOfFoxes = new ArrayList<>();
    private List<String> listOfTricks = new ArrayList<>(Arrays.asList("HTML","CSS","JavaScript","Java","C#" ));
    private List<String> listOfFood = new ArrayList<>(Arrays.asList("Pizza", "Burger", "Sandwich", "Chocolate", "Beans"));
    private List<String> listOfDrinks = new ArrayList<>(Arrays.asList("Water","Lemonade","Coke","Juice","Coffee" ));
    private List<String> foxesStrings;

    public FoxServicesImpl() {
        createNewFileWithFoxes("names.txt");
        findAll();
    }

    /* Creation and manipulation fo file with Foxes */

    private static void createNewFileWithFoxes(String filename) {
        // Gets path to a new file
        Path pathToTasks = Paths.get(filename);
        // If the file with same name does not exists, it creates new file
        if (!Files.exists(pathToTasks)) {
            try {
                Files.createFile(pathToTasks);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void writeToFile() {
        List<String> foxesAsStrings = new ArrayList<>();
        for (Fox fox : listOfFoxes
        ) {
            foxesAsStrings.add(fox.toString());
        }
        try {
            Files.write(pathToFile, foxesAsStrings);
            foxesAsStrings.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Fox> findAll() {
        try {
            foxesStrings = Files.readAllLines(pathToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String fox : foxesStrings
        ) {
            listOfFoxes.add(toFox(fox));
        }
        return listOfFoxes;
    }

    public Fox toFox(String fox) {
        ArrayList<String> foxAttr = new ArrayList<>(Arrays.asList(fox.split(",")));
        Fox newFox = new Fox();
        newFox.setName(foxAttr.get(0));
        newFox.setFood(foxAttr.get(1));
        newFox.setDrink(foxAttr.get(2));
        if (foxAttr.get(3).length() > 3) {
            for (int i = 3; i < foxAttr.size()-1; i++) {
                if (i == 3) {
                    newFox.addTrick(foxAttr.get(i).substring(foxAttr.get(i).indexOf('[') + 1));
                } else if (i == foxAttr.size() - 2) {
                    newFox.addTrick(foxAttr.get(i).substring(0, foxAttr.get(i).indexOf(']') - 1).trim());
                } else {
                    newFox.addTrick(foxAttr.get(i));
                }
            }
        }
        if (foxAttr.get(foxAttr.size()-1).equalsIgnoreCase("true")) {
            newFox.setAdmin(true);
        } else {
            newFox.setAdmin(false);
        }
        return newFox;
    }

    /* Creation and manipulation of lists */

    public String getRandomElement(List<String> list) {
        return list.get((int)(Math.random()*(list.size()-1)+1));
    }


    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public void addTrick(String newTrick) {
        this.listOfTricks.add(newTrick);
    }

    public List<String> getListOfDrinks() {
        return listOfDrinks;
    }

    public void addDrink(String newDrink) {
        this.listOfDrinks.add(newDrink);
    }

    public List<String> getListOfFood() {
        return listOfFood;
    }

    public void addFood(String newFood) {
        this.listOfFood.add(newFood);
    }


    @Override
    public Fox getFox(String name) {
        for (Fox fox : listOfFoxes
        ) {
            if (fox.getName().equalsIgnoreCase(name)) {
                return fox;
            }
        }
        return null;
    }

    @Override
    public void add(Fox fox) {
        if (!listOfFoxes.contains(fox)) {
            listOfFoxes.add(fox);
        }
        writeToFile();
    }

    @Override
    public void delete(Fox fox) {
        listOfFoxes.remove(fox);
        writeToFile();
    }

    @Override
    public void updateFox(Fox oldFox, Fox newFox) {
        listOfFoxes.set(listOfFoxes.indexOf(oldFox), newFox );
        writeToFile();
    }

    @Override
    public List<String> listAll() {
        List<String> names = new ArrayList<>();
        for (Fox fox : listOfFoxes
        ) {
            names.add(fox.getName());
        }
        return names;
    }





}
