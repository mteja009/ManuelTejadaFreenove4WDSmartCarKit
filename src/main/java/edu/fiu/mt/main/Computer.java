/**
 * 
 */
package edu.fiu.mt.main;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Manuel Tejada
 *
 */
public class Computer extends ElectronicComponent implements SelfCheckCapable {

	private String signFromRControlSensor;
	private String signFromSensor;
	private String action;
	private String swVersion;
	
	public void getSignFromSensor() {};
	public void processSensorSign() {};
	public void getImageSequenceFromCamera() {};
	public void processImageSequenceFromCamera() {};
	public void sendActionToEngine() {};
	public void checkObstacle() {};
	public void defineAction() {};
	public void TestComponent() {};
	public void sendCommandToBrake() {};
	public void getSignFromRControlSensor() {};
	
	public void getTimer(){};
	public void calculateDistance(){};
	public void setDistancetoNull() {};
	
	
	public void InstalSW() {};
	public void InstallCameraSW() {};
	public void fileTools() {}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Computer";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	};
	
	
}
