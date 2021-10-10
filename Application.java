package main;

import papers.Book;
import papers.Box;
import papers.Journal;

public class Application {

	public static void main(String[] args) {
		Box firstBox = new Box();
		Box secondBox = new Box();

		Book book = new Book(1157, "Uglies", "Scott Westerfild", 2005);
		Journal journal = new Journal(157, "Vogue", "Fashion");

		firstBox.setContent(book);
		secondBox.setContent(journal);

		System.out.println(firstBox.toString());
		System.out.println(secondBox.toString());
		// одну и ту же книгу книгу в обе коробки конечно положить можно
		secondBox.setContent(book);
		book.setTitle("Extra");
		// если мы меняем название книги в первой коробке, то меняется и название в
		// другой, ведь это буквально один и тот же объект, одно и то же место в памяти,
		// на который ссылаются обе коробки
		System.out.println(firstBox.toString());
		System.out.println(secondBox.toString());

	}

}
