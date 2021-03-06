/*******************************************************************************
Copyright (c) 2010, 2012 Seonah Lee, SA Lab, KAIST
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html *
Contributors:
Seonah Lee - initial implementation
*******************************************************************************/

package navclus.userinterface.monitor.selections.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.jdt.core.IJavaElement;

public class SelectionList {

	private Queue<Selection> selectionList;
	private final int N = 5;

	public SelectionList() {
		this.selectionList = new LinkedList<Selection>();
	}

	public SelectionList(LinkedList<Selection> selectionList) {
		this.selectionList = selectionList;
	}

	public boolean add(IJavaElement element) {
		if (this.contain(element) == true) {
			return false;
		}

		Selection selection = new Selection(element);
		selectionList.add(selection);

		if (selectionList.size() > N) {
			selectionList.remove();
		}
		return true;
	}

	public boolean addAll(LinkedList<Selection> list) {
		return selectionList.addAll(list);
	}

	public void clear() {
		selectionList.clear();
	}

	public boolean contain(IJavaElement element) {
		if (element == null) {
			return false;
		}

		for (Selection selection : selectionList) {
			if (element.equals(selection.getElement())) {
				return true;
			}
		}
		return false;
	}

	public LinkedList<IJavaElement> getSelectionElements() {
		LinkedList<IJavaElement> javaList = new LinkedList<IJavaElement>();
		
		for (Selection selection : selectionList) {
			javaList.add(selection.getElement());
		}				
		return javaList;
	}
	
	public LinkedList<Selection> getSelectionList() {
		return (LinkedList<Selection>) selectionList;
	}

	public boolean IsFull() {
		if (selectionList.size() >= N) {
			return true;
		} else {
			return false;
		}
	}

	public Iterator<Selection> iterator() {
		return selectionList.iterator();
	}

	public void print() {
		for (Selection selection : selectionList) {
			System.out.println("-- selection: " + selection.getElement().getElementName());
		}
	}
	
	public void setSelectionList(LinkedList<Selection> selectionList) {
		this.selectionList = selectionList;
	}
	
	public int size() {
		return selectionList.size();
	}

}
