package papers;

public class Book implements ThingInteface {
	private Integer pages;
	private String title;
	private String authorName;
	private Integer publishingYear;
	private String name;

	public Book(Integer pages, String title, String authorName, Integer publishingYear) {
		setPages(pages);
		setTitle(title);
		setAuthorName(authorName);
		setPublishingYear(publishingYear);
	}

	public String toString() {
		return "[\"" + title + "\"" + " by " + authorName + " " + publishingYear + "y. (" + pages + " pages)]";
	}

	public String getName() {
		name = toString();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book() {
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(Integer publishingYear) {
		this.publishingYear = publishingYear;
	}

	/**
	 * anotherBook �� ����� �������� ����������� �� oneBook.title, ������ � �������
	 * ��� ��� �������, ���� �� ���������� ��� ������� ��� ����� ������ Book
	 * anotherBook.setTitle(oneBook.getTitle()) ; ��� ��� �������� ��������� � �� ��
	 * ����� � ���� ���������� ��� ����� ������� ������. ������ ���� ��� � ������
	 * ������ �������� ���� �� �������� � ������ ������ Book, �� ������ �� ������
	 * ���������� � title ��������:
	 
	public static void main(String[] args) {
		Book oneBook = new Book(1157, "Uglies", "Scott Westerfild", 2005);
		Book anotherBook = new Book(100, "Meow", "Name", 2000);

		anotherBook.title = oneBook.title;
		System.out.println(anotherBook.toString());
	}
	*/
}
