package fr.mav.AquaticOdyssey;

import java.util.Random;

/**
 * Si une cellule est vide et a exactement 3 voisins (algues ou poissons), elle
 * donne naissance à un nouveau poisson.
 * 
 * Si une cellule est occupée par un poisson et a exactement 2 ou 3 voisins
 * algues, le poisson survit.
 * 
 * Si une cellule est occupée par un requin et a exactement 2 ou 3 voisins
 * poissons, le requin survit.
 * 
 * Si une cellule est occupée par un requin et a exactement 2 ou 3 voisins
 * algues, le requin meurt de faim.
 * 
 * Si une cellule est occupée par un poisson et a exactement 1 voisin requin, le
 * poisson est mangé et meurt.
 * 
 * Si une cellule est vide et a exactement 1 voisin requin, aucun nouveau
 * poisson n'apparaît dans cette cellule (les requins empêchent la reproduction
 * des poissons).
 * 
 * Le jeu se termine lorsque toutes les cellules sont occupées par des poissons
 * et des algues uniquement, ou par des requins et des algues uniquement.
 */

public class Ocean {

    public int[][] area;

    public void initialize(int x, int y) {
        area = new int[x][y];
    }

    public int[][] generate(int width, int height) {

        Random random = new Random();

        area = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                area[i][j] = random.nextInt(4);
            }
        }

        return area;

    }

    public int algae(int x, int y) throws Exception {
        int compteur = 0;

        if ((x < 0 || x > area.length - 1) || (y < 0 || y > area[0].length - 1)
                || (x < 0 || x > area.length - 1) && (y < 0 || y > area[0].length - 1)) {
            throw new Exception("the point (" + x + "," + y + ") is outside the area");
        }

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((i == 0 && j == 0) || x + i < 0 || x + i > area.length - 1 || y + j < 0
                        || y + j > area[0].length - 1) {
                    continue;
                }

                int newx = x + i;
                int newy = y + j;

                
            }
        }

        if (compteur != 3)
            return 0;
        return 1;
    }

    public int fish(int x, int y) throws Exception{

        int compteur = 0;

        if ((x < 0 || x > area.length - 1) || (y < 0 || y > area[0].length - 1)
                || (x < 0 || x > area.length - 1) && (y < 0 || y > area[0].length - 1)) {
            throw new Exception("the point (" + x + "," + y + ") is outside the area");
        }

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((i == 0 && j == 0) || x + i < 0 || x + i > area.length - 1 || y + j < 0
                        || y + j > area[0].length - 1) {
                    continue;
                }

                int newx = x + i;
                int newy = y + j;

                if (area[newx][newy] == 1) 
                    compteur++;
            }
        }

        if (compteur == 2 || compteur == 3) {
            return
        }
    }

}
