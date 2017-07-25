package tr.org.linux.kamp.car;

public class Car {
	private int gear;
	private int speed;
	private String  brand;
	
	public Car(int gear,int speed,String brand) {
		this.gear=gear;
		this.speed=speed;
		this.brand=brand;
	}
	
	public int getGear() {
		return gear;
	}

	public void setGear(String name) {
		this.gear = gear;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSped(String name) {
		this.speed = speed;
	}
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String name) {
		this.brand = brand;
	}
	public void speedUp(int speed) {
		this.speed+=speed;
		/*if(inc>0)
		 * speed +=inc;
		 */
	}
	public void SpeedDown(int speed) {
		this.speed-=speed;
		/*if(speed>0)
		 * this.speed-=speed
		 */
	}
	public void changeGear(int gear) {
		this.gear=gear;
	}
	
	
	
}
