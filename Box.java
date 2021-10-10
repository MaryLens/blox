package papers;

/**
 * ��������� ��� �������, ��� ��� ������� �������, ���������������� ���������
 * ThingInteface ����� �������� � ���������� ����� ��� name
 */

interface ThingInteface {
	public void setName(String name);

	public String getName();
}

public class Box {
	private ThingInteface content;

	public Box(ThingInteface content) {
		setContent(content);
	}

	public Box() {

	}

	/**
	 * ThingInteface content ������� ��� � ���, ��� �������� content �����
	 * ��������� �� ����� ������, ������� ������� �������� ����������� ������,
	 * ������������ ��������� ThingInteface, ��� ����� ���������, � � �����
	 * ����������� � ����� ����
	 */

	public String toString() {
		return "" + content;
	}

	public ThingInteface getContent() {
		return content;
	}

	public void setContent(ThingInteface content) {
		this.content = content;
	}

}
