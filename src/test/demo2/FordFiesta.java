package test.demo2;

import java.util.List;

import myspring.ComponentScan;
import myspring.Injected;

public class FordFiesta implements Auto
{
	@Injected(implementation=ToyotaMotor.class)
	private Motor motor;

	@Injected(implementation=BujiaBosh.class, count=5)
	private List<Bujia> bujias;

	@Override
	public void acelerar()
	{
		motor.carburar();
		System.out.println("Acelerando el fiestita!");
	}

	@Override
	public void frenar()
	{
		System.out.println("Frenando...");
	}

	@Override
	public void regular()
	{
		System.out.println("Regulando...");
	}


	public List<Bujia> getBujias() {
		return bujias;
	}


	public void setBujias(List<Bujia> bujias) {
		this.bujias = bujias;
	}

	@Override
	public void prendeBujia() {
		for(Bujia bu: getBujias()){
			bu.bujear();
		}

	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
