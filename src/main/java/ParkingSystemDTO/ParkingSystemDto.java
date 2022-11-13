package ParkingSystemDTO;

public class ParkingSystemDto {
	private String parkingAreaNumber;
	private String parking;
	private String disabled;
	
	public ParkingSystemDto(String parkingAreaNumber, String parking, String disabled) {
		super();
		this.parkingAreaNumber = parkingAreaNumber;
		this.parking = parking;
		this.disabled = disabled;
	}
	
	public String getParkingAreaNumber() {
		return parkingAreaNumber;
	}

	public void setParkingAreaNumber(String parkingAreaNumber) {
		this.parkingAreaNumber = parkingAreaNumber;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getDisabled() {
		return disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
}
