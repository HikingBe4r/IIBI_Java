public enum Season1 {
	SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");

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