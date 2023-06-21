package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BookStore {
	
	@Id
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;

}
