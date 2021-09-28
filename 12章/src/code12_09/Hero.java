package code12_09;

public class Hero extends Character {
	String name = "ミナト";
	int hp = 100;
	//転ぶ
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5のダメージ");
	}
	//戦う
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に１０ポイントのダメージをあたえた");
		m.hp -= 10;
	}
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}
