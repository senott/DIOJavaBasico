package br.com.nomadweb.arrays;

public class Main {

    public static void main(String[] args) {
        int[] meuArray = new int[7];
        int[] meuOutroArray = {12, 32, 54, 6, 8, 89, 64};

        System.out.println(meuArray[1]);
        System.out.println(meuOutroArray[3]);

        meuArray[1] = 100;
        System.out.println(meuArray[1]);

        System.out.println(meuOutroArray.length);

        System.out.println("Elementos do meuOutroArray: ");
        for (int i = 0; i < meuOutroArray.length; i++) {
            System.out.println(meuOutroArray[i]);
        }

        int[][] meuArrayMulti = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println("Elementos do meuArrayMulti: ");
        for (int i = 0; i < meuArrayMulti.length; i++) {
            for (int j = 0; j < meuArrayMulti[i].length; j++) {
                System.out.println(meuArrayMulti[i][j]);
            }
        }
    }
}
