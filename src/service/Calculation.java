package service;

import model.Car;

public class Calculation {

	public void calculation(Car car) {
		// TODO Auto-generated method stub
		int cartype=car.getCarId();
		int distance=car.getDistance();
		int cost;
		switch(cartype){
		case 1:
			if(distance<=3){
				System.out.println(" total cost:50");
			}
			else if(distance>3&&distance<75){
				cost=50+(distance-3)*10;
				System.out.println(" total cost"+cost);
				
			}
			else{
				cost=distance*8;
				System.out.println(" total cost:"+cost);
			}
			
			break;
		case 2:
			if(distance<=5){
				System.out.println(" total cost:80");
			}
			else if(distance>5&&distance<100){
				cost=80+(distance-5)*12;
				System.out.println(" total cost"+cost);
				
			}
			else{
				cost=distance*10;
				System.out.println(" total cost:"+cost);
			}
			break;
		case 3:
			if(distance<=3){
				System.out.println(" total cost:100");
			}
			else if(distance>5){
				cost=100+(distance-5)*15;
				System.out.println(" total cost"+cost);
				
			}
			
			break;
		default:
			break;
		}
	}

}
