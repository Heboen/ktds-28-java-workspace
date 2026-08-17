package serviceimpl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

import domain.BookItem;
import domain.Library;
import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService{
	
	private final User user;
	private final Library library;
	
	public UserServiceImpl(Library library, User user) {
		this.library = library;
		this.user = user;
	}

	@Override
	public void searchGenre() {
		String genre = null;
		Set<String> itemSet = new HashSet<>();
		this.library.getBookList() //List<BookItem>
					.stream() // Stream<BookItem>
					.filter(item -> item.getBook().getGenre().equals(genre)) // Stream<BookItem>
					.filter(item -> {
						String isbn = item.getBook().getIsbn();
						if(itemSet.contains(isbn)) {
							return false;
						}
						itemSet.add(isbn);
						return true;
					}) // Stream<BookItem>
					//add 성공시 true, 실패시 false
					.forEach(System.out::println)
					;
		
	}

	@Override
	public void searchPublisher() {
		String publisher = null;
		Set<String> itemSet = new HashSet<>();
		this.library.getBookList()
					.stream()
					.filter(item -> item.getBook().getPublisher().equals(publisher))
					.filter(item -> {
						String isbn = item.getBook().getIsbn();
						if(itemSet.contains(isbn)) {
							return false;
						}
						itemSet.add(isbn);
						return true;
					}) // Stream<BookItem>
					//add 성공시 true, 실패시 false
					.forEach(System.out::println)
					;
		
	}

	@Override
	public void searchAuthor() {
		String author = null;
		Set<String> itemSet = new HashSet<>();
		this.library.getBookList()
					.stream()
					.filter(item -> item.getBook().getAuthor().equals(author))
					.filter(item -> {
						String isbn = item.getBook().getIsbn();
						if(itemSet.contains(isbn)) {
							return false;
						}
						itemSet.add(isbn);
						return true;
					}) // Stream<BookItem>
					//add 성공시 true, 실패시 false
					.forEach(System.out::println)
					;
		
	}

	@Override
	public void rentalBook() {
		
		if(this.user.getOverTimeLimit() >= 3) {
			System.out.println("연체 횟수가 3회 이상이므로 더 이상 대여할 수 없습니다.");
		}
		String title = null;
		BookItem item = this.library.getBookList()
									.stream()
									.filter(book -> book.getBook().getTitle().equals(title))
									.filter(book -> !book.isRented())
									.findFirst()
									.orElse(null);
		
		
	}

	@Override
	public void returnBook() {
		this.user.getRentBooks()
				 .stream()
				 .map(item -> item.getBook().getTitle())
				 .forEach(System.out::println);
		String title = null;
		BookItem item = this.user.getRentBooks()
								 .stream()
								 .filter(book -> book.getBook().getTitle().equals(title))
								 .findFirst()
								 .orElse(null)
								 ;
		if(item == null) {
			System.out.println("대여 중인 도서가 아닙니다.");
			return;
		}
		
		LocalDate now = LocalDate.now();
		LocalDate dueDate = item.getRentedDate().plusDays(7);
		
		if(now.isAfter(dueDate)) {
			long over = ChronoUnit.DAYS.between(now, dueDate);
			this.user.overDueDate();
			this.user.addFine(over*500);
		}
		item.setRented(false);
		item.setReturned(true);
		item.setRentedDate(now);
		item.setRentedUser(null);
		
		this.user.getRentBooks().remove(item);
		System.out.println("반납완료");
		
	}
	
	

}
