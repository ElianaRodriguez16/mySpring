package test.demo3;

import myspring.Injected;

public class PuertaParaAuto implements Puerta{


	@Injected(implementation=PestilloBMW.class)
	private Pestillo pestillo;

	public Pestillo getPestillo() {
		return pestillo;
	}

	public void setPestillo(Pestillo pestillo) {
		this.pestillo = pestillo;
	}


}
