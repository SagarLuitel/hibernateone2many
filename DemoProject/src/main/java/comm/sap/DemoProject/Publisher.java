package comm.sap.DemoProject;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name="Publisher_Table")
public class Publisher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer publisherId;
	@Column(length =25)
	private String publisherName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pub_id")
	private Set<Book> book;


	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	
	
	

}
