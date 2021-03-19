package myPackage;

interface Event {
	public void start();
}

interface Sports {
	public void play();
}

interface Hockey extends Sports, Event {
	public void show();
}

public class MultipleInheritance {
	public static void main(String[] args)
	{
		Hockey h = new Hockey()
		{
			public void start()
			{
				System.out.println("Start Event.");
			}

			public void play() {
				System.out.println("Play Sports.");
			}

			public void show() {
				System.out.println("Show Hockey.");
			}
		};

		h.start();
		h.play();
		h.show();
	}
}