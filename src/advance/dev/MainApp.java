package advance.dev;

import java.util.Scanner;

import advance.dev.model.Book;
import advance.dev.model.BookManager;
import advance.dev.model.IBookManager;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBookManager bookManager = new BookManager();
		randomStoreBook(bookManager);

		Scanner sc = new Scanner(System.in);
		int choose = -1;
		do {
			showMenu();
			choose = sc.nextInt();
			sc.nextLine();
			switch (choose) {
			case 1:
				bookManager.show();
				break;
			case 2:
				addBook(bookManager);
				break;
			case 3:
				borrowBook(bookManager);
				break;
			}
		} while (choose != 0);
		System.out.println("Ket thuc chuong trinh");
		sc.close();
	}

	private static void borrowBook(IBookManager bookManager) {
		// TODO Auto-generated method stub
		
	}

	private static void addBook(IBookManager bookManager) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choose = -1;
		while(choose != 0) {
			System.out.println("Dien thong tin sach");
			System.out.println("Ten sach:");
			String name = sc.nextLine();
			
			System.out.println("Author:");
			String author = sc.nextLine();
			
			System.out.println("Type:");
			String type = sc.nextLine();
			
			bookManager.add(new Book("100", name, author, type));
			System.out.println("Bam phim 0 de thoat!. Bam phim 1 de nhap tiep");
			choose = sc.nextInt();
			sc.nextLine();
		}
	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Hay chon chuc nang");
		System.out.println("1. Hien thi sach: Bam phim 1");
		System.out.println("2. Them sach: Bam phim 2");
		System.out.println("3. Muon sach: Bam phim 3");
		System.out.println("4. Thoat : Bam phim 0");
	}

	private static void randomStoreBook(IBookManager bookManager) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			String id = "id" + i;
			String name = "Book " + i;
			String author = "Author " + i;
			String type = "type" + i;
			bookManager.add(new Book(id, name, author, type));
		}
	}

}
