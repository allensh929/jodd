// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd.madvoc.result;

import jodd.madvoc.ActionRequest;

/**
 * None result processing, for direct outputs.
 */
public class NoneResult extends BaseActionResult {
	
	public static final String NAME = "none";
	
	public NoneResult() {
		super(NAME);
	}

	/**
	 * Executes result on given action result value.
	 */
	public void render(ActionRequest actionRequest, Object resultObject, String resultValue, String resultPath) throws Exception {
		// none, direct output
	}
}
