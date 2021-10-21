
public class Wrapper2 {

	public static void main(String[] args) {
		//int x = i; pode ser usado porem atrasa u pouco o programa
		//int x = i.intvalue(); e recomendado no geral principalmente se sera usado varias vezes o Wrapper
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 =128;
		Integer i4 =128;
		
		//System.out.println(i1==i2); antes do limite
		//System.out.println(i3==i4); depois do limite
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
		
	}

}
