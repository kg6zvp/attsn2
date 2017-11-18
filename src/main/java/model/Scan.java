package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "scans")
public class Scan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	String timestamp;
	String wapName;
	String building;
	String room;
	Double upload;	
	Double download;
	Double ping;
	Double lat;
	Double lon;
	Integer channel;
	Integer RSSI;
	Integer utilization;
	String device;
	String reporter;
	String notes;
	
	public Scan() {}

	public Scan(String timestamp, String wapName, String building, String room, Double upload, Double download,
			Double ping, Double lat, Double lon, Integer channel, Integer rSSI, Integer utilization, String device,
			String reporter, String notes) {
		super();
		this.timestamp = timestamp;
		this.wapName = wapName;
		this.building = building;
		this.room = room;
		this.upload = upload;
		this.download = download;
		this.ping = ping;
		this.lat = lat;
		this.lon = lon;
		this.channel = channel;
		this.RSSI = rSSI;
		this.utilization = utilization;
		this.device = device;
		this.reporter = reporter;
		this.notes = notes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getWapName() {
		return wapName;
	}
	public void setWapName(String wapName) {
		this.wapName = wapName;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Double getUpload() {
		return upload;
	}
	public void setUpload(Double upload) {
		this.upload = upload;
	}
	public Double getDownload() {
		return download;
	}
	public void setDownload(Double download) {
		this.download = download;
	}
	public Double getPing() {
		return ping;
	}
	public void setPing(Double ping) {
		this.ping = ping;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Integer getChannel() {
		return channel;
	}
	public void setChannel(Integer channel) {
		this.channel = channel;
	}
	public Integer getRSSI() {
		return RSSI;
	}
	public void setRSSI(Integer rSSI) {
		RSSI = rSSI;
	}
	public Integer getUtilization() {
		return utilization;
	}
	public void setUtilization(Integer utilization) {
		this.utilization = utilization;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
