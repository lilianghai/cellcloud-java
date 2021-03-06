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

package net.cellcloud.http;

/** 错误页内容。
 * 
 * @author Jiangwei Xu
 */
public final class ErrorPages {

	private static String PAGE_404;

	protected ErrorPages() {
	}

	public final static String ERROR_404() {
		return ErrorPages.PAGE_404;
	}

	protected static void build() {
		StringBuilder buf = new StringBuilder();
		buf.append("<!doctype html>\r\n");
		buf.append("<html><head>");
		buf.append("<meta charset=\"utf-8\">");
		buf.append("<title>404 - File or directory not found.</title>");
		buf.append("</head>\r\n<body>");
		buf.append("<h2>404 - File or directory not found.</h2>");
		buf.append("<h3>The resource you are looking for might have been removed, had its name changed, or is temporarily unavailable.</h3>");
		buf.append("<p>Powered by Jetty (Cell Cloud)</p>");
		buf.append("</body></html>\r\n");

		PAGE_404 = buf.toString();

		buf.delete(0, buf.length());
		buf = null;
	}
}
