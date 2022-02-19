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
public class Camera implements SelfCheckCapable{

	private String swVersion;
	
	public void getImageSequence() {};
	public void sendImageSecuence() {};

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	};
		
	
	
}
