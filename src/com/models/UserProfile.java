
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UserProfile generated by hbm2java
 */
@Entity
@Table(name = "user_profile", catalog = "camcof", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class UserProfile implements java.io.Serializable {

	private Integer idUserProfile;
	private String username;
	private String password;
	private Set<SensingData> sensingDatas = new HashSet<SensingData>(0);

	public UserProfile() {
	}

	public UserProfile(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public UserProfile(String username, String password,
			Set<SensingData> sensingDatas) {
		this.username = username;
		this.password = password;
		this.sensingDatas = sensingDatas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idUser_profile", unique = true, nullable = false)
	public Integer getIdUserProfile() {
		return this.idUserProfile;
	}

	public void setIdUserProfile(Integer idUserProfile) {
		this.idUserProfile = idUserProfile;
	}

	@Column(name = "username", unique = true, nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<SensingData> getSensingDatas() {
		return this.sensingDatas;
	}

	public void setSensingDatas(Set<SensingData> sensingDatas) {
		this.sensingDatas = sensingDatas;
	}

}
