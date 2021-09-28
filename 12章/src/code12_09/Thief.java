package code12_09;

public class Thief extends Character {
	String name = "ササキ";
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に4ポイントのダメージ");
		m.hp -= 4;
	}
}
