package controller;

import java.util.Scanner;

import model.Car;
import service.Calculation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the car type");
		int carId=sc.nextInt();
		System.out.println("enter the distance");
		int distance=sc.nextInt();
		Car car=new Car();
		car.setCarId(carId);
		car.setDistance(distance);
		Calculation cal=new Calculation();
		cal.calculation(car);
	}

}
