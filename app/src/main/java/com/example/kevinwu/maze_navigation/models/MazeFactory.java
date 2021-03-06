package com.example.kevinwu.maze_navigation.models;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kevin on 2/10/2017.
 */

public class MazeFactory {

    public static ArrayList<Maze> getMazes() {
        ArrayList<Maze> mazeList = new ArrayList<>();
        Maze maze = new Maze();

        for (int mazeNo = 1; mazeNo < 10; mazeNo++) {
            if(mazeNo == 1) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {true ,false,false,false,true ,false,false},
                        {true ,false,false,true ,false,true ,true },
                        {false,true ,false,false,true ,false,false},
                        {false,true ,true ,false,false,false,true },
                        {true ,false,false,false,true ,true ,false},
                        {false,true ,false,false,true ,false,false},
                        {false,true ,true ,true ,true ,true ,false},
                        {false,false,false,true ,false,false,false}
                };
                boolean[][] hLines = new boolean[][]{
                        {false,false,true ,true ,false,false,true ,false},
                        {false,false,true ,true ,false,true ,false,false},
                        {true ,true ,false,true ,true ,false,true ,true },
                        {false,false,true ,false,true ,true ,false,false},
                        {false,true ,true ,true ,true ,false,true ,true },
                        {true ,false,false,true ,false,false,true ,false},
                        {false,true ,false,false,false,true ,false,true }
                };
                boolean[][] vDoors = new boolean[][]{
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(0, 0);
                maze.setMazeNum(1);

                Point linkPoint = new Point(7,7,2);
                Pair link = new Pair(linkPoint, "Right");

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);

                maze.setLinks(mazeLinks);

            }
            //other mazes
            if(mazeNo == 2) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false,false,false,true ,false,false,false},
                        {false,false,true ,false,true ,false,false},
                        {false,false,true ,true ,false,false,false},
                        {false,false,true ,true ,true ,false,false},
                        {false,false,true ,false,true ,false,false},
                        {true ,false,false,true ,false,true ,false},
                        {true ,false,true ,true ,false,false,false},
                        {false,false,true ,false,false,false,true }
                };
                boolean[][] hLines = new boolean[][]{
                        {false, true , true , true , false, true , true , true },
                        {true , true , false, false, true , true , true , false},
                        {false, true , true , false, false, false, true , true },
                        {true , true , false, false, false, true , true , false},
                        {false, true , true , true , true , false, true , false},
                        {false, false, true , false, false, true , true , true },
                        {false, true , false, false, true , true , false, false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,true ,false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(0, 7);
                maze.setMazeNum(2);

                Point linkPoint = new Point(7,0,1);
                Pair link = new Pair(linkPoint, "Right");

                Point linkPoint1 = new Point(3,0,3);
                Pair link1 = new Pair(linkPoint1, "Up");

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);
                mazeLinks.add(link1);

                maze.setLinks(mazeLinks);

            }
            if(mazeNo == 3) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false, true , false, true , false ,true , false},
                        {false, false, true , true , true , true , true },
                        {true , false, false, true , true , false, true },
                        {true , false, false, false, true , false, true },
                        {true , false, true , true , false, false, false},
                        {false, true , true , false, true , true , true },
                        {false, false, false, false, true , true , true },
                        {false, false, true , false, false, true , false}
                };
                boolean[][] hLines = new boolean[][]{
                        {true , false, false, false, false, false, false, false},
                        {false, true , true , false, false, true , false, false},
                        {false, false, true , true , false, false, true , true },
                        {false, true , true , true , true , true , false, false},
                        {false, false, false, false, false, true , false, true },
                        {true , true , false, true , false, false, false, false},
                        {false, true , true , false, true , false, false, false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,true ,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, true , false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(3, 7);
                maze.setMazeNum(3);

                Point linkPoint = new Point(7,2,1);
                Pair link = new Pair(linkPoint, "Right");

                Point linkPoint1 = new Point(0,0,4);
                Pair link1 = new Pair(linkPoint1, "Left");

                Point linkPoint2 = new Point(7,5,5);
                Pair link2 = new Pair(linkPoint2, "Right");

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);
                mazeLinks.add(link1);
                mazeLinks.add(link2);

                maze.setLinks(mazeLinks);
            }
            if(mazeNo == 4) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false, false, true , true , false, false, false},
                        {false, true , true , true , true , false, true },
                        {false, true , false, true , true , true , false},
                        {true , false, false, false, true , false, true },
                        {false, false, true , false, false, true , false},
                        {true , true , true , false, true , true , true },
                        {false, true , true , false, true , false, true },
                        {false, false, false, false, false, false, false}
                };
                boolean[][] hLines = new boolean[][]{
                        {true , false, false, false, false, true , true , false},
                        {false, true , false, false, true , false, false, false},
                        {true , false, true , true , false, false, true , true },
                        {false, true , false, true , true , true , false, false},
                        {false, false, false, false, true , false, false, true },
                        {true , false, false, true , false, false, false, false},
                        {false, true , true , false, true , true , true , false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,true ,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, true , false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(7, 0);
                maze.setMazeNum(4);

                Point linkPoint = new Point(3,0,3);
                Pair link = new Pair(linkPoint, "Up");

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);

                maze.setLinks(mazeLinks);
            }
            if(mazeNo == 5) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false, false, true , true , true , false, false},
                        {false, false, true , true , false, false, true },
                        {true , true , false, true , false, true , false},
                        {true , false, false, false, true , false, true },
                        {false, true , false, true , false, true , false},
                        {true , true , true , false, true , true , false},
                        {false, false, true , true , true , false, false},
                        {true , false, false, false, false, true , false}
                };
                boolean[][] hLines = new boolean[][]{
                        {true , true , false, false, true , false, true , true },
                        {false, false, true , false, true , false, false, false},
                        {true , false, true , false, false, false, true , true },
                        {false, true , false, true , true , true , false, false},
                        {false, false, false, false, true , false, false, true },
                        {false, true , false, true , false, false, true , true },
                        {false, false, true , false, true , false, true , false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false},
                        {false,false,false,false,false,false,false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {true , true , false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(7, 0);
                maze.setMazeNum(5);

                Point linkPoint = new Point(4,6,6);
                Pair link = new Pair(linkPoint, "Down");

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);

                maze.setLinks(mazeLinks);
            }
            if(mazeNo == 6) { // Map 6 is a dead end, exiting will put you in a random map
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false}
                };
                boolean[][] hLines = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(0, 3);

                Random rand = new Random();
                int n1 = rand.nextInt(3) + 7;
                int n2 = 0, n3 = 0;
                if (n1 == 7)
                    n2 = rand.nextInt(2) + 8;
                else if (n1 == 8) {
                    n2 = rand.nextInt(2) + 8;

                    if (n2 == 8)
                        n2 = 7;
                }
                else if (n1 == 9) {
                    n2 = rand.nextInt(2) + 7;
                }
                n3 = 24 - n1 - n2;

                Point linkPoint = new Point(7,0,n1);
                Pair link = new Pair(linkPoint, "Up");

                Point linkPoint1 = new Point(7,3,n2);
                Pair link1 = new Pair(linkPoint1, "Right");

                Point linkPoint2 = new Point(7,7,n3);
                Pair link2 = new Pair(linkPoint2, "Down");

                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);
                mazeLinks.add(link1);
                mazeLinks.add(link2);

                maze.setLinks(mazeLinks);

                maze.setMazeNum(6);
            }
            if(mazeNo == 7) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false}
                };
                boolean[][] hLines = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(0, 3);

                Random rand = new Random();
                int n = rand.nextInt(5) + 1;

                Point linkPoint = new Point(7,3,n);
                Pair link = new Pair(linkPoint, "Right");

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);

                maze.setLinks(mazeLinks);

                maze.setMazeNum(7);
            }
            if(mazeNo == 8) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false}
                };
                boolean[][] hLines = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(0, 3);

                Random rand = new Random();
                int n = rand.nextInt(5) + 1;

                Point linkPoint = new Point(7,3,n);
                Pair link = new Pair(linkPoint, "Right");

                ArrayList<Pair> mazeLinks = new ArrayList<>();
                mazeLinks.add(link);

                maze.setLinks(mazeLinks);

                maze.setMazeNum(8);
            }
            if(mazeNo == 9) {
                maze = new Maze();
                boolean[][] vLines = new boolean[][]{
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false},
                        {false, false, false, false, false ,false, false}
                };
                boolean[][] hLines = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                boolean[][] vDoors = new boolean[][]{
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false }
                };
                boolean[][] hDoors = new boolean[][]{
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}
                };
                maze.setVerticalLines(vLines);
                maze.setHorizontalLines(hLines);
                maze.setVerticalDoors(vDoors);
                maze.setHorizontalDoors(hDoors);
                maze.setStartPosition(0, 3);

                maze.setFinalPosition(7,3);

                maze.setMazeNum(9);
            }
            mazeList.add(maze);
        }
        return mazeList;
    }
}
