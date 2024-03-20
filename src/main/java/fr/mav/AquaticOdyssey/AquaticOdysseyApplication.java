package fr.mav.AquaticOdyssey;

import javax.swing.JFrame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.mav.AquaticOdyssey.ui.Canva;

@SpringBootApplication
public class AquaticOdysseyApplication {

	public static JFrame jFrame;

	public static Canva canva;

	public static Ocean ocean = new Ocean();

	public static int frameHeight;

	public static int frameWidth;

	public static Thread thread;

	public static void main(String[] args) {

		jFrame = new JFrame("Aquatic Odyssey");
		canva = new Canva();

		frameWidth = 760;
		frameHeight = 660;

		jFrame.setSize(frameWidth, frameHeight);
		jFrame.setContentPane(canva);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ocean.generate(200, 200);
	}

}
