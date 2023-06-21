package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.BookStore;
import in.ashokit.repository.BookStoreRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		BookStoreRepository repository = context.getBean(BookStoreRepository.class);
		
		/*BookStore book = new BookStore();
		book.setBookId(1001);
		book.setBookName("Spring");
		book.setBookPrice(1000.0);*/
		
		//================Insert one book record using save()==================================
		
	     /*BookStore save = repository.save(book);
	     System.out.println(save);*/
		
//		BookStore book2 = new BookStore();
//		book2.setBookId(1002);
//		book2.setBookName("Java");
//		book2.setBookPrice(2000.0);
//		
//		BookStore book3 = new BookStore();
//		book3.setBookId(1003);
//		book3.setBookName("Python");
//		book3.setBookPrice(3000.0);
//		
//		BookStore book4 = new BookStore();
//		book4.setBookId(1001);
//		book4.setBookName("Spring");
//		book4.setBookPrice(1000.0);
//		
//		//====================Insert multiple book record in a table using saveAll();=========================
//		
//		List<BookStore> list = Arrays.asList(book2,book3,book4);
//		
//		Iterable<BookStore> saveAll = repository.saveAll(list);
//		System.out.println(saveAll);
		
		//==============Retrive one record using findById();========================
		
		//Optional<BookStore> optional = repository.findById(1003);
		//System.out.println(optional);
	
		//=================Check the record is exist or not by using existsById();================
        // boolean existsById = repository.existsById(1001);	
        // System.out.println(existsById);
		
		
		//=================Check How Many Record Insert in a Table============
		//long count = repository.count();
		//System.out.println(count);
		
		//========Retrieve multiple record into database using FindAllById();===========
//		List<Integer> findallbyid = Arrays.asList(1001,1002,1003);
//		
//		Iterable<BookStore> findAllById2 = repository.findAllById(findallbyid );
//		System.out.println(findAllById2);
		
		//==============Find all record from table using FindAll();=======================
		
//		Iterable<BookStore> all = repository.findAll();
//		System.out.println(all);
		
		/*List<BookStore> equal = repository.findByBookPriceGreaterThanEqual(2000.00);
		System.out.println(equal);*/
		
		List<BookStore> equal = repository.findByBookPriceLessThanEqual(2000.00);
		System.out.println(equal);
		
		List<BookStore> bookId = repository.findByBookId(1002);
		System.out.println(bookId);
//		
		
	}

}
