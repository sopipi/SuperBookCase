package entity;
/*
 * cabinetId     | int(11) | NO   | PRI | NULL    |       |
| machineId     | int(11) | YES  | MUL | NULL    |       |
| cabinetStatus | int(11) | YES  |     | NULL    |       |
| size          | int(11)
 */
public class Cabinet {
	private int cabinetId;//格子号
	private int machineId;//机器号
	private int cabinetStatus;//状态
	private int size;//大小
	public Cabinet() {
		super();
	}
	public Cabinet(int cabinetId, int machineId, int cabinetStatus, int size) {
		super();
		this.cabinetId = cabinetId;
		this.machineId = machineId;
		this.cabinetStatus = cabinetStatus;
		this.size = size;
	}
	public int getCabinetId() {
		return cabinetId;
	}
	public void setCabinetId(int cabinetId) {
		this.cabinetId = cabinetId;
	}
	public int getMachineId() {
		return machineId;
	}
	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}
	public int getcabinetStatus() {
		return cabinetStatus;
	}
	public void setcabinetStatus(int cabinetStatus) {
		this.cabinetStatus = cabinetStatus;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Cabinet [cabinetId=" + cabinetId + ", machineId=" + machineId + ", cabinetStatus=" + cabinetStatus
				+ ", size=" + size + "]";
	}
	
}
