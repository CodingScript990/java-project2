package com.likelion.week6.day28.interfaceex;

import com.likelion.week6.day28.abstractex.AnimalInterface;
// May.26 2023
public class Bird implements AnimalInterface, EatInterface {

		@Override
		public void makeSound() {
				System.out.println("짹짹!");
		}

		@Override
		public void eat() {
				System.out.println("얍얍!");
		}
}
