
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MidlevelInformation generated by hbm2java
 */
@Entity
@Table(name = "midlevel_information", catalog = "camcof")
public class MidlevelInformation implements java.io.Serializable {

	private Integer idMidlevelInformation;
	private HighlevelInformation highlevelInformation;
	private SensingData sensingData;
	private DataContext dataContext;
	private Metrics metrics;
	private String description;
	private String feature;

	public MidlevelInformation() {
	}

	public MidlevelInformation(HighlevelInformation highlevelInformation,
			SensingData sensingData, DataContext dataContext, Metrics metrics) {
		this.highlevelInformation = highlevelInformation;
		this.sensingData = sensingData;
		this.dataContext = dataContext;
		this.metrics = metrics;
	}

	public MidlevelInformation(HighlevelInformation highlevelInformation,
			SensingData sensingData, DataContext dataContext, Metrics metrics,
			String description, String feature) {
		this.highlevelInformation = highlevelInformation;
		this.sensingData = sensingData;
		this.dataContext = dataContext;
		this.metrics = metrics;
		this.description = description;
		this.feature = feature;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idMidlevel_information", unique = true, nullable = false)
	public Integer getIdMidlevelInformation() {
		return this.idMidlevelInformation;
	}

	public void setIdMidlevelInformation(Integer idMidlevelInformation) {
		this.idMidlevelInformation = idMidlevelInformation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Highlevel_idHighlevel", nullable = false)
	public HighlevelInformation getHighlevelInformation() {
		return this.highlevelInformation;
	}

	public void setHighlevelInformation(
			HighlevelInformation highlevelInformation) {
		this.highlevelInformation = highlevelInformation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "Sensing_data_idSensing", referencedColumnName = "idSensing", nullable = false),
			@JoinColumn(name = "Sensing_data_Sensor_node_idSensor_node", referencedColumnName = "Sensor_node_idSensor_node", nullable = false) })
	public SensingData getSensingData() {
		return this.sensingData;
	}

	public void setSensingData(SensingData sensingData) {
		this.sensingData = sensingData;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Data_context_idData_context", nullable = false)
	public DataContext getDataContext() {
		return this.dataContext;
	}

	public void setDataContext(DataContext dataContext) {
		this.dataContext = dataContext;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Metrics_idMetrics", nullable = false)
	public Metrics getMetrics() {
		return this.metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "feature", length = 45)
	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

}
