package com.Potato;
import java.util.Iterator;
import java.util.LinkedList;

public class Calc {

    // # of vertices
    int vert, edge;

    LinkedList<Integer> List[];

    static int count = 0;
    int time = 0;

    Class Edge {
        int a;
        int b;
        Edge(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    Calc(int b){
        vert = b;
        edge = 0;

        List = new LinkedList[];
        for(int x=0;x<b;++x){
            List[x]=new LinkedList();
        }

    }

    void addEdge(int b, int c){
        List[b].add(c);
        edge= edge + 1;
    }





}
