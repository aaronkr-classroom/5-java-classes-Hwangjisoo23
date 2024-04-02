
public class Ex706 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.breed = "포메라니안"; 
		d.color = "갈색";
		
		System.out.println("강아지 품종: " + d.breed);
		System.out.println("강아지 색상: " + d.color);
		d.sound(); 
		
		
		d.age = 10;
		System.out.println("강아지 나이: " + d.age);
		d.run();
		
//		d.name = "다운";
//		System.out.println("강아지 이름: " + d.name);
//		d.sleep();
//		
			
	}

}
