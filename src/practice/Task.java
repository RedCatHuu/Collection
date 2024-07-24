package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate localDate;
	private String task;
	
	public Task(LocalDate localDate, String str) {
		this.localDate = localDate;
		this.task = str;
	}
	
    public LocalDate getLocalDate() {
        return this.localDate;
    }
    
    @Override
    public String toString() {
        return this.localDate + ":" + this.task;
    }
}
