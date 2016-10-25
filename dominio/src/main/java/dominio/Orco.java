package dominio;

import java.util.LinkedList;

public class Orco extends Personaje {
	
	public Orco(String casta){
		super(casta);
	}
	
	
	
	public Orco(int salud, int energia, int fuerza, int destreza, int inteligencia, Casta casta, LinkedList<Item> itemsEquipados,
			LinkedList<Item> itemsGuardados, int experiencia, int nivel, int idPersonaje) {
		super(salud, energia, fuerza, destreza, inteligencia, casta, itemsEquipados, itemsGuardados, experiencia, nivel,
				idPersonaje);
		
	}



	public void habilidadRaza1(Peleable atacado){ //PENSAR UNO MAS
		
	}
	
	public void habilidadRaza2(Peleable atacado){//mordisco de vida
		if(this.getEnergia()>10)
		{
		int da�o_causado = atacado.serAtacado(this.getFuerza());//solo depende de la fuerza
		this.serCurado(da�o_causado);//se cura con el da�o que le causo al oponente
		this.setEnergia(this.getEnergia()-10);
		}
	}

}
