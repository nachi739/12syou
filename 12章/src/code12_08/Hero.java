package code12_08;

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
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	public void attack(Goblin g) {
		System.out.println(this.name + "の攻撃");
		System.out.println("１０ポイントのダメージをあたえた");
		g.hp -= 10;
	}
	//以下スライム用など続く
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}
