package test.demo3;
import myspring.Injected;

public class BotiquinFamiliar implements Botiquin{

	@Injected(implementation=Ibuprofeno.class)
	private Analgesico analgesico;
	
	public Analgesico getAnalgesico() {
		return analgesico;
	}

	public void setAnalgesico(Analgesico analgesico) {
		this.analgesico = analgesico;
	}
	
	@Override
	public void agregarAnalgesicos()
	{
		System.out.println("Se agrega al botiquin el analgesico Ibuprofeno");
	}
}
