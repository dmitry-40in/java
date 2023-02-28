public class task_005 {
    public static void main(String[] args) {

        int[][] m = mapMaker();
        mapPrinting(m);
        System.out.println();
        mapPrinting(mapStartingPointMaker(m));
        
    }

    private static int[][] mapMaker() {
        int[][] map = {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, -1, -1, -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, -1, -1, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, -1, -1, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, -1, -1, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };
        return map;
    }

    private static void mapPrinting(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%2d  ", map[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] mapStartingPointMaker(int[][] mapWithStartingPoint) {
        System.out.println("Введите координаты начального расположения котика:");
        // Введение координат с клавиатуры
        
        int column = 6;
        int row = 5;

        mapWithStartingPoint[column][row] = 1;

        return mapWithStartingPoint;
    }
}