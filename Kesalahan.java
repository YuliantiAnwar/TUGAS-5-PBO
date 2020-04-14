class Kesalahan{
	public static void main(String[] args){
		System.out.println("Exception Test");
	try{
	int result = 5/0;
	}
	catch(Exception e){
	System.out.println("Some Error Occured");
	}
	finally{
	System.out.println("End of the Test");
	}
}
}
