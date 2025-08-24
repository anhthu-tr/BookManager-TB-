package advance.dev.model;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements IBookManager {
	private List<Book> storeBookList = new ArrayList<>();
	private List<Book> borrowBookList = new ArrayList<>();
	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		storeBookList.add(book);
	}

	@Override
	public void borrow(Book book) {
		// TODO Auto-generated method stub
		storeBookList.remove(book);
		borrowBookList.add(book);
	}

	@Override
	public void returnBook(Book book) {
		// TODO Auto-generated method stub
		storeBookList.add(book);
		borrowBookList.remove(book);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		for (Book book : storeBookList) {
			System.out.println(book);
		}
	}

}
