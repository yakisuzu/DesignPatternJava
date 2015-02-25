package ps1;

public enum TicketMaker {
	INSTANCE;

	private TicketMaker() {
	}

	private int ticket = 1000;

	public int getNextTicketNumber() {
		return ticket++;
	}
}