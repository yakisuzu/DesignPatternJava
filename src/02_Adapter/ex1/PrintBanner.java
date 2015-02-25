package ex1;

import ex.Banner;

public class PrintBanner extends APrint {
	private Banner banner;

	public PrintBanner(String str) {
		this.banner = new Banner(str);
	}

	@Override
	public String printWeek() {
		return banner.showWithAster();
	}

	@Override
	public String printStrong() {
		return banner.showWithAster();
	}
}
