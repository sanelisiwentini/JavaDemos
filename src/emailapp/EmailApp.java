/**
 * 
 */
package emailapp;

/**
 * @author Sanelisiwe Ntini
 *
 */
public class EmailApp
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{

				Email em1= new Email("Jane", "Doe"); 
				em1.setMailBoxCapacity(5000);
				em1.doEverything();
			}

	}
