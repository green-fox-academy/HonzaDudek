package com.greencoxacademy.application.components.services;

import com.greencoxacademy.application.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServicesImpl implements FoxServices {

    public List<Fox> listOfFoxes = new ArrayList<>();
    public List<String> listOfTricks = new ArrayList<>();

    public FoxServicesImpl() {
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
        listOfFoxes.add(fox);
    }

    @Override
    public void delete(Fox fox) {
        listOfFoxes.remove(fox);
    }

    @Override
    public void updateFox(Fox oldFox, Fox newFox) {
        listOfFoxes.set(listOfFoxes.indexOf(oldFox), newFox );
    }

    @Override
    public List<String> listAll() {
        List<String> names = new ArrayList<>();
        for (Fox fox: listOfFoxes
             ) {
            names.add(fox.getName());
        }
    return names;
    }



}
