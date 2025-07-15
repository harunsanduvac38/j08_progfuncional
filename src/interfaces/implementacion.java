package interfaces;

public class implementacion implements EjemploInterfaz {

	@Override
	public void procesa(String str) {
		
		
	}

	@Override
	public int otroProceso() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
//	No es obligatorio, si quiero sobreescribir cualquier método default
	@Override
	public void haceALgo() {
		// TODO Auto-generated method stub
		EjemploInterfaz.super.haceALgo();
	}

}
