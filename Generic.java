// ���׸��� ������ Ŭ����

public class Generic<T>{
	private T obj;

	public Generic() {
	}

	public Generic(T _obj) {
		this.obj = _obj;
	}

	public void setObj(T _obj) {
		this.obj = _obj;
	}

	public T getObj() {
		return this.obj;
	}
}