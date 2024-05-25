package com.kodnest.abstractionproj;
abstract class Vehicle
{
	public void start()
	{
		System.out.println("vehicle has started");
	}
	public void stop()
	{
		System.out.println("vehicle has stoped");
	}
	abstract void reFuel();
}
class ElectricVehicle extends Vehicle
{
	void reFuel()
	{
		System.out.println("vehicle has to refuel");
	}
}
class PetrolCar extends Vehicle
{
	void reFuel()
	{
		System.out.println("vehicle refueling");
	}
}
class DiselCar extends Vehicle
{
	void reFuel()
	{
		System.out.println("vehicle refueling disel");
	}
}
public class Main 
{
public static void main(String[] args)
{
	//Vehicle c=new Vehicle();
	DiselCar d=new DiselCar();
	PetrolCar p=new PetrolCar();
	ElectricVehicle e=new ElectricVehicle();
	e.start();
	e.stop();
	e.reFuel();
	p.reFuel();
	d.reFuel();
	
}
}
