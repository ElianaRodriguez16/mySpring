package test.demo3;

import java.util.List;

import myspring.Injected;

public class AutoFamiliar implements Automovil{

	@Injected(implementation=VidrioStanley.class, count=4)
	private List<Vidrio> vidrios;
	
	@Injected(implementation=PuertaParaAuto.class, count=5)
	private List<Puerta> puertas;
	
	@Injected(implementation=LucesParaAuto.class)
	private Luces luces;
	
	public List<Vidrio> getVidrios() {
		return vidrios;
	}


	public void setVidrios(List<Vidrio> vidrios) {
		this.vidrios = vidrios;
	}
	
	@Override
	public void colocarVidriosPolarizados()
	{
		for(Vidrio vi: getVidrios()){
			vi.polarizar();
		}
	}
	
	@Override
	public void colocarPuertas()
	{
		System.out.println("Colocando puerta");
	}
	
	@Override
	public void probarLuces()
	{
		luces.encender();
		System.out.println("Probando luces");
	}
	
	
	
}
