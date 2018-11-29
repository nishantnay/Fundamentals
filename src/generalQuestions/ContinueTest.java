package generalQuestions;

public class ContinueTest {

	public static void main(String[] args) {
		
		int x=0;
		do{
			
			x++;
			if (x==5){
				x++;
				continue;
				//break;
			}
		System.out.println("X= "+x);	
		}while(x<10);
	}

}
