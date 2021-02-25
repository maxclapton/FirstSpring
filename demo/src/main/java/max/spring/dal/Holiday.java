package max.spring.dal;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import lombok.Data;


/**
 * The persistent class for the holiday database table.
 * 
 */
@Entity
@Table(name="holiday")
@Data
@NamedQuery(name="Holiday.findAll", query="SELECT h FROM Holiday h")
public class Holiday implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String country;

	@Temporal(TemporalType.DATE)
	private Date date;

	private int type;

	public Holiday() {
	}

}