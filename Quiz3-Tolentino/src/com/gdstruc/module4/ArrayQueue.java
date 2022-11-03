package com.gdstruc.module4;

import java.util.Random;
import java.util.Scanner;

public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    // add player at the back of the queue
    public void enqueue(Player player) {
        if (back == queue.length) {
            Player[] newQueue = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }

        queue[back] = player;
        back++;
    }

    // remove the player that is in front of the queue
    public Player dequeue() {

        Player removedPlayer = queue[front];
        front++;

        // when array is empty
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return  removedPlayer;
    }

    // get the number of elements in queue
    public int size() {
        return back - front;
    }

    // print all the elements of the queue
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
    private void pressEnterToContinue()
    {
        System.out.println("PRESS ENTER 1-2 TIMES TO CONTINUE......");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
    public void gameQueue() {
        //initialize queues
        ArrayQueue arrayQueue = new ArrayQueue(100);
        ArrayQueue dequeued = new ArrayQueue(100);

        Random rand = new Random();
        int limitPerTurn = rand.nextInt(7) + 1;


        System.out.println("Current no. of players in queue: " + arrayQueue.size() + "\n");
        pressEnterToContinue();
        int turns = 1;
        // while loop; ends when there are now 10 games in queue
        while (dequeued.size() != 50) {
                System.out.println("TURN " + turns++ + "\n");
                System.out.println("No. of Players Enqueued: " + limitPerTurn);
                for (int i = 0; i < limitPerTurn; i++) {
                    // enqueues randomly from 1-7 number of elements
                    arrayQueue.enqueue(new Player(i + 1));
                    ;
                }
                arrayQueue.printQueue();
                if (arrayQueue.size() > 4) {
                    for (int j = 0; j < 5; j++) {
                        Player x = arrayQueue.dequeue();
                        dequeued.enqueue(x);
                    }
                    System.out.println("MATCH FOUND! Dequeued 5 players \n");
                    arrayQueue.printQueue();
                }
                System.out.println("Current no. of players in queue: " + arrayQueue.size());
                System.out.println("Current no. of games in queue: " + dequeued.size() / 5);
                System.out.println("================================");
                pressEnterToContinue();
                System.out.println("================================");
                if ((dequeued.size() / 5) == 10) {
                    System.out.println("TEN GAMES ARE NOW QUEUED! THANK YOU");
                }
        }
    }
}

