package test.demo3;

import java.util.List;

import myspring.Injected;

public class AutoFamiliar implements Automovil{

	@Injected(implementation=VidrioStanley.class, count=4)
	private List<Vidrio> vidrios;
	
}
