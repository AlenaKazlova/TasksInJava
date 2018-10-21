package com.kazlova.task21;

public class LogicDragon {
	static final int INITIAL_HEADS_CAUNT = 3;
	static final int EYES = 2;
	static final int HEADS_BEFORE_200 = 3;
	static final int HEADS_FROM_200_TO_299 = 2;
	static final int HEADS_FROM_300 = 1;

	public int countHeads(Dragon dragon) {
		int heads = INITIAL_HEADS_CAUNT;
		if (dragon.getAge() < 200) {
			heads += dragon.getAge() * HEADS_BEFORE_200;

		} else if (dragon.getAge() < 300) {
			heads += (dragon.getAge() - 199) * HEADS_FROM_200_TO_299 
					+ 199 * HEADS_BEFORE_200;

		} else {
			heads += (dragon.getAge() - 299) * HEADS_FROM_300 
					+ 199 * HEADS_BEFORE_200 + 100 * HEADS_FROM_200_TO_299;
		}
		return heads;
	}

	public int countEyes(Dragon dragon) {
		int heads = countHeads(dragon);
		return heads * EYES;
	}

}
