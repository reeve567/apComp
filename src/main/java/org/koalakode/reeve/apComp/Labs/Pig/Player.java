package org.koalakode.reeve.apComp.Labs.Pig;

public class Player {
	
	private int id;
	private int score;
	private int runScore;
	
	Player(int id) {
		this.id = id;
		this.score = 0;
		runScore = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public int getRunScore() {
		return runScore;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setRunScore(int runScore) {
		this.runScore = runScore;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
