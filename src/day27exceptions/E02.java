package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

	String str = "a";

	void A() {

		try {

			str = str + "b";

			B();

		} catch (Exception e) {

			str = str + "c";

		}

	 }

	void B() throws Exception {

		try {

			str = str + "d";

			C();

		} catch (Exception e) {

			str = str + "e";

		} finally {

			str = str + "f";

		}

		str = str + "g";

	}

	void C() throws Exception {

		System.out.println(12/0);

	}

	void display() {

		System.out.println(str);

	}

	public static void main(String[] args) {

	E02 object = new E02();

		object.A();

		object.display();
}}
