public enum Season1 {
	SPRING("��"), SUMMER("����"), FALL("����"), WINTER("�ܿ�");

	private String name;

	private Season1() {
	
	}

	private Season1(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}