/*******************************************************************************
Copyright (c) 2010, 2012 Seonah Lee, SA Lab, KAIST
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html *
Contributors:
Seonah Lee - initial implementation
*******************************************************************************/

package old.data.elements;


import java.util.Comparator;

import navclus.recommendation.data.elements.Element;


public class RankComparator implements Comparator<Element> {

	@Override
	public int compare(Element n1, Element n2) {
		return (n1.getWeight() > n2.getWeight()? 0:1 );
	}

}
