package finalExam;
import java.util.*;
//public class Book {
//	protected String title,author;
//	protected int page;
//	protected double price;
//	public Book() {
//		title = "";
//		author = "";
//	}
//	public void setTitle(String title)
//	{
//		this.title = title;
//	}
//	public String getTitle()
//	{
//		return this.title;
//	}
//	public void setAuthor(String author)
//	{
//		this.author = author;
//	}
//	public String getAuthor()
//	{
//		return this.author;
//	}
//	public void setPage(int page)
//	{
//		if(page < 0 )
//			this.page = 0;
//		else 
//			this.page = page;
//	}
//	public int getPage()
//	{
//		return this.page;
//	}
//	public void setPrice(double price)
//	{
//		if(price < 0)
//			this.price = 0;
//		else this.price = price;
//	}
//	public double getPrice()
//	{
//		return this.price;
//	}
//	public void updatePrice(double rate)
//	{
//		this.price = this.price * rate;
//	}
//	public void input()
//	{
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please input the title of book : ");
//		setTitle(in.nextLine());
//		System.out.println("Book's author : ");
//		setAuthor(in.nextLine());
//		System.out.println("Book's total pages : ");
//		setPage(in.nextInt());
//		System.out.println("Book's price : ");
//		setPrice(in.nextDouble());
//		System.out.println("The book's information : "+toString());
//		System.out.println("How much discount ? ");
//		updatePrice(1-in.nextDouble());
//		System.out.println("After update price,the book's information : "+toString());
//	}
//	public String toString()
//	{
//		return "Book{title : "+this.getTitle()+",author: "+this.getAuthor()+",page : "+this.getPage()+",price : "+this.getPrice()+"}";
//	}
//	public static void main(String[] args) {
//		Book tmp = new Book();
//		tmp.input();
//	}
//}
import java.util.Scanner;
public class Book {
	private String title;
	private String author;
	private int page;
	private double price;
	public Book(){
		this.title="";
		this.author="";
	}
	public void Book(String title,String author,int page,double price ) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPage(page);
		this.setPrice(price);
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getauthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public int getPage() {
		return this.page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("title:");
		this.setTitle(kb.nextLine());
		System.out.println("author:");
		this.setAuthor(kb.nextLine());
		System.out.println("page:");
		this.setPage(kb.nextInt());
		System.out.println("price:");
		this.setPrice(kb.nextDouble());
		System.out.println(toString());
		System.out.println("how much discount?\n");
		updatePrice(1-kb.nextDouble());
		System.out.println("Apter update "+toString());
	}
	public void updatePrice(double rate) {
		this.price=this.price*rate;
		/*double k;
		Scanner kb=new Scanner(System.in);
		System.out.println("how much discount?\n"+rate);
		k=(this.getPrice()-(this.getPrice()*rate))*10;
		System.out.println("after the books information:Book{ title="+this.getTitle()+","+"author="+this.getauthor()+","+"pages"+this.getPage()+","+"price:"+k+"}");*/
	}
	public String toString() {
		String string = "the books information:Book{ title="+this.getTitle()+","+"author="+this.getauthor()+","+"pages"+this.getPage()+","+"price:"+this.getPrice()+"}";
		return string;
	}
	public void output() {
		System.out.println(toString());
		
	}
	public static void main(String[] args) {
		Book b=new Book();
		b.input();
	}
}
