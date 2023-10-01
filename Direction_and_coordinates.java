//Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels per following scheme.
//	He first turns and travels 10 units of distance
//	His second turn is upward for 20 units
//	Third turn is to the left for 30 units
//	Fourth turn is the downward for 40 units
//	Fifth turn is to the right(again) for 50 units
//	And thus he travels, every time increasing the travel distance by 10 units.

package coding_questions;
import java.util.Scanner;

public class Direction_and_coordinates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
	    int testCase = sc.nextInt();
	    sc.close();
	    getDistance(testCase);
	  }

	public static void getDistance(int a) {
	  int distance = 10;
	  int x = 0;
	  int y = 0;
	  char ch = 'R';
	  while(a > 0) 
	  {
	    switch(ch) 
	    {
	      case 'R':
	      x = x + distance;
	      ch = 'U';
	      distance = distance+10;
	      break;

	      case 'U':
	      y = y + distance;
	      ch = 'L';
	      distance = distance + 10;
	      break;

	      case 'L':
	      x = x - distance;
	      ch = 'D';
	      distance = distance + 10;
	      break;

	      case 'D':
	      y = y - distance;
	      ch = 'A';
	      distance = distance + 10;
	      break;

	      case 'A':
	      x = x + distance;
	      ch = 'R';
	      distance = distance + 10;
	      break;
	    }
	    a--;
	  }
	  System.out.println(x+ " , "+y);
	  }
	}

