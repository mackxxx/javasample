package jp.learningdesign.javastudy;

class Staff{
	String name;
	int staffid;
	String email;
	
	public void  sayhello() {
		System.out.println("Hello"  + this.name);
	}
	
}

public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      Staff yamada = new Staff();
      yamada.name = "Taro yamada";
     
      yamada.sayhello();
	}

}