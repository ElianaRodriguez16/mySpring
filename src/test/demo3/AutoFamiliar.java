package test.demo3;

import java.util.List;

import myspring.Injected;

public class AutoFamiliar implements Automovil{

	@Injected(implementation=VidrioStanley.class, count=4)
	private List<Vidrio> vidrios;
	
	@Injected(implementation=PuertaParaAuto.class, count=5)
	private List<Puerta> puertas;
	
	@Override
	public void colocarVidrios()
	{
		System.out.println("Colocando vidrio");
	}
	
	@Override
	public void colocarPuertas()
	{
		System.out.println("Colocando puerta");
	}
	
	@Override
	public void probarLuces()
	{
		System.out.println("Probando luces");
	}
}
