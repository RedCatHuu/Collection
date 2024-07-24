package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate localDate;
	private String str;
	
	public Task(LocalDate localDate, String str) {
		this.localDate = localDate;
		this.str = str;
	}
	
    public LocalDate getLocalDate() {
        return localDate;
    }
    
    @Override
    public String toString() {
        return localDate + ":" + str;
    }
}
