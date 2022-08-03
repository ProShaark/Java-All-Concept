package _1_variables;



/*
 Java Variables-
 
 variabels is container which holde the value while the java program is executed.
 
 variabels is assigned with a data type.
 
 variables is a name of memeory location.
 
 three type of Variabels 
 
 1 : local      2:instance     3:static.
 
 It is a combination of "vary + able" which means its value can be changed.
 
 
 1: local variabels
 local variabels are define inside the method. 
 it can not use outside the method
 
 2:instance varibale
 it declare inside the class but out side the method 
 it can not declare as " static "
 
 3:static variabels.
 
 a variabels that declare as static is called static variables.
 it cannot be  local.
 you can create a single copy of the staitc variables 
 it associates to the class.
 Memroy allocation for static variabels happedns only once when the class is loaded in the memory
 
 
 
 
 
 */
public class Variables {

	public  static int static_variabel=10;		// static variabels
	
	public  int instance_Variables=30;        //instance variabels.
	
	public int  methodName()
	{
		 int localvariabel=20;					// local variabels.
		 return localvariabel;
	}
	

	
	
	
}
