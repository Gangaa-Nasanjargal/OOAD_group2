package movie;

import java.util.ArrayList;

class FoundingTitan{
	
	String name;
	int armor;
	public FoundingTitan(String name) {
		this.name=name;
	}
	public void attack() {
		System.out.println("FoundingTitan өөрөөсөө гадна 8 Titan үүсгэв."+ name);
	}
}
class AttackTitan extends FoundingTitan{
	int armor;
	int hit_points=0;
	public AttackTitan(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Нэгт AttackTitan "+ name);
	}
}
class ArmoredTitan extends FoundingTitan{
	int armor;
	int hit_points=0;
	public ArmoredTitan(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Хоёрт ArmoredTitan "+ name);
	}
}
class FemaleTitan extends FoundingTitan{
	int armor;
	int hit_points=0;
	public FemaleTitan(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Гуравт FemaleTitan "+ name);
	}
}
class Warhammer extends FoundingTitan{
	int armor;
	int hit_points=0;
	public Warhammer(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Дөрөвт Warhammer "+ name);
	}
}
class JawTitan extends FoundingTitan{
	int armor;
	int hit_points=0;
	public JawTitan(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Тавт JawTitan "+ name);
	}
}
class BeastTitan extends FoundingTitan{
	int armor;
	int hit_points=0;
	public BeastTitan(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Зургаа BeastTitan "+ name);
	}
}
class CartTitan extends FoundingTitan{
	int armor;
	int hit_points=0;
	public CartTitan(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Долоо CartTitan "+ name);
	}
}
class ColossalTitan extends FoundingTitan{
	int armor;
	int hit_points=0;
	public ColossalTitan(String name, int hit_points) {
		super(name);
		this.hit_points=hit_points;
	}
	public void attack() {
		System.out.println(" Найм ColossalTitan "+ name);
	}
}
public class Movie {

	public static void main(String[] args) {
		FoundingTitan p=new FoundingTitan("FoundingTitan");
		
		FoundingTitan a=new AttackTitan("Дотлох, Ирээдүй харах", 7);
		FoundingTitan b=new ArmoredTitan("Хуягт", 7);
		FoundingTitan c=new FemaleTitan("Хатуурах, puretitan дуудах", 7);
		FoundingTitan d=new Warhammer("Зэвсэг бүтээх", 8);
		FoundingTitan e=new JawTitan("Хурд, сарвуу", 6);
		FoundingTitan f=new BeastTitan("Араатан", 5);
		FoundingTitan g=new CartTitan("Зөөвөрлөх", 2);
		FoundingTitan h=new ColossalTitan("Сүйрэл", 8);
		ArrayList<FoundingTitan> al=new ArrayList<FoundingTitan>();
		al.add(p);
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		al.add(f);
		al.add(g);
		al.add(h);
		for(FoundingTitan q:al) {
			q.attack();
		}
	}

}
