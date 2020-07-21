
public class DiscussionForumThree {
	int addTwoInts(int, int); /* Prototype */
	 
	int main() /* Main function */
	{
	  int n1 = 10, n2 = 20, sum;
	 
	  /* n1 and n2 are actual arguments. They are the source
	     of data. Caller program supplies the data to called 
	     function in form of actual arguments. */
	  sum = addTwoInts(n1, n2); /* function call */
	 
	  printf("Sum of %d and %d is: %d \n", n1, n2, sum);
	}

}
