package com.java.phone;

public class Phone {
	
	protected int num;
	protected String name;
	protected String hp;
	protected String tel;
	
	public Phone(String name, String hp, String tel) {
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void showInfo() {
		System.out.printf("%d. %s\t%s\t%s%n", num, name, hp, tel);
	}
	
	@Override
	public String toString() {
		String result = String.format("d. %s %s %t %s", num, name, hp, tel);
		return result;
	}

}

