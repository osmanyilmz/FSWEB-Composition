package org.example;

import org.example.model.Bed;
import org.example.model.Lamp;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;
import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 60, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 80);
        Wardrobe wardrobe = new Wardrobe(2,1, 3);
        Carpet carpet = new Carpet(200, 300, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("Bedroom: " + bedroom.getName());
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());
    }
}