package robotics;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leag;

public class T1000 implements Robot {
	public Head head;
	private Hand hand;
	private Leag leag;
	
	private String color;
	private int age;
	private boolean soundEnable;
	
	public T1000(){
	
	}
	
	public T1000(Head head, Hand hand, Leag leag) {
		super();
		this.head = head;
		this.hand = hand;
		this.leag = leag;
	}

	public void goToBazar() {
		head.thinking();
		leag.runnig();
		head.thinking();
		hand.catchSomeOne();
		System.out.println("I am not " + color+" "+ age+ " years old robot!");
	}
	
	public void runAway(){
		leag.runnig();
	}
	
	public void setHead(Head head) {
		this.head = head;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void setLeag(Leag leag) {
		this.leag = leag;
	}

	public Head getHead() {
		return head;
	}

	public Hand getHand() {
		return hand;
	}

	public Leag getLeag() {
		return leag;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSoundEnable() {
		return soundEnable;
	}

	public void setSoundEnable(boolean soundEnable) {
		this.soundEnable = soundEnable;
	}
}
