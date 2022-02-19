/**
 * 
 */
package edu.fiu.mt.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Manuel Tejada
 *
 */
public class MainChassis implements GenericComponent {
	
	private Computer myComputer;
	private Camera myCamera;
	private ElectricalEngine myElectricalEngine;
	
	public MainChassis() {
		
		myComputer = new Computer();
		myCamera = new Camera();
		myElectricalEngine = new ElectricalEngine();
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "4WD smart car";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalcomponents = new ArrayList();
		Collections.addAll(internalcomponents, myComputer, myCamera, myElectricalEngine );
		return internalcomponents;

	
	}

}
