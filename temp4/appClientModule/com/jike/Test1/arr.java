package com.jike.Test1;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayDemo[];
		int[] score;
		score = new int[3];
		for (int i = 0; i < score.length; i++) {
			score[i]=i*2+1;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
