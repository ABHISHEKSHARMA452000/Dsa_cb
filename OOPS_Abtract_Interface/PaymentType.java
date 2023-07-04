package OOPS_Abtract_Interface;

public class PaymentType extends Banking{
	
	@Override
	public boolean paymentType() {
		// TODO Auto-generated method stub
		return false;
	}
	//ya alag sa client ma bhi kar sakta hai 
	//now due to inheritence ma paymenttype ka ab object bana sakta  hu
	public static void main(String[] args) {
		PaymentType py = new PaymentType();
		py.balance();
		py.paymentType();
	}
}
