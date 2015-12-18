package cn.mutils.app.ui.web;

import cn.mutils.app.core.IClearable;
import cn.mutils.app.os.IContextProvider;

/**
 * Web message manager of framework
 */
public interface IWebMessageManager extends IContextProvider, IClearable {

	/**
	 * Add web message dispatch template to manager
	 * 
	 * @param dispatcherClass
	 */
	public void add(Class<? extends IWebMessageDispatcher<?>> dispatcherClass);

	/**
	 * Dispatch web message
	 * 
	 * @param message
	 */
	public void dispatchMessage(String message);

	/**
	 * Receive dispatched web message result
	 * 
	 * @param message
	 */
	public void onMessage(String message);

	/**
	 * Get WebFrame
	 * 
	 * @return
	 */
	public IWebFrame getWebFrame();

	/**
	 * Set WebFrame
	 * 
	 * @param webFrame
	 */
	public void setWebFrame(IWebFrame webFrame);

}