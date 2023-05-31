package unit02.car;

public class InheritExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi myTaxi = new Taxi();
		myTaxi.carname="티코";
		myTaxi.color="red";
		myTaxi.speedUp();
		myTaxi.speedDown();
		System.out.println(myTaxi.color);
		System.out.println(myTaxi.carname+"의 속도는"+myTaxi.Velocity);
		
		Truck myTruck = new Truck();
		myTruck.carname="봉고";
		myTruck.color="white";
		myTruck.load();
		myTruck.unload();
		System.out.println(myTruck.color);
		System.out.println(myTruck.carname+"의 속도는"+myTruck.Velocity);

	}

}
