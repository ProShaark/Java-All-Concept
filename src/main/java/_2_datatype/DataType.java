package _2_datatype;

import java.util.Vector;

/*
 
 Data types specify
 
 Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:
 
 There are 2 type of dataTypes.
 
 1: Primitive data types   2: Non-Primitive data types
 
 1: Primitive data type 
 
 the Primitive data type is pre defined data types 
 short , long, int , char , boolean , float , double 
 
2: Non-Primitive data types
The  Non-Primitive data type include classes , interfaces and Arrays.
 
 
 													Data Types
 
 			Primitive																						Non-Primitive
 
 			short 																								String
 			long																								Array 
 			int 																								Quee
 			float																								class
 			double
 			boolean	
 			char
 			


Data Type	Default Value	Default size
 short			0				2 bytes			
 long			0L				8  bytes
 int 			0				4 bytes
 float			0.0f			4 bytes
 double			0.0d			8 bytes
 char 			'\u0000'		2 bytes
 boolean		false			1 bit
 byte			0				1 byte
 
 
 Why char uses 2 byte in java and what is \u0000 ?
 It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system. 
 
 */



public class DataType {

	
	
	// primative data type
	
	short short_datatype=0;
	byte byte_datatype=0;
	long long_datatype=0L;
	int int_datatype=0;
	float float_datatype=0F;
	double double_dataType=0D;
	char char_datatype='a';
	boolean boolean_Datatype=false;
	
	
	// non-primative data type
	
	int [] array_datatype = new int[5];
	String string_dataType;
	Vector<Integer> vector_datatype = new Vector<Integer>(5);
	class class_datatype{};
	
	
}
