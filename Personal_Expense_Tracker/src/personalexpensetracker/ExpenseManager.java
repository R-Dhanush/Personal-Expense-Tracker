package personalexpensetracker;

import java.util.ArrayList;
import java.util.HashMap;

public class ExpenseManager {
	private ArrayList<Expense> expenses = new ArrayList<>();
	
	public void addExpense(Expense e) {
		expenses.add(e);
	}
	
	public void viewAllExpense() {
		if(expenses.isEmpty()) {
			System.out.println("No expenses found.");
			return;
		}
		
		for(Expense e : expenses) {
			System.out.println(e);
		}
	}
	
	public void viewByCategory(String category) {
		if(expenses.isEmpty()) {
			System.out.println("No expenses found.");
			return;
		}
		
		boolean found = false;
		
		double expenseAmount = 0.0;
		
		for(Expense e : expenses) {
			if(e.getCategory().equalsIgnoreCase(category)) {
				found = true;
				expenseAmount += e.getExpense();
				System.out.println(e);
			}
		}
		
		if(!found) {
			System.out.println("No expenses found for given category.");
		}else {
			System.out.println("Category Summary ( " + category + " : " + expenseAmount + " )");
		}
		
	}
	
	public void monthlySummary(int month, int year) {
		if(expenses.isEmpty()) {
			System.out.println("No expenses found.");
			return;
		}
		
		HashMap<String, Double> group = new HashMap<>();
		
		for(Expense e : expenses) {
			if(e.getDate().getMonthValue() == month && e.getDate().getYear() == year) {
				String category = e.getCategory();
				double expense = e.getExpense();
				
				group.put(category, group.getOrDefault(category, 0.0) + expense);
			}
		}
		
		if(group.isEmpty()) {
			System.out.println("No expenses found for given month.");
			return;
		}
		
		double total = 0.0;
		System.out.println("Monthly Summary (" + month + "/" + year + ")");
		for(String category : group.keySet()) {
			System.out.println(category + " : " + group.get(category));
			total += group.get(category);
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Total : " + total);
	}
}
