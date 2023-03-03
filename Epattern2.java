package suthan;

public class Epattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				System.out.print(" * ");
				if((i==2 && j ==1) || (i==4 && j ==1))  {
					break;
				}
				if( (i == 3 && j == 3)) {
					break;
				}
			}
			System.out.println();
		}
	}

}
