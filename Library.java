package LibraryManegmentSystem;

import java.util.Scanner;

public class Library {
	static String name;
	static int id,nobook;
static	String date, date1;
void add()
{
	System.out.println("enter book name,price and book_no");
	
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	float price=sc.nextFloat();
	int bookno=sc.nextInt();
	System.out.println("your details is"+name+price+bookno);
	
}
void issue()
{
	Scanner sc1=new Scanner(System.in);
	System.out.println("book name");
	name=sc1.nextLine();
	System.out.println("book_id");
	id=sc1.nextInt();
	sc1.nextLine();
	System.out.println("issue date");
	date=sc1.nextLine();
	System.out.println("total number of books issued");
	nobook=sc1.nextInt();
	sc1.nextLine();
	System.out.println("return book date");
	date1=sc1.nextLine();
	
}
int gatid()
{
	return id;
}
void ret() 
		{
	
	System.out.println("enter student name & book_id");
	Scanner c=new Scanner(System.in);
	String na=c.nextLine();
	int book_id=c.nextInt();
	if(id==book_id)
		{
		System.out.println("total details");
		System.out.println("total name"+Library.name);
		System.out.println("total id"+Library.id);
		System.out.println("issue date"+Library.date);
		System.out.println("total number of book issued"+Library.nobook);
		System.out.println("book return date"+Library.date1);
}
	else
	{
		System.out.println("wrong id,pls enter correct id");
	}
	}
void deatil()
{
	System.out.println("total name"+Library.name);
	System.out.println("total id"+Library.id);
	System.out.println("issue date"+Library.date);
	System.out.println("total number of book issued"+Library.nobook);
	System.out.println("book return date"+Library.date1);
}
void exit()
{
	
}
}
