package ex.idcard;

import ex.framework.AProduct;

public class IDCard extends AProduct {
	private int id;
	private String owner;

	public IDCard(int id, String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.id = id;
		this.owner = owner;
	}

	@Override
	public String use() {
		return "id:" + id + ",owner:" + owner + "のカードを使います。";
	}

	public int getId() {
		return id;
	}

	public String getOwner() {
		return owner;
	}
}