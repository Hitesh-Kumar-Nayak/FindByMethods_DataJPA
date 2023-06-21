package in.ashokit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.BookStore;

public interface BookStoreRepository extends CrudRepository<BookStore, Integer> {
	
	public List<BookStore> findByBookPriceGreaterThanEqual(Double bookPrice);
	
	

	public List<BookStore> findByBookPriceLessThanEqual(double bookPrice);
	
	public List<BookStore> findByBookId(Integer bookId);
	
	
	

}
