public class TestMath {

	public TestMath(String s_choice_klas, String s_choice_tema, String s_Name, int result, int metka_result,
			int testNomerPutanna0, int testNomerPutanna1, int testNomerPutanna2, int testNomerPutanna3,
			int testNomerPutanna4, int testNomerPutanna5, int testNomerPutanna6, int testNomerPutanna7,
			int testNomerPutanna8, int testNomerPutanna9, int testNomerPutanna10, int testNomerPutanna11) {

		switch (metka_result) {
		case 0: {
			new TestPutanna(s_choice_klas, s_choice_tema, s_Name, result, testNomerPutanna0, testNomerPutanna1,
					metka_result, testNomerPutanna2, testNomerPutanna3, testNomerPutanna4, testNomerPutanna5,
					testNomerPutanna6, testNomerPutanna7, testNomerPutanna8, testNomerPutanna9, testNomerPutanna10,
					testNomerPutanna11);
			break;
		}
		case 1: {
			new TestPutanna(s_choice_klas, s_choice_tema, s_Name, result, testNomerPutanna2, testNomerPutanna3,
					metka_result, testNomerPutanna2, testNomerPutanna3, testNomerPutanna4, testNomerPutanna5,
					testNomerPutanna6, testNomerPutanna7, testNomerPutanna8, testNomerPutanna9, testNomerPutanna10,
					testNomerPutanna11);
			break;
		}
		case 2: {
			new TestPutanna(s_choice_klas, s_choice_tema, s_Name, result, testNomerPutanna4, testNomerPutanna5,
					metka_result, testNomerPutanna2, testNomerPutanna3, testNomerPutanna4, testNomerPutanna5,
					testNomerPutanna6, testNomerPutanna7, testNomerPutanna8, testNomerPutanna9, testNomerPutanna10,
					testNomerPutanna11);
			break;
		}
		case 3: {
			new TestPutanna(s_choice_klas, s_choice_tema, s_Name, result, testNomerPutanna6, testNomerPutanna7,
					metka_result, testNomerPutanna2, testNomerPutanna3, testNomerPutanna4, testNomerPutanna5,
					testNomerPutanna6, testNomerPutanna7, testNomerPutanna8, testNomerPutanna9, testNomerPutanna10,
					testNomerPutanna11);
			break;
		}
		case 4: {
			new TestPutanna(s_choice_klas, s_choice_tema, s_Name, result, testNomerPutanna8, testNomerPutanna9,
					metka_result, testNomerPutanna2, testNomerPutanna3, testNomerPutanna4, testNomerPutanna5,
					testNomerPutanna6, testNomerPutanna7, testNomerPutanna8, testNomerPutanna9, testNomerPutanna10,
					testNomerPutanna11);
			break;
		}
		case 5: {
			new TestPutanna(s_choice_klas, s_choice_tema, s_Name, result, testNomerPutanna10, testNomerPutanna11,
					metka_result, testNomerPutanna2, testNomerPutanna3, testNomerPutanna4, testNomerPutanna5,
					testNomerPutanna6, testNomerPutanna7, testNomerPutanna8, testNomerPutanna9, testNomerPutanna10,
					testNomerPutanna11);
			break;
		}
		}

		if (metka_result == 6) {
			new TestResult(s_choice_klas, s_choice_tema, s_Name, result);
		}

	}

}
