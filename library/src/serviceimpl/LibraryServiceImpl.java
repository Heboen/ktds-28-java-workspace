package serviceimpl;

import java.time.LocalDate;

import domain.Library;
import service.LibraryService;

public class LibraryServiceImpl implements LibraryService {

	private final Library library;

	public LibraryServiceImpl(Library library) {
		this.library = library;
	}

	@Override
	public void addBooks() {

	}

	@Override
	public void disposeBook() {
		LocalDate limitYear = LocalDate.now().minusYears(10);

		this.library.getBookList() // List<BookItem>
				.removeIf(item -> item.getBook().getPublishing().isBefore(limitYear));

	}

	@Override
	public void searchDueUser() {
		LocalDate now = LocalDate.now();

		this.library
		.getUsers()
		.stream()
		.filter(user -> user.getRentBooks()
							.stream()
							.anyMatch(item -> {
							if (item.getRentedDate() == null) {
								return false;
							}
							LocalDate dueDate = item.getRentedDate().plusDays(7);//반납 예정일

							LocalDate warning = dueDate.minusDays(2); //반납경고일자

							return !now.isBefore(warning); //오늘이 warning(경고일자와 같거나 이후이거나)
							})
				).forEach(System.out::println);
	}

	@Override
	public void searchPopularBook() {

		this.library.getBookList()
					.stream()
					.sorted((b1, b2) -> b2.getRentedCount() - b1.getRentedCount())
					.forEach(System.out::println);

	}

	@Override
	public void searchUnPopularBook() {
		this.library.getBookList()
					.stream()
					.sorted((b1, b2) -> b1.getRentedCount() - b2.getRentedCount())
					.forEach(System.out::println);

	}

	@Override
	public void searchLateUser() {
		this.library.getUsers()
					.stream()
					.filter(user -> user.getOverTimeLimit() >= 3)
					.sorted((u1, u2) -> u2.getOverTimeLimit() - u1.getOverTimeLimit())
					.forEach(System.out::println);
					;

	}

	@Override
	public void saveToFile() {
		// TODO Auto-generated method stub

	}

}
