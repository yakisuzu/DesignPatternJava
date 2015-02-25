package ex;

public class PrintBanner extends Banner implements IPrint {
	public PrintBanner(String str) {
		super(str);
	}

	@Override
	public String printWeek() {
		return showWithParen();
	}

	@Override
	public String printStrong() {
		return showWithAster();
	}
}
