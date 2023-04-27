package com.likelion.week2.day9;

public class BoilerControl {
		public static void main(String[] args) {

				// int type Initial Value[초기값]
				int waterTemperature = 45; // Water Temperature[물온도]
				int roomTemperature = 22; // Room Temperature[실내온도]

				// boolean type => <[Operator], &&[Operator]
				// Water Temperature[45] < 50 And Room Temperature[22] < 24
				boolean checkTemperature = waterTemperature < 50 && roomTemperature < 24;

				// output
				// Boolean type => 45 < 50[True] And 22 < 24[True]
				// Result Value => True[Output Type]
				System.out.printf("checkTemperature:%b\n", checkTemperature);
		}
}
