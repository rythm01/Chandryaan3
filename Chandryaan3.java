import java.util.*;

public class Chandryaan3 {
    String dir = "N";
    String prev;
    int[] coordinates = { 0, 0, 0 };

    private final Map<String, int[]> directionToCoordinateChange = new HashMap<>();
    
    public Chandryaan3(String initialDir,int[] initialCor) {
        
        this.dir = initialDir;
        this.coordinates = initialCor;

        directionToCoordinateChange.put("N", new int[] { 0, 1, 0 });
        directionToCoordinateChange.put("S", new int[] { 0, -1, 0 });
        directionToCoordinateChange.put("E", new int[] { 1, 0, 0 });
        directionToCoordinateChange.put("W", new int[] { -1, 0, 0 });
        directionToCoordinateChange.put("Up", new int[] { 0, 0, 1 });
        directionToCoordinateChange.put("Down", new int[] { 0, 0, -1 });
    }

    public void moveForward() {
        int[] coordinateChange = directionToCoordinateChange.get(dir);
        if (coordinateChange != null) {
            for (int i = 0; i < 3; i++) {
                coordinates[i] += coordinateChange[i];
            }
        }
    }

    public void moveBackward() {
        int[] coordinateChange = directionToCoordinateChange.get(dir);
        if (coordinateChange != null) {
            for (int i = 0; i < 3; i++) {
                coordinates[i] -= coordinateChange[i];
            }
        }
    }

    public void turnLeft() {
        if (dir.equals("Up") || dir.equals("Down")) {
            dir = prev.equals("N") ? "W"
                    : prev.equals("S") ? "E" : prev.equals("E") ? "N" : prev.equals("W") ? "S" : dir;
        } else {
            switch (dir) {
                case "N":
                    dir = "W";
                    break;
                case "S":
                    dir = "E";
                    break;
                case "E":
                    dir = "N";
                    break;
                case "W":
                    dir = "S";
                    break;
            }
        }
    }

    public void turnRight() {
        if (dir.equals("Up") || dir.equals("Down")) {
            dir = prev.equals("N") ? "E"
                    : prev.equals("S") ? "W" : prev.equals("E") ? "S" : prev.equals("W") ? "N" : dir;
        } else {
            switch (dir) {
                case "N":
                    dir = "E";
                    break;
                case "S":
                    dir = "W";
                    break;
                case "E":
                    dir = "S";
                    break;
                case "W":
                    dir = "N";
                    break;
            }
        }
    }

    public void setUp() {
        if (!dir.equals("Up")) {
            prev = dir;
            dir = "Up";
        }
    }

    public void setDown() {
        if (!dir.equals("Down")) {
            prev = dir;
            dir = "Down";
        }
    }

    public void handleMove(char[] commands) {
        for (char comm : commands) {
            switch (comm) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'd':
                    setDown();
                    break;
                case 'u':
                    setUp();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial facing dir:- ");
        String initialDir = sc.nextLine();
        
        int [] initialCor = new int[3];
        System.out.print("Enter the starting cordinates:- ");
        for (int i = 0; i < 3; i++) {
            initialCor[i] = sc.nextInt();
        }

        System.out.print("Enter commands (separated by spaces): ");
        sc.nextLine(); // Consume the newline character
        String commandsLine = sc.nextLine();
        char[] commands = commandsLine.toCharArray();

        Chandryaan3 chandryaan = new Chandryaan3(initialDir,initialCor);

        chandryaan.handleMove(commands);
        System.out.println("Final dir:- " + chandryaan.dir);
        System.out.println(java.util.Arrays.toString(chandryaan.coordinates));
        sc.close();
    }
}