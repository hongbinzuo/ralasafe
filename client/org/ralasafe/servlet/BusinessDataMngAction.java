/**
 * Copyright (c) 2004-2011 Wang Jinbao(Julian Wong), http://www.ralasafe.com
 * Licensed under the MIT license: http://www.opensource.org/licenses/mit-license.php
 */
package org.ralasafe.servlet;

import org.ralasafe.entitle.BusinessDataManager;

import javax.servlet.http.HttpServletRequest;

public class BusinessDataMngAction extends AbstractTreeAction{
	public AbstractTreeHandler createTreeHandler(HttpServletRequest req){
		BusinessDataManager  manager=WebUtil.getBusinessDataManager(req);
		return new BusinessDataTreeHandler(manager);
	}
}
