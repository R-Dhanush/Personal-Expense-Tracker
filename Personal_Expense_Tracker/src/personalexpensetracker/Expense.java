package personalexpensetracker;

import java.time.LocalDate;

public class Expense {
	private double expense;
	private String category;
	private LocalDate date;
	private String description;
	
	public Expense(double expense, String category, LocalDate date, String description) {
		this.expense = expense;
		this.category = category;
		this.date = date;
		this.description = description;
	}
	
	public double getExpense() {
		return expense;
	}
	
	public String getCategory() {
		return category;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "Amount: ₹" + expense + " | Category : " + category + " | Date : " + date + " | Note : "
				+ description;
	}
}
