package com.greencoxacademy.application.components.services;

import com.greencoxacademy.application.models.Fox;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxServicesToFile implements FoxServices {

    private static Path pathToFile = Paths.get("names.txt");
    public List<Fox> listOfFoxes = new ArrayList<>();
    private List<String> foxesStrings;

    public FoxServicesToFile() {
        createNewFileWithFoxes("names.txt");
        findAll();
    }

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
        newFox.setListOfTricks(Arrays.asList(foxAttr.get(3).substring(foxAttr.get(3).indexOf('[')+1, foxAttr.get(3).indexOf(']')).trim()));
        newFox.setAdmin(Boolean.getBoolean(foxAttr.get(4)));
        return newFox;
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
