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
		String s="�̸�:"+name+"\n";
		s+="����"+age+"\n";
		s+="���� ������ ����\n";
		s+=score.getScore();
		
		return s;
	}
}