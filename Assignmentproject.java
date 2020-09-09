import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.*;

public class Assignmentproject {
	
	
	
	static int noOfCalls;
	static int noOfSms;
	static int data;
	static int callTime;
	static double[] cost = new double[3];
	static String option7 = new String("Enter your selection: ");
	static void straightLine() {
		int i;
		for (i = 0; i < 50; i++){
			System.out.print("*");}
		}
	static void message() {
		System.out.println(("\nWelcome to phone bill comparision system\n").toUpperCase());
		System.out.println("Developed by Basanta & team, student ids \nOODP101 Object Oriented Design and Programming");
		
	}
	static void mainMenu() {
		System.out.println(("\n" + "Main Menu").toUpperCase());
		System.out.println("\n" + "Please select from the menu: ");
		String option1 = new String("1. Enter Usage Details" + "\n");
		String option2 = new String("2. Display Cost Under Provider 1" + "\n");
		String option3 = new String("3. Display Cost Under Provider 2" + "\n");
		String option4 = new String("4. Display Cost Under Provider 3" + "\n");
		String option5 = new String("5. Clear Usage Details" + "\n");
		String option6 = new String("6. Exit System" + "\n");
		System.out.println(option1 +  option2 + option3 + option4 +option5 +option6);
		}
		
	static void enterUsageDetails() {
		System.out.println("\n" + "ENTER USAGE DETAILS MENU" + "\n");
		System.out.println("Please select an option from the menu:");
		System.out.println("1. Phone Call");
		System.out.println("2. SMS");
		System.out.println("3. Data Usage");
		System.out.println("4. Return to main menu");
		}
	public static void date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.print(dtf.format(now) + "\n");  
		}

	public static void main(String[] args) {
		straightLine();			//calls straightLine method
		message();				//calls message method
		date();					//calls date method
		straightLine();
		mainMenu();				//calls mainMenu method
		
		while (true)				//while the condition is true, the loop will continue to execute its code block
			{
			System.out.print("\n" + option7);
			Scanner selection = new Scanner(System.in);
			int number = selection.nextInt(); 		//takes integer input from user
			if (number<=0 || number>=7) {
				System.out.println("Value must be between 1 and 6"); 		//condition to accept the values between 1 to 6
			}
			else if(number==1) {
				while(true) {
					noOfCalls++;   					//every time number 1 is pressed in the Main Menu, noOfCalls will increases by 1
					enterUsageDetails(); 			//calls enterUsageDetails method
					System.out.print(option7);
					Scanner selection1  = new Scanner(System.in);
					int number1 = selection1.nextInt();				//takes integer input from user
					if (number1<=0 || number1>=5) {					//condition to accept the values between 1 to 6
						System.out.print("Value must be between 1 and 4");
					}
					else if (number1 == 1) {
						while(true) {
							System.out.println("Enter call length in seconds: ");
							Scanner pC = new Scanner(System.in);
							int phoneCalls = pC.nextInt();
							if (phoneCalls< 0) {
								System.out.println("Please enter a Positive Value");
							}		//only accepts positive value
							else {
							System.out.println("Total number of call so far = " + noOfCalls);
							callTime += phoneCalls; 				//callTime = callTime + phoneCalls
							break;									//breaks the loop
							}
							}
						}
					else if(number1 == 2) {
						noOfSms++;
						while(true) {
							System.out.println("Total number of SMS so far: " + noOfSms);
							break;
						}
					}
					else if(number1 == 3) {
						
						while(true) {
							System.out.println("Enter the amount of data in MB: ");
							Scanner dU = new Scanner(System.in);
							int dataUsage = dU.nextInt();
							if (dataUsage<0) {
							System.out.println("Please enter a Positive Value");
						}
						else {
							System.out.println("Data amount so far " + dataUsage + "MB");
							data += dataUsage;					//data = data + dataUsage
							break;}
						}
					}
					else if(number1 == 4) {
						mainMenu();	
						break;
					}	
					}
					
				}
			else if(number == 2) {
				Formatter format1 = new Formatter();
					System.out.println("Cost under provider 1");
					straightLine();
					double callRate = noOfCalls * 0.20;
					format1.format("\nNumber of calls      = %5d %10s $", noOfCalls, callRate);
					double secondRate = callTime * 0.03;
					format1.format("\nTotal call time(sec) = %5d %10s $", callTime, secondRate);
					double smsRate = noOfSms * 0.10;
					format1.format("\nNumber of Sms        = %5d %10s $",noOfSms, smsRate);
					double dataUse = data * 0.02;
					format1.format("\nData Usage (MB)      = %5d %10s $",  data, dataUse);
					System.out.println(format1.out());
					straightLine();
					double sum1 = callRate + secondRate + smsRate + dataUse;
					String s1 = String.format("%.2f", sum1);
					System.out.println("\nTOTAL COST           =              " + s1 + " $"); //gives a proper formatted output
					cost[0] = sum1;		//sets the value of 1st element in the array to sum1
					mainMenu();
				}
			else if(number == 3) {
			   Formatter format2 = new Formatter();
				System.out.println("Cost under provider 2");
				straightLine();
				double callRate = noOfCalls * 0.15;
				format2.format("\nNumber of calls      = %5d %10s $", noOfCalls, callRate);
				double secondRate = callTime * 0.04;
				format2.format("\nTotal call time(sec) = %5d %10s $", callTime, secondRate);
				double smsRate = noOfSms * 0.12;
				format2.format("\nNumber of Sms        = %5d %10s $",noOfSms, smsRate);
				double dataUse = data * 0.04;
				format2.format("\nData Usage (MB)      = %5d %10s $",  data, dataUse);
				System.out.println(format2.out());
				straightLine();
				double sum2 = callRate + secondRate + smsRate + dataUse;
				String s2 = String.format("%.2f", sum2);
				System.out.println("\nTOTAL COST           =              " + s2 + " $");		//gives a proper formatted output
				cost[1] = sum2;		////sets the value of 2nd element in the array to sum2
				mainMenu();
			}
			else if(number == 4) {
				Formatter format3 = new Formatter();
				System.out.println("Cost under provider 3");
				straightLine();
				double callRate = noOfCalls * 0.80;
				format3.format("\nNumber of calls      = %5d %10s $", noOfCalls, callRate);
				double secondRate = callTime * 0.27;
				format3.format("\nTotal call time(sec) = %5d %10s $", callTime, secondRate);
				double smsRate = noOfSms * 0.50;
				format3.format("\nNumber of Sms        = %5d %10s $",noOfSms, smsRate);
				double dataUse = data * 0.20;
				format3.format("\nData Usage (MB)      = %5d %10s $",  data, dataUse);
				System.out.println(format3.out());
				straightLine();
				double sum3 = callRate + secondRate + smsRate + dataUse;
				String s3 = String.format("%.2f", sum3);
				System.out.println("\nTOTAL COST           =              " + s3 + " $");
				cost[2] = sum3;		//sets the value of 3rd element in the array to sum3		//gives a proper formatted output
				mainMenu();
			}
			else if(number == 5) {
				noOfCalls = 0;				//sets noOfCalls to 0
				noOfSms = 0;				//sets noOfSms to 0
				data = 0;					//sets data to 0
				callTime = 0;				//sets callTime to 0
				double cost[] = {0};		//sets values of the array to 0
				straightLine();
				System.out.println("\n" + "ALL USAGE DETAILS HAVE BEEN RESET TO 0");
				straightLine();
				mainMenu();
			}
			else if(number == 6) {
				double max = cost[0];
			    for(int i = 1; i < cost.length; i++){
			      if(cost[i]>max) {
			        max = cost[i];}
			    }		//checks for the maximum value in the array
			    {
			        if (max==cost[0]) {
				    	System.out.println("Service Provider 1 is the most expensive.");
				    }
				    else if (max==cost[1]) {
				    	System.out.println("Service Provider 2 is the most expensive.");
				    }
				    else if (max==cost[2]) {
				    	System.out.println("Service Provider 3 is the most expensive.");
				    }
			      }		//checks which element is maximum value and prints the corresponding Service Provider as most expensive
			    double min = cost[0];
			    for(int j = 1; j < cost.length; j++){
			      if(cost[j]<min) {
			        min = cost[j];}
			      }		//checks for the minimum value in the array
			    {
			        if (min==cost[0]) {
				    	System.out.println("Service Provider 1 is the most cheapest.");
				    }
				    else if (min==cost[1]) {
				    	System.out.println("Service Provider 2 is the most cheapest.");
				    }
				    else if (min==cost[2]) {
				    	System.out.println("Service Provider 3 is the most cheapest.");
				    }
			      }		//checks which element is minimum value and prints the corresponding Service Provider as cheapest
			    System.exit(0);			//exit the program
			    }    
		}
	}
}
				
			
			
			
			
			
		
	  
	
