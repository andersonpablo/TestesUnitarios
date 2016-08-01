package br.com.selenium;

public class TestCity {

	public static void main(String[] args) {

		City c1 = new City();
		c1.name = "a";

		City c2 = new City();
		c2.name = "b";

		City c3 = new City();
		c3.name = "c";

		System.out.println(c1.name); // a
		System.out.println(c2.name); // b
		System.out.println(c3.name); // c

		c1 = c2;

		System.out.println("");

		System.out.println(c1.name); // b
		System.out.println(c2.name); // b
		System.out.println(c3.name); // c

		c1.name = "z";

		System.out.println("");

		System.out.println(c1.name); // z
		System.out.println(c2.name); // z
		System.out.println(c3.name); // c
	}

}