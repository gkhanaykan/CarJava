package tr.org.linux.kamp.car;

public class CarFactory {
	public static void main(String[] args) {
		Car car1=new Car(2,100,"bmw");
		car1.SpeedDown(60);
		car1.changeGear(3);
		System.out.println(car1.getBrand()+" "+car1.getSpeed()+" "
		+car1.getGear());
		
		//car myCar= new Car();
		/*myCar.setSeepd(100);
		 myCar
		 */
	}
}
