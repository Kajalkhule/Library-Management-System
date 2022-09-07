package LibraryManegmentSystem;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		char r;
		do
		{
		System.out.println("-----------------Library Manegment System--------");
		System.out.println("press 1 to add Book");
		System.out.println("press 2 to  issue Book");
		System.out.println("press 3 to return Book");
		System.out.println("press 4 to print comlete issue details");
		System.out.println("press 5 to Exit");
		
Scanner sca=new Scanner(System.in);
System.out.println("enter any number");
int a=sca.nextInt();
switch(a)
{
case 1:
	Library li=new Library();
	li.add();
	break;
	
case 2:
	Library li1=new Library();
	li1.issue();
	break;
	
case 3:
	Library li2=new Library();
	li2.ret();
	break;
	
case 4:
	Library li3=new Library();
	li3.deatil();
	break;
	
case 5:
	Library li4=new Library();
	li4.exit();
	break;
	default:
		System.out.println("invalid number");
	
	}
		
		
System.out.println("you want select next option Y/N");
r=sca.next().charAt(0);

		}while(r=='y'||r=='Y');
if(r=='n'||r=='N')
{
	Library z=new Library();
	z.exit();
}
	}
	
}
