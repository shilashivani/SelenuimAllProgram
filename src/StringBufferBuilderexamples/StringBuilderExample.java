package StringBufferBuilderexamples;

public class StringBuilderExample {
	public static void main(String[] args) {
		String s="shila";
		System.out.println(s.concat("arise"));
		System.out.println(s);
		
		
		StringBuffer sbb=new StringBuffer("shila");
		System.out.println(sbb.append("babar"));
	}

}
