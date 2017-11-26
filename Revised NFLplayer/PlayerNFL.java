/**
 * My name is Byung Gil Lee and all of this work is my own.
 */
import javafx.scene.image.Image;
public class PlayerNFL {
	Image headshot;
	public String name;
	public int age;
	public double height;
	public double weight;
	public PlayerNFL() {
	}
	public PlayerNFL(String url, String name, int age, double height, double weight) {
		this.headshot = new Image(url, 78, 78, true, false);
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String toString() {
		return name;
	}
	public Image getHeadshot() {
		return headshot;
	}
	public void setImage(String url) {
		this.headshot = new Image(url, 78, 78, true, false);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
	this.height = height;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}