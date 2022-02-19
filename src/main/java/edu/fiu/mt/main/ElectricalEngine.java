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
public class ElectricalEngine extends ElectronicComponent implements SelfCheckCapable{

	public void getDirection() {};
	public void transferPowertoWheel() {};

	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ElectricalEngine";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	};
		
	
	
}
