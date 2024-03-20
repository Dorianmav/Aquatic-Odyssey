package fr.mav.AquaticOdyssey.ui;

import javax.swing.JPanel;

import fr.mav.AquaticOdyssey.AquaticOdysseyApplication;

import java.awt.Color;
import java.awt.Graphics;

public class Canva extends JPanel {

    int cellSize = 10;

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        var i = 0;
        var width = AquaticOdysseyApplication.ocean.area.length;
        var height = AquaticOdysseyApplication.ocean.area[0].length;
        var cellWidth = this.getWidth() / Math.max(width, 1);
        var cellHeight = this.getHeight() / Math.max(height, 1);

        for (var row : AquaticOdysseyApplication.ocean.area) {
            var j = 0;
            for (int r : row) {
                switch (r) {
                    // empty
                    case 0:
                        break;

                    // Algae
                    case 1:
                        g.setColor(Color.GREEN);
                        g.fillRect(i * cellWidth, j * cellHeight, cellWidth, cellHeight);
                        break;

                    // Fish
                    case 2:
                        g.setColor(Color.BLUE);
                        g.fillRect(i * cellWidth, j * cellHeight, cellWidth, cellHeight);
                        break;

                    // Shark
                    case 3:
                        g.setColor(Color.BLACK);
                        g.fillRect(i * cellWidth, j * cellHeight, cellWidth, cellHeight);
                        break;
                    default:
                        break;
                }
                j++;
            }
            i++;
        }
    }
}
