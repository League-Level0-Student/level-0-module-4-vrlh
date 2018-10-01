package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?");
//int p = Integer.parseInt(pet);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0; i == 0;) {
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// JOptionPane.showOptionDialog(null, "What do you want to do to make your pet
		// happy?", "Happiness", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE,
		// null, new String[] {"option 1"}, "option 1");
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " + pet + " happy?",
				pet + "'s Level of Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Give it food", "Take a walk", "Give it water" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
		if (task == 0) {
			food(pet);
		} else if (task == 1) {
			walk(pet);
		} else if (task == 2) {
			water(pet);
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
if (happinessLevel > 1) {
	JOptionPane.showMessageDialog(null, "You love your " + pet);
	break;
}
}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void food(String pet) {
		JOptionPane.showMessageDialog(null, "Your " + pet + " quiets down");
		happinessLevel = happinessLevel + 1;
	}

	static void water(String pet) {
		JOptionPane.showMessageDialog(null, "Your " + pet + " spills all the water and is sad");
		happinessLevel = happinessLevel - 1;
	}

	static void walk(String pet) {
		JOptionPane.showMessageDialog(null, "Your " + pet + " gets excited!");
		happinessLevel = happinessLevel + 2;
	}
}