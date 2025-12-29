package personalexpensetracker;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		ExpenseDAO dao = new ExpenseDAO();
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("==== Personal Expense Tracker ====");
			
			System.out.println("1. Add Expense");
			System.out.println("2. View All Expenses");
			System.out.println("3. View Expenses by Category");
			System.out.println("4. Monthly Summary");
			System.out.println("5. Exit");
			
			System.out.println();
			
			System.out.println("Enter your choice:");
			
			int choice;
			
			try {
				choice = sca.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter a number");
			    sca.nextLine();
			    continue;
			}
			
			switch (choice) {
			case 1: {
				System.out.println("Enter your Expense");
				double expenseAmount = sca.nextDouble();
				if(expenseAmount <= 0) {
					System.out.println("Expense must be greater than 0");
					break;
				}
				sca.nextLine();
				
				System.out.println("Enter the Category");
				String category = sca.nextLine();
				if(category.trim().isEmpty()) {
					System.out.println("Category cannot be empty");
					break;
				}
				
				System.out.println("Enter the Date[yyyy-MM-dd]");
				LocalDate date;
				try {
					date = LocalDate.parse(sca.next());
				} catch (java.time.format.DateTimeParseException e) {
					System.out.println("Invalid date format. Use yyyy-MM-dd");
					break;
				}
				
				if(date.getYear() > LocalDate.now().getYear()) {
					System.out.println("Enter a valid year");
					break;
				}
				sca.nextLine();
				
				System.out.println("Enter the Description");
				String description = sca.nextLine();
				
				Expense expense = new Expense(expenseAmount, category, date, description);
				try {
					dao.addExpense(expense);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			case 2: {
				try {
					dao.viewAllExpense();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			case 3: {
				System.out.println("Enter the Category");
				sca.nextLine();
				String category = sca.nextLine();
				if(category.trim().isEmpty()) {
					System.out.println("Category cannot be empty");
					break;
				}
				
				try {
					dao.viewByCategory(category);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			case 4: {
				System.out.println("Enter the Month(1 to 12)");
				int month = sca.nextInt();
				if(month < 1 || month > 12) {
					System.out.println("Month must be between 1 and 12");
					break;
				}
				
				System.out.println("Enter the Year");
				int year = sca.nextInt();
				if(year > LocalDate.now().getYear()) {
					System.out.println("Enter a valid year");
					break;
				}
				
				try {
					dao.monthlySummary(month, year);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			case 5: {
				flag = false;
				System.out.println("Thank you");
				break;
			}
			default:
				System.out.println("Invalid choice value : " + choice);
			}
		}
		
		sca.close();
	}

}
