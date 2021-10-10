package papers;

/**
 * интерфейс нам говорит, что все объекты классов, имплементирующих интерфейс
 * ThingInteface умеют получать и возвращать некое им€ name
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
	 * ThingInteface content говорит нам о том, что свойство content может
	 * ссылатьс€ на любой объект, который который €вл€етс€ экземпл€ром класса,
	 * реализующего интерфейс ThingInteface, что будет контентом, т е некой
	 * информацией о некой вещи
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
