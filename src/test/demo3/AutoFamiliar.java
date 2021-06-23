package test.demo3;

import java.util.List;

import myspring.Injected;

public class AutoFamiliar implements Automovil{

	@Injected(implementation=LucesParaAuto.class)
	private Luces luces;
	
	@Injected(implementation=VidrioStanley.class, count=4)
	private List<Vidrio> vidrios;
	
	@Injected(implementation=PuertaParaAuto.class, count=5)
	private List<Puerta> puertas;
	
	@Injected(implementation=BotiquinFamiliar.class)
	private Botiquin botiquin;
	
	public Luces getLuces() {
		return luces;
	}

	public void setLuces(Luces luces) {
		this.luces = luces;
	}
	
	@Override
	public void probarLuces()
	{
		System.out.println("Probando luces");
		luces.encender();
	}
	
	public List<Vidrio> getVidrios() {
		return vidrios;
	}


	public void setVidrios(List<Vidrio> vidrios) {
		this.vidrios = vidrios;
	}
	
	public void colocarVidriosPolarizados()
	{
		for(Vidrio vi: getVidrios()){
			vi.polarizar(); 
			System.out.println("Colocando vidrios");
		}
	}
	
	public List<Puerta> getPuertas() {
		return puertas;
	}
	
	public void setPuertas(List<Puerta> puertas) {
		this.puertas = puertas;
	}
	
	
	public void colocarPuertas()
	{
		for(Puerta p: getPuertas()) {
		System.out.println("Colocando puerta");}
	}
	
	
	public Botiquin getBotiquin() {
		return botiquin;
	}

	public void setBotiquin(Botiquin botiquin) {
		this.botiquin = botiquin;
	}
	
	@Override
	public void colocarBotiquin()
	{
		System.out.println("Agregando botiquin familiar de emergencias");
		botiquin.agregarAnalgesicos();
	}
	
	
}
