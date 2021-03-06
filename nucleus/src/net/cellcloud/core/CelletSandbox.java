/*
-----------------------------------------------------------------------------
This source file is part of Cell Cloud.

Copyright (c) 2009-2012 Cell Cloud Team (www.cellcloud.net)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
-----------------------------------------------------------------------------
*/

package net.cellcloud.core;

import net.cellcloud.exception.CelletSandboxException;

/** Celle 沙箱。
 * 
 * @author Jiangwei Xu
 */
public final class CelletSandbox {

	private Boolean sealed = false;
	protected CelletFeature feature;

	protected CelletSandbox(CelletFeature feature) {
		this.feature = feature;
	}

	/** 封闭沙箱，返回唯一验证码。
	 */
	protected void sealOff(CelletFeature feature)
		throws CelletSandboxException {
		if (this.sealed.booleanValue() || this.feature != feature) {
			throw new CelletSandboxException("Repeat seal off sandbox");
		}

		this.sealed = true;
	}

	protected boolean isSealed() {
		return this.sealed.booleanValue();
	}
}
