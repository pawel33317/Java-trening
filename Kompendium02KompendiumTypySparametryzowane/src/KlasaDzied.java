
public class KlasaDzied<T extends String, V extends Number, X> 
	extends KlasaBase<T,V>
{
		X color;
		KlasaDzied (T nazwa,V id,X color){
			super(nazwa, id);
			this.color = color;
		}
		
		X getColor(){
			System.out.println("Klasa dziedziczaca zwraca kolor: "+color);
			return color;
		}
		@Override
		T getNazwa (){
			System.out.println("Klasa dziedziczaca zwraca nazwe: "+nazwa);
			return nazwa;
		}

}
