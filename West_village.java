/*
 * Name: Thomas Nguyen and Nathan Do
 * Course: CECS 326
 * Due Date: 10/29/2023
 * Assignment: Project 3
 * File name: West_village.java
 */

import java.util.Random;

public class West_village implements Runnable {
   private int villager_number;

   public West_village(int villager_number) {
      this.villager_number = villager_number;
   }

   public String get_villager_identity() {
      return "West villager " + this.villager_number;
   }

   @Override
   public void run() {
      // Sleep for random time from 100ms to 300ms seconds
      Random rand = new Random();
      int randomNum = rand.nextInt(300) + 1;
      try {
         Thread.sleep(randomNum);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // Enter queue and identity
      RoadController.enter_queue(Thread.currentThread());
      RoadController.enter_identity(get_villager_identity());
   }
}
