package JavaActivity2_1;

public class MyBook extends book{

	public static void main(String[] args) {
			MyBook mBook=new MyBook();
			mBook.setTitle("The white tiger");
			System.out.println("The title of the book is "+mBook.getTitle());
		

	}
	
	public void setTitle(String setTitle)
	{
		title=setTitle;
	}

}
