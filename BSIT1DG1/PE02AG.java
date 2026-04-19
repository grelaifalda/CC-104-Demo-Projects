/*
Grefalda, Alyssa Sofia D.
BSIT1DG1
Determine if number is zero, positive, or negative
*/

import java.util.*;
class PE02AG {

public static void main (String Lai []){

	Scanner ent=new Scanner (System.in);

	int jn=0;
	
	System.out.print("Enter a Number: ");
	jn=ent.nextInt();
	
	if (jn == 0 )
	{
	System.out.print("The number  is  Zero");	
	}
	else if (jn <0)
	{
	System.out.print("The number is Negative ");
	}
	else
	{
	System.out.print("The number is Positive ");
	}

   }
}
