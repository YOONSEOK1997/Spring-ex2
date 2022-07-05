package study2;

public class Student {
	private String name;
	private Score score;
	private int age;
	
	public Student(Score score) {
		this.score=score;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAge (int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		String s="이름:"+name+"\n";
		s+="나이"+age+"\n";
		s+="나의 국영수 점수\n";
		s+=score.getScore();
		
		return s;
	}
}
