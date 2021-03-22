import java.util.*;
public class DatesExample{
public static void main(String [] args){
Scanner scan =new Scanner(System.in);
System.out.println("Illusttrating the use of gregorianCalendar class to work with dates and times");
String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
Date dt= new Date();
//Take note of the date printed
System.out.println(dt.toString());
gregorianCalendar gc=new gregorianCalendar();
//generate an integer number yyyy representing the year
int year=gc.get(Calendar.YEAR);

//generate an integer number [0-11] representing the month number
int month=gc.get(Calendar.MONTH);
//generate an integer number [1-31] representing the date of month number
int dte=gc.get(Calendar.DATE);
int hour=gc.get(Calendar.HOUR);
int min=gc.get(Calendar.MINUTE);
int sec=gc.get(Calendar.SECOND);
//Constricting the fuill date using date elements obtaing from the gregorianCalendar
System.out.println("Year is:\t"+year);
System.out.println("Date is:\t"+dte);
System.out.println("Month is:\t"+months[month]);
System.out.println("Time is:\t"+hour+":"+min+":"+sec);
//We need now to use the function age() to return the age of a given date of birth
System.out.println("Enter the date of birth as in [dd-mm-yyyy");
String dob=scan.next();
int age=age(dob);
System.out.println("Age is \t:"+age);

}//end of main method

//A function that recieve a date in the format dd/mm/yyyy and return the age
public static int age(String dte){
gregorianCalendar gc=new gregorianCalendar();
// Split the dob into components dd, mm. and yyyy which are the elements of the array comps
String[] comps=dte.split("-");
// obtains the third element which if the yyyy
int dobyear=Integer.parseInt(comps[2]);
// Obtaining the year of the gegorian carlender
int year=gc.get(Calendar.YEAR);
//Subtracting to get the age
int ag=year-dobyear;
return ag;
}//End of function

}
