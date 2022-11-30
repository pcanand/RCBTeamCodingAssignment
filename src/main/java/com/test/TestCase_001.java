package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_001 extends BaseClass {

	public static String jsonvalue = filetoString(System.getProperty("user.dir") + "\\testdata\\testdata.json");

	@Test
	public static void overseasplayerValidation() {

		int arrayLength = jsonObject(jsonvalue).getInt("player.size()");

		int count = 0;
		for (int i = 0; i < arrayLength; i++) {
			String playerNationality = jsonObject(jsonvalue).getString("player[" + i + "].country");
			if (!playerNationality.equalsIgnoreCase("India")) {
				count++;
			}

		}
		Assert.assertEquals(count, 4);
	}

	@Test
	public static void keeperValidation() {

		int arrayLength = jsonObject(jsonvalue).getInt("player.size()");
		int count = 0;
		for (int i = 0; i < arrayLength; i++) {

			String playerRole = jsonObject(jsonvalue).getString("player[" + i + "].role");
			if (playerRole.equalsIgnoreCase("Wicket-keeper")) {

				count++;
			}

		}

		if (count >= 1) {
			Assert.assertTrue(true);
			System.out.println(count + " Wicket Keeper Found");
		} else {
			Assert.assertTrue(false);
		}

	}

}
