public class carOwner {
	public static void main (String [] args){
		Car car = new Car();
		car.start();
		car.drive(5);
		car.stop();
	}
}
class Car {
	public void start () {
		System.out.println("Поехали.");
	}
	public void drive (int howlong) {
		int distance = howlong * 60;
		System.out.println("Проехали: " + distance);
	}
	public void stop () {
		System.out.println("Приехали.");
	}
}