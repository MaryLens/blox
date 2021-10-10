package papers;

public class Journal implements ThingInteface{
	private Integer pages;
	private String title;
	private String category;
	private String name;

	public Journal(Integer pages, String title, String category) {
		setPages(pages);
		setTitle(title);
		setCategory(category);
	}

	public Journal() {
	}
	
	public String toString() {
		return "[" + category + " journal \"" + title + "\" (" + pages + " pages)]";
	}
	public String getName() {
		name = toString();
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
