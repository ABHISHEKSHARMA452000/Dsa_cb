package Stack_Queue_Implementation_Dynamic;

//import package_name.*;for all class to import in this package
import Stack_Queue_Implementation_Static.*;

public class DynamicStack extends Stack {
	/*funtion overriding means DynamicStack child Class hai of parent Stack class
	 * ya per function push override hoga jab ma DynamicStack ka object banta hu 
	 * parent class ka all funtions method and data member child class use kar sakta hai and function override bhi kara
	 * sakta hai parent class ka */
	//function overriding is a type of runtime polymorphism and overloading is compile time polymorphism
	public void push(int item) throws Exception {
		if(IsFull()) {
			int[] narr = new int[2*arr.length]; //if ma arr ko private hi rakh ta hu toh ya error aata hai = The field Stack.arr is not visible
			//hence arr ka access modifier protected karna padaga and protected and private ma yahi diffrence hai ki protected diffrence 
			//packages ma bhi allowed hota hai to access
			for(int i=0;i<arr.length;i++) {
				narr[i] =  arr[i]; //phele copy kiya all 0 to end index ki values then narr ka address arr ko dubar assign kar diya
			}
			arr = narr;
		}
		//push(item); //yaha problem aa jaya gi if simple push(item) ko call karta hu bcoz function yaha par override hua hai toh 
		//yahi function ma push ma item dala toh recursive call lag jayagi function ki means funtion ka andar function hai of same name
		//jissa push(item) -> push(item) ki recursive call chalta chalta stack overflow ho jayaga thats why ek super name ka keyword hai java ma
		//jo parent class ka function ko call karna ma kaam aata hai iski help sa recursive call sa bach jaya ga
		super.push(item);
	}
}
