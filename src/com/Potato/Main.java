package com.Potato;
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.io.file;


public class Main {

    public static void main(String[] args) {
            String inputFile = args[0];
            LinkedList LL = new LinkedList;

        try(
                Scanner sc = new Scanner(inputFile);
                //BufferedReader br = new BufferedReader(new FileReader(args[0])){

                double vCount = sc.nextDouble();



                While(sc.hasNextInt()) {

                LL.setValue(sc.nextInt(),sc.nextInt());

        }

            {



                
            }



        }

        Graph g = new Graph(12);
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(1,2);
        g.addEdge(2,1);
        g.addEdge(1,3);
        g.addEdge(3,1);
        g.addEdge(2,3);
        g.addEdge(3,2);
        g.addEdge(2,4);
        g.addEdge(4,2);
        g.addEdge(3,4);
        g.addEdge(4,3);
        g.addEdge(1,5);
        g.addEdge(5,1);
        g.addEdge(0,6);
        g.addEdge(6,0);
        g.addEdge(5,6);
        g.addEdge(6,5);
        g.addEdge(5,7);
        g.addEdge(7,5);
        g.addEdge(5,8);
        g.addEdge(8,5);
        g.addEdge(7,8);
        g.addEdge(8,7);
        g.addEdge(8,9);
        g.addEdge(9,8);
        g.addEdge(10,11);
        g.addEdge(11,10);

        g.BCC();

        System.out.println("Above are " + g.count +
                " biconnected components in graph");
    }

    }

