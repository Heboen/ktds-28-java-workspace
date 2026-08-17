package service;

public interface LibraryService {
	
	void addBooks();
	void disposeBook();
	void searchDueUser();
	void searchPopularBook();
	void searchUnPopularBook();
	void searchLateUser();
	void saveToFile();

}
