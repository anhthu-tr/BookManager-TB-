package advance.dev.model;

public interface IBookManager {
	public void add(Book book);
	public void borrow(Book book);
	public void returnBook(Book book);
	public void show();
}
