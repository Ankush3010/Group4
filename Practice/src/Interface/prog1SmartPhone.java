package Interface;

public class prog1SmartPhone extends prog1Phone implements prog1Camera,
		prog1Games, prog1Music {
	void method() {
		super.method();
		System.out.println("This is SmartPhone");
	}

	@Override
	public void music() {
		System.out.println("This phone has Spotify Music App");

	}

	@Override
	public void games() {
		System.out.println("This phone has Pubg Game");

	}

	@Override
	public void camera() {
		System.out.println("this phone has 18 Mega Pixal camear");
	}
}
