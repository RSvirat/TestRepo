package com.su.model;

import java.util.Random;
public class format {
 public static void main(String[] s) {
  float[] array50 = new float[50];
  for (int i=0;i<50;i++) {
   array50[i] = new Random().nextFloat()*50;
  }
  for(int j=0;j<50;j=j+5) {
   for(int i=j;i<j+5;i++)
    System.out.printf("\t%6.2f ",array50[i]);                      
   System.out.println();
  }
 }
}
