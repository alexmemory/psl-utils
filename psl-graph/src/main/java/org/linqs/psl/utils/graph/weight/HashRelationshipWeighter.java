/*
 * This file is part of the PSL software.
 * Copyright 2011-2015 University of Maryland
 * Copyright 2013-2017 The Regents of the University of California
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.linqs.psl.utils.graph.weight;

import java.util.HashMap;
import java.util.Map;

import org.linqs.psl.utils.graph.Relationship;

public class HashRelationshipWeighter implements RelationshipWeighter {
	
	private Map<Relationship, Double> weights;
	
	public HashRelationshipWeighter() {
		weights = new HashMap<Relationship, Double>();
	}

	@Override
	public double getWeight(Relationship r) {
		return weights.get(r);
	}
	
	public void setWeight(Relationship r, Double w) {
		weights.put(r, w);
	}
}
